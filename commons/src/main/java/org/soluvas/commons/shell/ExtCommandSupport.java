package org.soluvas.commons.shell;

import java.io.Closeable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Qualifier;

import org.apache.felix.service.command.CommandSession;
import org.apache.karaf.shell.console.AbstractAction;
import org.soluvas.commons.AppManifest;
import org.soluvas.commons.ShellProgressMonitor;
import org.soluvas.commons.config.MultiTenantWebConfig;
import org.soluvas.commons.impl.ShellProgressMonitorImpl;
import org.soluvas.commons.locale.LocaleContext;
import org.soluvas.commons.tenant.CommandRequestAttributes;
import org.soluvas.commons.tenant.RequestOrCommandScope;
import org.soluvas.commons.tenant.TenantRef;
import org.soluvas.commons.tenant.TenantRefImpl;
import org.soluvas.commons.util.ThreadLocalProgress;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import com.google.common.base.CaseFormat;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;

/**
 * {@link AbstractAction} base class for Blast Shell commands.
 *
 * <p>If {@link #tenantIdRequired}, then {@code clientId} and {@code tenantId} variables must be set,
 * which is initialized by default by {@link SoluvasConsoleFactory#createConsole(java.io.InputStream, java.io.PrintStream, java.io.PrintStream, jline.Terminal, Runnable)}.
 * 
 * @see RequestOrCommandScope
 * @see CommandRequestAttributes
 * @see MultiTenantWebConfig#tenantRef()
 * @see SoluvasConsoleFactory
 * @author ceefour
 */
public abstract class ExtCommandSupport extends AbstractAction {

//	protected static final ThreadLocal<CommandSession> threadCommandSession = new NamedThreadLocal<>("CommandSession");
	/**
	 * @todo Proper locale support.
	 */
	protected static final LocaleContext localeContext = new LocaleContext();
	protected final ShellProgressMonitor monitor = new ShellProgressMonitorImpl();
	@Inject
	protected ApplicationContext appCtx;
	@Inject
	private Environment env;
	@Resource(name="tenantMap")
	private Map<String, AppManifest> tenantMap;
	private final boolean tenantIdRequired;
	
	public ExtCommandSupport() {
		this(true);
	}
	
	/**
	 * @param tenantIdRequired Whether {@link #execute(CommandSession)} will check for session {@code tenantId} value.
	 */
	public ExtCommandSupport(boolean tenantIdRequired) {
		super();
		this.tenantIdRequired = tenantIdRequired;
	}
	
	@Override
	public Object execute(CommandSession session) throws Exception {
		if (tenantIdRequired) {
			// In multitenant environment, we must know the current tenantId which must be set explicitly by SoluvasConsoleFactory
			Preconditions.checkNotNull(session.get("tenantId"),
					"tenantId not set, please set using \"use\" command");
		}
		
		try (final Closeable closeable = CommandRequestAttributes.withSession(session)) {
//			threadCommandSession.set(session);
			try (ThreadLocalProgress progress = new ThreadLocalProgress(monitor)) {
				return super.execute(session);
			}
		} finally {
			// Subclasses usually forget to do this, so we'll do this for them :)
			System.out.flush();
			System.err.flush();
//			threadCommandSession.remove();
		}
	}
	
	/**
	 * Gets the current thread's {@link CommandSession}.
	 * @return
	 * @throws IllegalStateException
	 */
//	public static CommandSession currentCommandSession() throws IllegalStateException {
//		final CommandSession session = threadCommandSession.get();
//		Preconditions.checkState(session != null, "Not in CommandSession");
//		return session;
//	}
	
	/**
	 * Tenant for the currently executing {@link CommandSession}.
	 * @throws IllegalStateException If not executed inside {@link #doExecute()} / {@link CommandSession}.
	 */
	protected TenantRef getTenant() {
		Preconditions.checkState(session != null, "Must be inside CommandSession");
		// TODO: Concept of 'clientId' is currently unused and ambiguous
		final String clientId = (String) Preconditions.checkNotNull(session.get("clientId"),
				"clientId not set, please set using \"use\" command");
		final String tenantId = (String) Preconditions.checkNotNull(session.get("tenantId"),
				"clientId not set, please set using \"use\" command");
		final String tenantEnv = env.getRequiredProperty("tenantEnv");
		return new TenantRefImpl(clientId, tenantId, tenantEnv);
	}
	
	/**
	 * Set the current clientId.
	 * @param clientId
	 * @see #getTenant()
	 * @throws IllegalArgumentException if not a known tenantId in {@code tenantMap}
	 */
	protected void setClientId(String clientId) {
		// TODO: Concept of 'clientId' is currently unused and ambiguous
		Preconditions.checkState(session != null, "Must be inside CommandSession");
		Preconditions.checkArgument(tenantMap.keySet().contains(clientId),
				"Unknown clientId '%s', %s valid tenantIds are: %s",
				clientId, tenantMap.size(), tenantMap.keySet());
		session.put("clientId", clientId);
	}
	
	/**
	 * Set the current tenantId.
	 * @param tenantId
	 * @see #getTenant()
	 * @throws IllegalArgumentException if not a known tenantId in {@code tenantMap}
	 */
	protected void setTenantId(String tenantId) {
		Preconditions.checkState(session != null, "Must be inside CommandSession");
		Preconditions.checkArgument(tenantMap.keySet().contains(tenantId),
				"Unknown tenantId '%s', %s valid tenantIds are: %s",
				tenantId, tenantMap.size(), tenantMap.keySet());
		session.put("tenantId", tenantId);
	}
	
	/**
	 * Return the default-scoped bean of type T, without {@link Qualifier} support.
	 * @param requiredType
	 * @return
	 */
	protected <T> T getBean(Class<T> requiredType) {
		return appCtx.getBean(requiredType);
	}

	/**
	 * Return the tenant-scoped bean of type T, without {@link Qualifier} support.
	 * First it looks up the bean named {@code requiredType + "Map"} which must be a {@link Map}{@literal <String, T>},
	 * then it looks up the key based on {@link TenantRef#getTenantId()} and returns that object. 
	 * The bean name may have string replacements for "Repository" -> "Repo", "Manager" -> "Mgr".
	 * Both the short and long form may be used.
	 * @param requiredType
	 * @return
	 * @deprecated As long as you have a proper {@code ...TenantConfig @Configuration}, you can just use {@link #getBean(Class)}.
	 */
	@Deprecated
	protected <T> T getTenantBean(Class<T> requiredType) {
		final List<String> mapBeanNames = new ArrayList<>();
		final String mapBeanName = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, requiredType.getSimpleName()) + "Map";
		mapBeanNames.add(mapBeanName);
		if (mapBeanName.contains("Repository")) {
			mapBeanNames.add(mapBeanName.replace("Repository", "Repo"));
		}
		if (mapBeanName.contains("Manager")) {
			mapBeanNames.add(mapBeanName.replace("Manager", "Mgr"));
		}
		Map<String, T> mapBean = null;
		for (final String wantedName : mapBeanNames) {
			try {
				mapBean = appCtx.getBean(wantedName, Map.class);
				break;
			} catch (NoSuchBeanDefinitionException e) {
				// bean not found, try next
			}
		}
		final String tenantId = getTenant().getTenantId();
		if (mapBean == null) {
			throw new NoSuchElementException(String.format("Cannot find bean of type Map<String, %s> for tenant '%s' using names: %s",
					requiredType.getName(), tenantId, mapBeanNames));
		}

		final T bean = Preconditions.checkNotNull(mapBean.get(tenantId), "Cannot get %s bean for tenant '%s' from '%s', %s available tenants are: %s",
				requiredType.getName(), tenantId, mapBeanName, mapBean.size(), Iterables.limit(mapBean.keySet(), 10));
		return bean;
	}

	/**
	 * Return all beans of type T, without {@link Qualifier} support.
	 * @param requiredType
	 * @return
	 */
	protected <T> Map<String, T> getBeans(Class<T> requiredType) {
		return appCtx.getBeansOfType(requiredType);
	}

	/**
	 * Return the tenant-scoped bean of type T, with {@link Qualifier} support.
	 * First it looks up the bean named {@code qualifier + requiredType + "Map"} which must be a {@link Map},
	 * then it looks up the key based on {@link TenantRef#getTenantId()} and returns that object. 
	 * @param requiredType
	 * @return
	 */
	protected <T> T getBean(Class<T> requiredType, Class<? extends Annotation> qualifier) {
		// TODO: implement as the Javadoc says
		final Map<String, Object> beans = appCtx.getBeansWithAnnotation(qualifier);
		if (beans.isEmpty()) throw new NoSuchBeanDefinitionException(requiredType, "With qualifier " + qualifier.getName(), "Cannot find bean");
		if (beans.size() > 1) throw new NoUniqueBeanDefinitionException(requiredType, beans.keySet());
		return (T) beans.values().iterator().next();
	}
	
}
