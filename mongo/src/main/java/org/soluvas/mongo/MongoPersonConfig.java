package org.soluvas.mongo;

import javax.inject.Inject;

import org.soluvas.commons.AppManifest;
import org.soluvas.commons.MongoSysConfig;
import org.soluvas.commons.PersonRelated;
import org.soluvas.commons.config.SysConfigMapHolder;
import org.soluvas.commons.tenant.TenantBeans;
import org.soluvas.data.person.PersonCustomerRoleHistoryRepository;
import org.soluvas.data.person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

/**
 * @author ceefour
 */
@Configuration
@ComponentScan("org.soluvas.data.person.shell")
public class MongoPersonConfig implements PersonConfig {
	
	@Inject
	private Environment env;
	@Inject
	private SysConfigMapHolder<? extends MongoSysConfig> sysConfigMapHolder;
	@Autowired(required = false)
	private CacheManager cacheMgr;

	@Override
	@Bean(destroyMethod="destroy")
	public TenantBeans<PersonRepository> personRepoBeans() {
		final boolean mongoMigrationEnabled = env.getProperty("mongoMigrationEnabled", Boolean.class, true);
		final boolean mongoAutoExplainSlow = env.getProperty("mongoAutoExplainSlow", Boolean.class, false);
		return new TenantBeans<PersonRepository>(MongoPersonRepository.class) {
			@Override
			protected MongoPersonRepository create(String tenantId, AppManifest appManifest) throws Exception {
				final MongoSysConfig sysConfig = sysConfigMapHolder.sysConfigMap().get(tenantId);
				final String mongoUri = sysConfig.getMongoUri();
				final MongoPersonRepository personRepo = new MongoPersonRepository(tenantId, cacheMgr, mongoUri, mongoMigrationEnabled, mongoAutoExplainSlow);
				return personRepo;
			}
		};
	}
	
	@Bean(name={"personRepo", "personLookup"}) @PersonRelated @Scope("prototype")
	public PersonRepository personRepo() {
		return personRepoBeans().getCurrent();
	}
	
	@Override
	@Bean(destroyMethod = "destroy")
	public TenantBeans<PersonCustomerRoleHistoryRepository> personCustomerRoleHistoryRepoBeans(){
		final boolean mongoMigrationEnabled = env.getProperty("mongoMigrationEnabled",Boolean.class, true);
		final boolean mongoAutoExplainSlow = env.getProperty("mongoAutoExplainSlow", Boolean.class, false);
		return new TenantBeans<PersonCustomerRoleHistoryRepository>(MongoPersonCustomerRoleHistoryRepository.class) {
			@Override
			protected MongoPersonCustomerRoleHistoryRepository create(String tenantId, AppManifest appManifest) throws Exception {
				final MongoSysConfig sysConfig = sysConfigMapHolder.sysConfigMap().get(tenantId);
				final String mongoUri = sysConfig.getMongoUri();
				final MongoPersonCustomerRoleHistoryRepository personCustomerRoleHistoryRepo = new MongoPersonCustomerRoleHistoryRepository(mongoUri, mongoMigrationEnabled, mongoAutoExplainSlow);
				return personCustomerRoleHistoryRepo;
			}
		};
	}
	
	@Bean(name={"personCustomerRoleHistoryRepo"}) @Scope("prototype")
	public PersonCustomerRoleHistoryRepository personCustomerRoleHistoryRepo() {
		return personCustomerRoleHistoryRepoBeans().getCurrent();
	} 

}
