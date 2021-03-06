/**
 */
package org.soluvas.security;

import org.soluvas.commons.Describable;
import org.soluvas.commons.Nameable;
import org.soluvas.commons.ResourceAware;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Can be assigned to a person (security subject) in relation to a domain instance, e.g. "manager" of "zibalabel" "shop".
 * 
 * manager : instance role.
 * zibalabel : instance.
 * shop : domain.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.soluvas.security.DomainRole#getName <em>Name</em>}</li>
 *   <li>{@link org.soluvas.security.DomainRole#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see org.soluvas.security.SecurityPackage#getDomainRole()
 * @model
 * @generated
 */
public interface DomainRole extends ResourceAware, Nameable, Describable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of instance role, e.g. "admin", "sysadmin", "manager", "sales", in lower_underscore format.
	 * 
	 * This corresponds directly to entries in ou=groups in LDAP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.soluvas.security.SecurityPackage#getDomainRole_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.soluvas.security.DomainRole#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Domain where this role applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see org.soluvas.security.SecurityPackage#getDomainRole_Domain()
	 * @model required="true"
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link org.soluvas.security.DomainRole#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

} // DomainRole
