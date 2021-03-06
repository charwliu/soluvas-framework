package org.soluvas.jaxrs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Nonnull;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.UriInfo;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.tenant.TenantRef;
import org.soluvas.commons.tenant.TenantRefImpl;

/**
 * @author ceefour
 * @deprecated single-tenant for now
 */
@Deprecated
public class JaxrsUtils {
	
	private static final Logger log = LoggerFactory.getLogger(JaxrsUtils.class);
	private static final BundleContext bundleContext = FrameworkUtil.getBundle(JaxrsUtils.class).getBundleContext();
	
	/**
	 * Use {@code @Context UriInfo uriInfo} in JAX-RS.
	 * @deprecated single-tenant for now
	 * @return
	 */
	@Deprecated
	public static TenantRef getTenant(@Nonnull final UriInfo uriInfo) {
		final String pathInfo = uriInfo.getBaseUri().getPath();
		return getTenant(pathInfo);
	}

	/**
	 * Use {@code @Context HttpServletRequest httpReq} in JAX-RS.
	 * @deprecated single-tenant for now
	 * @return
	 */
	@Deprecated
	public static TenantRef getTenant(@Nonnull final HttpServletRequest httpReq) {
		final String pathInfo = httpReq.getPathInfo();
		return getTenant(pathInfo);
	}

	/**
	 * @param pathInfo
	 * @deprecated single-tenant for now
	 * @return
	 */
	@Deprecated
	public static TenantRef getTenant(@Nonnull final String pathInfo) {
		final Pattern apiPathPattern = Pattern.compile(".*\\/api\\/(.+)_([^_/]+).*");
		final Matcher apiPathMatcher = apiPathPattern.matcher(pathInfo);
		if (!apiPathMatcher.matches()) {
			log.warn("REST path {} does not conform to multitenant REST API pattern", pathInfo);
			return null;
		}
		final TenantRef tenantRef = new TenantRefImpl(null, apiPathMatcher.group(1),
				apiPathMatcher.group(2));
		log.trace("REST path {} is for {}", pathInfo, tenantRef);
		return tenantRef;
	}
	
}
