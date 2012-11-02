package org.soluvas.commons;

import java.net.URL;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.BundleTrackerCustomizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

/**
 * Tracks files named <tt>(bundle).SecurityCatalog.xmi</tt> and registers
 * them as {@link SecurityCatalog} {@link Supplier}.
 * 
 * Usage:
 * 
 * <pre>{@code
 * <bean id="securityCatalogXmiTracker" class="org.soluvas.security.SecurityCatalogXmiTracker">
 * 	<argument value="berbatik" />
 * 	<argument value="dev" />
 * </bean>
 * <bean class="org.osgi.util.tracker.BundleTracker" init-method="open" destroy-method="close">
 * 	<argument ref="blueprintBundleContext" />
 * 	<argument value="32" />
 * 	<argument ref="securityCatalogXmiTracker" />
 * </bean>
 * }</pre>
 * 
 * @author ceefour
 */
@SuppressWarnings("rawtypes")
public class XmiTracker implements BundleTrackerCustomizer<List<ServiceRegistration<Supplier>>> {

	private transient Logger log = LoggerFactory
			.getLogger(XmiTracker.class);
	private final String tenantId;
	private final String tenantEnv;
	private final EPackage ePackage;
	private final Class<?> suppliedClass;
	
	public XmiTracker(final @Nonnull EPackage ePackage, final @Nonnull Class<?> suppliedClass,
			@Nonnull String tenantId, @Nonnull String tenantEnv) {
		super();
		this.ePackage = ePackage;
		this.suppliedClass = suppliedClass;
		this.tenantId = tenantId;
		this.tenantEnv = tenantEnv;
	}

	@Override
	@Nullable
	public List<ServiceRegistration<Supplier>> addingBundle(@Nonnull Bundle bundle,
			@Nonnull BundleEvent event) {
		String path = bundle.getSymbolicName().replace('.', '/');
		String filePattern = "*." + suppliedClass.getSimpleName() + ".xmi";
		log.trace("Scanning {} [{}] for {}/{}", bundle.getSymbolicName(), bundle.getBundleId(),
				path , filePattern);
		Enumeration<URL> entries = bundle.findEntries(path, filePattern, false);
		if (entries == null) {
			return null;
		}
		Builder<ServiceRegistration<Supplier>> svcRegs = ImmutableList.builder();
		while (entries.hasMoreElements()) {
			URL url = entries.nextElement();
			log.debug("Registering SecurityCatalog for {} from {}", suppliedClass.getName(), url);
			XmiObjectLoader<EObject> loader = new XmiObjectLoader<EObject>(ePackage, url,
					ResourceType.BUNDLE);
			Dictionary<String, String> props = new Hashtable<String, String>();
			props.put("suppliedClass", suppliedClass.getName());
			props.put("layer", "module");
			props.put("tenantId", tenantId);
			props.put("tenantEnv", tenantEnv);
			ServiceRegistration<Supplier> svcReg = bundle.getBundleContext()
					.registerService(Supplier.class, loader, props);
			svcRegs.add(svcReg);
		}
		final List<ServiceRegistration<Supplier>> svcRegList = svcRegs.build();
		log.info("Registered {} SecurityCatalog suppliers from {} [{}]",
				svcRegList.size(), bundle.getSymbolicName(), bundle.getBundleId());
		return svcRegList;
	}

	@Override
	public void modifiedBundle(@Nonnull Bundle bundle, @Nonnull BundleEvent event,
			@Nullable List<ServiceRegistration<Supplier>> object) {
	}

	@Override
	public void removedBundle(@Nonnull Bundle bundle, @Nonnull BundleEvent event,
			@Nullable List<ServiceRegistration<Supplier>> svcRegs) {
		if (svcRegs == null)
			return;
		log.debug("Unregistering {} SecurityCatalog suppliers from {} [{}]",
				svcRegs.size(), bundle.getSymbolicName(), bundle.getBundleId());
		for (ServiceRegistration<Supplier> svcReg : svcRegs) {
			try {
				svcReg.unregister();
			} catch (Exception e) {
				log.warn("Cannot unregister {} from {} [{}]", svcReg,
						bundle.getSymbolicName(), bundle.getBundleId());
			}
		}
		log.info("Unregistered {} SecurityCatalog suppliers from {} [{}]",
				svcRegs.size(), bundle.getSymbolicName(), bundle.getBundleId());
	}

}