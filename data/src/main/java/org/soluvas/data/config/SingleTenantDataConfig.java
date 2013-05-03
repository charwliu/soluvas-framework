package org.soluvas.data.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.AggregatingSupplier;
import org.soluvas.commons.DataFolder;
import org.soluvas.commons.SupplierXmiClasspathScanner;
import org.soluvas.data.DataCatalog;
import org.soluvas.data.DataFactory;
import org.soluvas.data.DataPackage;
import org.soluvas.data.MixinManager;
import org.soluvas.data.TermChanged;
import org.soluvas.data.TermManager;
import org.soluvas.data.impl.MixinManagerImpl;
import org.soluvas.data.impl.TermManagerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 * @author rudi
 *
 */
@Configuration @Lazy
@ComponentScan("org.soluvas.data.shell")
public class SingleTenantDataConfig {
	
	private static final Logger log = LoggerFactory
			.getLogger(SingleTenantDataConfig.class);
	@Inject @DataFolder
	private String dataFolder;
	@Inject
	private EventBus eventBus;
	
	@Bean
	public AggregatingSupplier<DataCatalog> dataCatalogSupplier() {
		final AggregatingSupplier<DataCatalog> aggregator = new AggregatingSupplier<DataCatalog>(DataFactory.eINSTANCE,
				DataPackage.Literals.DATA_CATALOG, ImmutableList.<Supplier<DataCatalog>>of());
		final SupplierXmiClasspathScanner<DataCatalog> scanner = new SupplierXmiClasspathScanner<DataCatalog>(DataPackage.eINSTANCE, DataCatalog.class,
				aggregator, SingleTenantDataConfig.class.getClassLoader(), dataFolder);
		return aggregator;
	}
	
//	@Bean @Lazy(false)
//	public SupplierXmiClasspathScanner<DataCatalog> builtinDataCatalogsScanner() {
//		return new SupplierXmiClasspathScanner<DataCatalog>(DataPackage.eINSTANCE, DataCatalog.class,
//				dataCatalogSupplier(), DataConfig.class);
//	}
	
	@Bean
	public DataCatalog dataCatalog() {
		return dataCatalogSupplier().get();
	}

	@Bean
	public MixinManager mixinMgr() {
		return new MixinManagerImpl(dataCatalog());
	}
	
	@Bean
	public TermManager termMgr() {
		return new TermManagerImpl(dataCatalog());
	}
	
	@PostConstruct
	public void registerSubscriber() {
		eventBus.register(this);
	}
	
	@PreDestroy
	public void unregisterSubscriber() {
		if (eventBus != null) {
			eventBus.unregister(this);
		}
	}
	
	@Subscribe
	public void reloadDataCatalog(TermChanged ev) {
		log.info("Reloading aggregated DataCatalog due to {}", ev);
		dataCatalogSupplier().reload();
	}
	
}
