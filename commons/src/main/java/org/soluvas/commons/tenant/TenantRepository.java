package org.soluvas.commons.tenant;

import java.util.Set;

import javax.annotation.Nullable;

import org.soluvas.commons.AppManifest;

import com.google.common.collect.ImmutableMap;
import com.google.common.eventbus.EventBus;

/**
 * Dynamic tenant repository. Tenants can be added or removed at anytime,
 * and notifications will be sent via app {@link EventBus}.
 * <p>Note: Unfortunately we can't use {@link org.soluvas.data.repository.PagingAndSortingRepository} from
 * {@code soluvas.commons} :(
 * @author ceefour
 * @see DirectoryTenantRepository
 */
public interface TenantRepository<T extends ProvisionData> {
	
	/**
	 * Returns a map of tenant information (key=tenantId).
	 * @return
	 */
	ImmutableMap<String, AppManifest> findAll();
	
	/**
	 * Creates a blank {@link AppManifest} object, which may be pre-customized to the app.
	 * @return
	 */
	AppManifest newBlank();
	
	/**
	 * Creates a blank provisionData.
	 * @return
	 */
	T newProvisionData();
	
	/**
	 * Sets up a new tenant and activates it.
	 * @param tenantId
	 * @param appManifest
	 * @param provisionData TODO
	 * @param trackingId TODO
	 * @return
	 * @throws IllegalStateException if {@code tenantWhitelist} is used
	 */
	AppManifest add(String tenantId, AppManifest appManifest, T provisionData, String trackingId);

	/**
	 * Shuts down a tenant, modifies it then restarts it.
	 * @param tenantId
	 * @param appManifest
	 * @return
	 */
	AppManifest modify(String tenantId, AppManifest appManifest);

	/**
	 * Deletes a tenant permanently.
	 * @param tenantId
	 * @param appManifest
	 * @return
	 * @throws IllegalStateException if {@code tenantWhitelist} is used
	 */
	boolean delete(String tenantId);
	
	/**
	 * Internal command to start the specified tenants.
	 * Already started tenants will be ignored.
	 * 
	 * @param tenantIds
	 * @throws IllegalArgumentException if any tenantId is not found
	 */
	void start(Set<String> tenantIds);
	
	/**
	 * Internal command to stop the specified tenants.
	 * Already stopped tenants will be ignored.
	 * 
	 * @param tenantIds
	 * @throws IllegalArgumentException if any tenantId is not found
	 */
	void stop(Set<String> tenantIds);
	
	void addListener(TenantRepositoryListener listener);

	ImmutableMap<String, TenantState> getStates();
	
	public AppManifest lookupOne(@Nullable String tenantId) throws IllegalArgumentException;

}
