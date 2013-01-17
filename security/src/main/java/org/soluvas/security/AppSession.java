/**
 */
package org.soluvas.security;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Nullable;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.SimpleSession;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.Identifiable;
import org.soluvas.commons.PersonInfo;
import org.soluvas.commons.SchemaVersionable;
import org.soluvas.commons.Timestamped;
import org.soluvas.security.impl.AppSessionImpl;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.collect.Maps;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OAuth app session.
 * 
 * id is used as the accessToken.
 * 
 * See: https://sites.google.com/a/bippo.co.id/dev/berbatik/oauth
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.soluvas.security.AppSession#getPerson <em>Person</em>}</li>
 *   <li>{@link org.soluvas.security.AppSession#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link org.soluvas.security.AppSession#getStatus <em>Status</em>}</li>
 *   <li>{@link org.soluvas.security.AppSession#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link org.soluvas.security.AppSession#getIpv6Address <em>Ipv6 Address</em>}</li>
 *   <li>{@link org.soluvas.security.AppSession#getIpAddresses <em>Ip Addresses</em>}</li>
 *   <li>{@link org.soluvas.security.AppSession#getIpv6Addresses <em>Ipv6 Addresses</em>}</li>
 *   <li>{@link org.soluvas.security.AppSession#getUserAgent <em>User Agent</em>}</li>
 *   <li>{@link org.soluvas.security.AppSession#getUserAgents <em>User Agents</em>}</li>
 *   <li>{@link org.soluvas.security.AppSession#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.soluvas.security.AppSession#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.soluvas.security.AppSession#getAccessTime <em>Access Time</em>}</li>
 *   <li>{@link org.soluvas.security.AppSession#getExpiryTime <em>Expiry Time</em>}</li>
 *   <li>{@link org.soluvas.security.AppSession#getTimeZone <em>Time Zone</em>}</li>
 *   <li>{@link org.soluvas.security.AppSession#getLocale <em>Locale</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soluvas.security.SecurityPackage#getAppSession()
 * @model
 * @generated
 */
@JsonDeserialize(as=AppSessionImpl.class)
public interface AppSession extends Identifiable, Timestamped, SchemaVersionable {
	
	public class FromSession implements Function<Session, AppSession> {
		private static final Logger log = LoggerFactory
				.getLogger(AppSession.FromSession.class);
		
		@Override @Nullable
		public AppSession apply(@Nullable Session input) {
			final AppSession appSession = SecurityFactory.eINSTANCE.createAppSession();
			appSession.setId((String) input.getId());
			appSession.setIpAddress(input.getHost());
//			appSession.getIpAddresses().add(input.getHost());
			appSession.setCreationTime(new DateTime(input.getStartTimestamp()));
			appSession.setAccessTime(new DateTime(input.getLastAccessTime()));
			appSession.setTimeout(input.getTimeout());
			appSession.setExpiryTime(new DateTime(input.getLastAccessTime()).plus(input.getTimeout()));
			for (final Object key : input.getAttributeKeys()) {
				final Object value = input.getAttribute(key);
//				if (value instanceof Serializable && !(value instanceof Class)) {
				if (value instanceof String) {
					appSession.getAttributes().put((String) key, value);
				} else {
					final ByteArrayOutputStream out = new ByteArrayOutputStream();
					try {
						new ObjectOutputStream(out).writeObject(value);
						appSession.getAttributes().put((String) key, out.toString(Charsets.UTF_8.name()));
					} catch (IOException e) {
						throw new SecurityException(e, "Cannot put in AppSession unserializable session %s attribute %s=%s",
								input.getId(), key, value);
					}
//					log.warn("Cannot put in AppSession unserializable session {} attribute {}={}",
//							input.getId(), key, value);
				}
			}
			return appSession;
		}
	}
	
	public class ToSession implements Function<AppSession, Session> {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		@Override @Nullable
		public Session apply(@Nullable AppSession input) {
			final SimpleSession session = new SimpleSession(input.getIpAddress());
			session.setId(input.getId());
			session.setStartTimestamp(input.getCreationTime().toDate());
			session.setLastAccessTime(input.getAccessTime().toDate());
			session.setTimeout(input.getTimeout());
			// can't use ImmutableMap here!
			session.setAttributes(Maps.newHashMap((Map) input.getAttributes().map()));
			return session;
		}
	}
	
	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(PersonInfo)
	 * @see org.soluvas.security.SecurityPackage#getAppSession_Person()
	 * @model
	 * @generated
	 */
	PersonInfo getPerson();

	/**
	 * Sets the value of the '{@link org.soluvas.security.AppSession#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(PersonInfo value);

	/**
	 * Returns the value of the '<em><b>Schema Version</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Version</em>' attribute.
	 * @see #setSchemaVersion(long)
	 * @see org.soluvas.security.SecurityPackage#getAppSession_SchemaVersion()
	 * @model default="2"
	 * @generated
	 */
	@Override
	long getSchemaVersion();

	/**
	 * Sets the value of the '{@link org.soluvas.security.AppSession#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Version</em>' attribute.
	 * @see #getSchemaVersion()
	 * @generated
	 */
	void setSchemaVersion(long value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.soluvas.security.AppSessionStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.soluvas.security.AppSessionStatus
	 * @see #setStatus(AppSessionStatus)
	 * @see org.soluvas.security.SecurityPackage#getAppSession_Status()
	 * @model
	 * @generated
	 */
	AppSessionStatus getStatus();

	/**
	 * Sets the value of the '{@link org.soluvas.security.AppSession#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.soluvas.security.AppSessionStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(AppSessionStatus value);

	/**
	 * Returns the value of the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IPv4 Address during initial sign in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip Address</em>' attribute.
	 * @see #setIpAddress(String)
	 * @see org.soluvas.security.SecurityPackage#getAppSession_IpAddress()
	 * @model
	 * @generated
	 */
	String getIpAddress();

	/**
	 * Sets the value of the '{@link org.soluvas.security.AppSession#getIpAddress <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Address</em>' attribute.
	 * @see #getIpAddress()
	 * @generated
	 */
	void setIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Ipv6 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IPv6 address during initial sign in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ipv6 Address</em>' attribute.
	 * @see #setIpv6Address(String)
	 * @see org.soluvas.security.SecurityPackage#getAppSession_Ipv6Address()
	 * @model
	 * @generated
	 */
	String getIpv6Address();

	/**
	 * Sets the value of the '{@link org.soluvas.security.AppSession#getIpv6Address <em>Ipv6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipv6 Address</em>' attribute.
	 * @see #getIpv6Address()
	 * @generated
	 */
	void setIpv6Address(String value);

	/**
	 * Returns the value of the '<em><b>Ip Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IPv4 Addresses used during the whole session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip Addresses</em>' attribute list.
	 * @see org.soluvas.security.SecurityPackage#getAppSession_IpAddresses()
	 * @model
	 * @generated
	 */
	EList<String> getIpAddresses();

	/**
	 * Returns the value of the '<em><b>Ipv6 Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IPv6 Addresses used during the whole session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ipv6 Addresses</em>' attribute list.
	 * @see org.soluvas.security.SecurityPackage#getAppSession_Ipv6Addresses()
	 * @model
	 * @generated
	 */
	EList<String> getIpv6Addresses();

	/**
	 * Returns the value of the '<em><b>User Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Agent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Agent</em>' attribute.
	 * @see #setUserAgent(String)
	 * @see org.soluvas.security.SecurityPackage#getAppSession_UserAgent()
	 * @model
	 * @generated
	 */
	String getUserAgent();

	/**
	 * Sets the value of the '{@link org.soluvas.security.AppSession#getUserAgent <em>User Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Agent</em>' attribute.
	 * @see #getUserAgent()
	 * @generated
	 */
	void setUserAgent(String value);

	/**
	 * Returns the value of the '<em><b>User Agents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTTP user agents used during the whole session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Agents</em>' attribute.
	 * @see #setUserAgents(List)
	 * @see org.soluvas.security.SecurityPackage#getAppSession_UserAgents()
	 * @model dataType="org.soluvas.commons.List" many="false"
	 * @generated
	 */
	List getUserAgents();

	/**
	 * Sets the value of the '{@link org.soluvas.security.AppSession#getUserAgents <em>User Agents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Agents</em>' attribute.
	 * @see #getUserAgents()
	 * @generated
	 */
	void setUserAgents(List value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Object},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' map.
	 * @see org.soluvas.security.SecurityPackage#getAppSession_Attributes()
	 * @model mapType="org.soluvas.security.AppSessionAttributeEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EJavaObject>"
	 * @generated
	 */
	EMap<String, Object> getAttributes();

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the time in milliseconds that the session may remain idle before expiring.
	 * <ul>
	 *  <li>A negative value means the session will never expire.</li>
	 *  <li>A non-negative value (0 or greater) means the session expiration will occur if idle for that
	 *  length of time.</li>
	 * </ul>
	 * <p/>
	 * <b>*Note:</b> if you are used to the {@code HttpSession}'s {@code getMaxInactiveInterval()} method, the scale on
	 * this method is different: Shiro Sessions use millisecond values for timeout whereas
	 * {@code HttpSession.getMaxInactiveInterval} uses seconds.  Always use millisecond values with Shiro sessions.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(Long)
	 * @see org.soluvas.security.SecurityPackage#getAppSession_Timeout()
	 * @model
	 * @generated
	 */
	Long getTimeout();

	/**
	 * Sets the value of the '{@link org.soluvas.security.AppSession#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(Long value);

	/**
	 * Returns the value of the '<em><b>Access Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the last time the application received a request or method invocation from the user associated with this session.
	 * Application calls to this method do not affect this access time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Time</em>' attribute.
	 * @see #setAccessTime(DateTime)
	 * @see org.soluvas.security.SecurityPackage#getAppSession_AccessTime()
	 * @model dataType="org.soluvas.commons.DateTime"
	 * @generated
	 */
	DateTime getAccessTime();

	/**
	 * Sets the value of the '{@link org.soluvas.security.AppSession#getAccessTime <em>Access Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Time</em>' attribute.
	 * @see #getAccessTime()
	 * @generated
	 */
	void setAccessTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Expiry Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the time that the session will expire (if it remains idle).
	 * 
	 * If there is activity, expiryTime may be extended.
	 * 
	 * @see {@link getAccessTime()}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiry Time</em>' attribute.
	 * @see #setExpiryTime(DateTime)
	 * @see org.soluvas.security.SecurityPackage#getAppSession_ExpiryTime()
	 * @model dataType="org.soluvas.commons.DateTime"
	 * @generated
	 */
	DateTime getExpiryTime();

	/**
	 * Sets the value of the '{@link org.soluvas.security.AppSession#getExpiryTime <em>Expiry Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Time</em>' attribute.
	 * @see #getExpiryTime()
	 * @generated
	 */
	void setExpiryTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Zone</em>' attribute.
	 * @see #setTimeZone(DateTimeZone)
	 * @see org.soluvas.security.SecurityPackage#getAppSession_TimeZone()
	 * @model dataType="org.soluvas.commons.DateTimeZone"
	 * @generated
	 */
	DateTimeZone getTimeZone();

	/**
	 * Sets the value of the '{@link org.soluvas.security.AppSession#getTimeZone <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Zone</em>' attribute.
	 * @see #getTimeZone()
	 * @generated
	 */
	void setTimeZone(DateTimeZone value);

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale</em>' attribute.
	 * @see #setLocale(Locale)
	 * @see org.soluvas.security.SecurityPackage#getAppSession_Locale()
	 * @model dataType="org.soluvas.commons.Locale"
	 * @generated
	 */
	Locale getLocale();

	/**
	 * Sets the value of the '{@link org.soluvas.security.AppSession#getLocale <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale</em>' attribute.
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(Locale value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.soluvas.security.Session"
	 * @generated
	 */
	Session toSession();

} // AppSession