package org.soluvas.security.couchdb;

import java.net.MalformedURLException;
import java.net.URI;

import javax.annotation.Nullable;
import javax.annotation.PreDestroy;

import org.apache.http.conn.ClientConnectionManager;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.HostAuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.ldap.AbstractLdapRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.ektorp.CouchDbConnector;
import org.ektorp.ViewQuery;
import org.ektorp.ViewResult;
import org.ektorp.ViewResult.Row;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.entity.Person2;
import org.soluvas.security.*;
import org.soluvas.security.impl.RealmUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;

/**
 * A realm implementation that uses LDAP repository.
 * 
 * It does not extend {@link AbstractLdapRealm} (it uses Apache Directory API).
 * 
 * @author ceefour
 */
public class CouchDbRealm extends AuthorizingRealm {

	private static final Logger log = LoggerFactory.getLogger(CouchDbRealm.class);

	private final Supplier<SecurityCatalog> securityCatalogSupplier;
	@Nullable
	private final RolePersonRepository rolePersonRepo;
	private final CouchDbConnector conn;

	private final HttpClient httpClient;
	
	/**
	 * Constructs a CouchDb {@link Realm} without {@link RolePersonRepository} support,
	 * meaning you won't be able to assign tenant {@link Role}s to {@link Person2}s.
	 * @param connMgr
	 * @param name
	 * @param securityCatalogSupplier
	 * @param uri
	 * @param db
	 * @throws MalformedURLException
	 */
	public CouchDbRealm(ClientConnectionManager connMgr, String name, Supplier<SecurityCatalog> securityCatalogSupplier,
			final String uri, final String db) throws MalformedURLException {
		super();
		this.securityCatalogSupplier = securityCatalogSupplier;
		this.rolePersonRepo = null;
		this.httpClient = null;
		// WARNING: couchDbUri may contain password!
		final URI realCouchDbUri = URI.create(uri);
		final String username = realCouchDbUri.getUserInfo() != null ? realCouchDbUri.getUserInfo().split(":")[0] : null;
		log.info("Creating CouchDB connector {}:{}{} database {} as {} for realm {}",
				realCouchDbUri.getHost(), realCouchDbUri.getPort(), realCouchDbUri.getPath(), db, username, name);
		try {
			final long connectStart = System.currentTimeMillis();
			final HttpClient httpClient = new StdHttpClient.Builder()
					.url(uri)
					.connectionTimeout(60 * 1000) // workaround for Cloudant: https://quikdo.atlassian.net/browse/HUB-36
					.socketTimeout(60 * 1000) // workaround for Cloudant: https://quikdo.atlassian.net/browse/HUB-36
					.connectionManager(connMgr)
					.build();
			final StdCouchDbInstance stdCouchDbInstance = new StdCouchDbInstance(httpClient);
			final StdCouchDbConnector cDbCon = new StdCouchDbConnector(db, stdCouchDbInstance);
			final long connectDuration = System.currentTimeMillis() - connectStart;
			log.info("Connected in {}ms to CouchDB connector {}:{}{} database {} as {} for realm {}",
					connectDuration, realCouchDbUri.getHost(), realCouchDbUri.getPort(), realCouchDbUri.getPath(), db, username, name);
			cDbCon.createDatabaseIfNotExists();
			this.conn = cDbCon;
			setName(name);
			setCredentialsMatcher(new Rfc2307CredentialsMatcher());
			setAuthenticationTokenClass(HostAuthenticationToken.class);
		} catch (Exception e) {
			throw new org.soluvas.security.SecurityException(e, "Cannot create CouchDB connector %s:%s%s database %s as %s for realm %s: %s",
					realCouchDbUri.getHost(), realCouchDbUri.getPort(), realCouchDbUri.getPath(), db, username, name, e);
		}
	}
	
	/**
	 * Constructs a CouchDb {@link Realm} with {@link RolePersonRepository} support,
	 * so you can assign tenant {@link Role}s to {@link Person2}s via {@link Person2#getSecurityRoleIds()}.
	 * 
	 * @param connMgr
	 * @param name
	 * @param securityCatalogSupplier
	 * @param rolePersonRepo
	 * @param uri
	 * @param db
	 * @throws MalformedURLException
	 */
	public CouchDbRealm(ClientConnectionManager connMgr, String name, Supplier<SecurityCatalog> securityCatalogSupplier, RolePersonRepository rolePersonRepo,
			final String uri, final String db) throws MalformedURLException {
		super();
		this.securityCatalogSupplier = securityCatalogSupplier;
		this.rolePersonRepo = rolePersonRepo;
		this.httpClient = null;
		// WARNING: couchDbUri may contain password!
		final URI realCouchDbUri = URI.create(uri);
		final String username = realCouchDbUri.getUserInfo() != null ? realCouchDbUri.getUserInfo().split(":")[0] : null;
		log.info("Creating CouchDB connector {}:{}{} database {} as {} for realm {}",
				realCouchDbUri.getHost(), realCouchDbUri.getPort(), realCouchDbUri.getPath(), db, username, name);
		final long connectStart = System.currentTimeMillis();
		try {
			final HttpClient httpClient = new StdHttpClient.Builder()
                .url(uri)
                .connectionTimeout(60 * 1000) // workaround for Cloudant: https://quikdo.atlassian.net/browse/HUB-36
                .socketTimeout(60 * 1000) // workaround for Cloudant: https://quikdo.atlassian.net/browse/HUB-36
                .connectionManager(connMgr)
                .build();
			final StdCouchDbInstance stdCouchDbInstance = new StdCouchDbInstance(httpClient);
			final StdCouchDbConnector cDbCon = new StdCouchDbConnector(db, stdCouchDbInstance);
			cDbCon.createDatabaseIfNotExists();
			final long connectDuration = System.currentTimeMillis() - connectStart;
			log.info("Ensured database exists in {}ms to CouchDB connector {}:{}{} database {} as {} for realm {}",
                    connectDuration, realCouchDbUri.getHost(), realCouchDbUri.getPort(), realCouchDbUri.getPath(), db, username, name);
			this.conn = cDbCon;
			setName(name);
			setCredentialsMatcher(new Rfc2307CredentialsMatcher());
			setAuthenticationTokenClass(HostAuthenticationToken.class);
		} catch (Exception e) {
			throw new org.soluvas.security.SecurityException(e, "Cannot create CouchDB connector %s:%s%s database %s as %s for realm %s: %s",
					realCouchDbUri.getHost(), realCouchDbUri.getPort(), realCouchDbUri.getPath(), db, username, name, e);
		}
	}
	
	@PreDestroy
	public void destroy() {
		if (httpClient != null) {
			httpClient.shutdown();
		}
	}
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			final PrincipalCollection principalCollection) {
		final SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		if (rolePersonRepo != null) {
			log.trace("Using RolePersonRepository {} to assign AuthorizationInfo for principals: {}",
					rolePersonRepo, Iterables.transform(principalCollection, new Function<Object, String>() {
						@Override
						public String apply(Object input) {
							return input.toString();
						};
					}));
			RealmUtils.modifyAuthInfo(getName(), info, principalCollection, rolePersonRepo, securityCatalogSupplier.get());
		} else {
			log.trace("Assigning AuthorizationInfo WITHOUT stored roles for principals: {}",
					rolePersonRepo, Iterables.transform(principalCollection, new Function<Object, String>() {
						@Override
						public String apply(Object input) {
							return input.toString();
						};
					}));
			RealmUtils.modifyAuthInfo(info, principalCollection, ImmutableSet.<String>of(), securityCatalogSupplier.get());
		}
		return info;
	}

	/**
	 * Checks if the {@link HostAuthenticationToken#getHost()} matches {@link #getName()},
	 * then returns a {@link SimpleAuthenticationInfo} based on the principal
	 * (username).
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		final String host = token instanceof HostAuthenticationToken ? ((HostAuthenticationToken) token).getHost() : null;
		if (!getName().equals(host)) {
			log.debug("[{}] Host mismatch, expected '{}', token requests '{}'."
					+ " If you use multiple realms, one realm should match the host while others mismatch."
					+ " If all mismatch, you have a misconfiguration.", getName(), getName(), host);
			throw new UnknownAccountException("[" + getName() + "] Host mismatch, expected '" + getName() + "', token requests '" + host + "'."
					+ " If you use multiple realms, one realm should match the host while others mismatch."
					+ " If all mismatch, you have a misconfiguration.");
		}
		
		try {
			if (token instanceof UsernamePasswordToken) {
				// Key can be either person ID or email
				final String tokenKey = ((UsernamePasswordToken) token).getUsername();
				final ViewQuery query = new ViewQuery()
					.designDocId("_design/Person")
			        .viewName("password")
			        .key(tokenKey)
					.reduce(false);
				
				final ViewResult matched = conn.queryView(query);
				if (!matched.isEmpty()) {
					final Row firstRow = matched.iterator().next();
					final JsonNode node = firstRow.getValueAsNode();
					final String personId = node.get("uid").asText();
					final String userPassword = node.get("password").asText();
					log.info("Matched {} user(s) for principal {} realm {}, personId={}", 
							matched.getSize(), tokenKey, getName(), personId);
					return new SimpleAuthenticationInfo(personId, userPassword, null, getName());
				} else {
					log.debug("No matching user for principal {} realm {}", tokenKey, getName());
					return new SimpleAuthenticationInfo();
				}			
			} else if (token instanceof AutologinToken) {
				log.debug("AuthenticationInfo for {} is using AutologinToken", token.getPrincipal());
				final String personId = (String) token.getPrincipal();
				return new SimpleAuthenticationInfo(personId, null, getName());
			} else {
				throw new UnsupportedTokenException("Unsupported AuthenticationToken: "
						+ token.getClass() + " using " + token.getPrincipal());
			}
		} catch (RuntimeException e) {
			// Un-swallow non-AuthenticationException exceptions
			Throwables.propagateIfInstanceOf(e, AuthenticationException.class);
			log.error("Error authenticating against CouchDB realm '" + getName() + "': " + e, e);
			throw e;
		}
	}
}
