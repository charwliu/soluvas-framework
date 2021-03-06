/**
 */
package org.soluvas.email;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.soluvas.email.Recipient#getEmail <em>Email</em>}</li>
 *   <li>{@link org.soluvas.email.Recipient#getName <em>Name</em>}</li>
 *   <li>{@link org.soluvas.email.Recipient#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.soluvas.email.Recipient#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.soluvas.email.Recipient#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link org.soluvas.email.Recipient#getPreferredFormat <em>Preferred Format</em>}</li>
 *   <li>{@link org.soluvas.email.Recipient#getPreferredWebSecurity <em>Preferred Web Security</em>}</li>
 * </ul>
 *
 * @see org.soluvas.email.EmailPackage#getRecipient()
 * @model
 * @generated
 */
public interface Recipient extends EObject {
	
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.soluvas.email.EmailPackage#getRecipient_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.soluvas.email.Recipient#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.soluvas.email.EmailPackage#getRecipient_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.soluvas.email.Recipient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see org.soluvas.email.EmailPackage#getRecipient_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.soluvas.email.Recipient#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see org.soluvas.email.EmailPackage#getRecipient_LastName()
	 * @model
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link org.soluvas.email.Recipient#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Preferred Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.soluvas.email.EmailFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Format</em>' attribute.
	 * @see org.soluvas.email.EmailFormat
	 * @see #setPreferredFormat(EmailFormat)
	 * @see org.soluvas.email.EmailPackage#getRecipient_PreferredFormat()
	 * @model
	 * @generated
	 */
	EmailFormat getPreferredFormat();

	/**
	 * Sets the value of the '{@link org.soluvas.email.Recipient#getPreferredFormat <em>Preferred Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Format</em>' attribute.
	 * @see org.soluvas.email.EmailFormat
	 * @see #getPreferredFormat()
	 * @generated
	 */
	void setPreferredFormat(EmailFormat value);

	/**
	 * Returns the value of the '<em><b>Preferred Web Security</b></em>' attribute.
	 * The literals are from the enumeration {@link org.soluvas.email.WebSecurity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Web Security</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Web Security</em>' attribute.
	 * @see org.soluvas.email.WebSecurity
	 * @see #setPreferredWebSecurity(WebSecurity)
	 * @see org.soluvas.email.EmailPackage#getRecipient_PreferredWebSecurity()
	 * @model
	 * @generated
	 */
	WebSecurity getPreferredWebSecurity();

	/**
	 * Sets the value of the '{@link org.soluvas.email.Recipient#getPreferredWebSecurity <em>Preferred Web Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Web Security</em>' attribute.
	 * @see org.soluvas.email.WebSecurity
	 * @see #getPreferredWebSecurity()
	 * @generated
	 */
	void setPreferredWebSecurity(WebSecurity value);

	/**
	 * Returns the value of the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Role e.g. "administrator", "sales staff for O Batiks".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Name</em>' attribute.
	 * @see #setRoleName(String)
	 * @see org.soluvas.email.EmailPackage#getRecipient_RoleName()
	 * @model
	 * @generated
	 */
	String getRoleName();

	/**
	 * Sets the value of the '{@link org.soluvas.email.Recipient#getRoleName <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Name</em>' attribute.
	 * @see #getRoleName()
	 * @generated
	 */
	void setRoleName(String value);

} // Recipient
