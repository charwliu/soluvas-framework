package org.soluvas.mongo;

import org.soluvas.commons.tenant.TenantBeans;
import org.soluvas.data.person.PersonCustomerRoleHistoryRepository;
import org.soluvas.data.person.PersonRepository;

/**
 * @author ceefour
 * @see MongoPersonConfig
 */
public interface PersonConfig {

	TenantBeans<PersonRepository> personRepoBeans();

	TenantBeans<PersonCustomerRoleHistoryRepository> personCustomerRoleHistoryRepoBeans();
	
}
