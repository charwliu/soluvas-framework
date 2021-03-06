/**
 */
package org.soluvas.image;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>S3 Connector</b></em>'.
 *
 * <p>Note: The aws-java-sdk-s3 dependency is optional, to use this you must add it to your project:
 *
 * <pre>{@literal
 * 	<dependency>
 * 	    <groupId>com.amazonaws</groupId>
 * 	    <artifactId>aws-java-sdk-s3</artifactId>
 * 	</dependency>
 * }</pre>
 *
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Store images using Amazon S3 or S3 API-compatible servers such as Ceph, Parkplace, Boardwalk. fakes3 is not working due to it creating folders, not actually storing files.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.soluvas.image.S3Connector#getCanonicalUserId <em>Canonical User Id</em>}</li>
 *   <li>{@link org.soluvas.image.S3Connector#getBucket <em>Bucket</em>}</li>
 *   <li>{@link org.soluvas.image.S3Connector#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link org.soluvas.image.S3Connector#getTenantEnv <em>Tenant Env</em>}</li>
 *   <li>{@link org.soluvas.image.S3Connector#getOriginAlias <em>Origin Alias</em>}</li>
 *   <li>{@link org.soluvas.image.S3Connector#getCdnAlias <em>Cdn Alias</em>}</li>
 * </ul>
 *
 * @see org.soluvas.image.ImagePackage#getS3Connector()
 * @model
 * @generated NOT
 */
public interface S3Connector extends ImageConnector {

	/**
	 * Returns the value of the '<em><b>Canonical User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canonical User Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canonical User Id</em>' attribute.
	 * @see org.soluvas.image.ImagePackage#getS3Connector_CanonicalUserId()
	 * @model changeable="false"
	 * @generated
	 */
	String getCanonicalUserId();

	/**
	 * Returns the value of the '<em><b>Bucket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket</em>' attribute.
	 * @see org.soluvas.image.ImagePackage#getS3Connector_Bucket()
	 * @model changeable="false"
	 * @generated
	 */
	String getBucket();

	/**
	 * Returns the value of the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant Id</em>' attribute.
	 * @see org.soluvas.image.ImagePackage#getS3Connector_TenantId()
	 * @model changeable="false"
	 * @generated
	 */
	String getTenantId();

	/**
	 * Returns the value of the '<em><b>Tenant Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant Env</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant Env</em>' attribute.
	 * @see org.soluvas.image.ImagePackage#getS3Connector_TenantEnv()
	 * @model changeable="false"
	 * @generated
	 */
	String getTenantEnv();

	/**
	 * Returns the value of the '<em><b>Origin Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Alias</em>' attribute.
	 * @see org.soluvas.image.ImagePackage#getS3Connector_OriginAlias()
	 * @model changeable="false"
	 * @generated
	 */
	String getOriginAlias();

	/**
	 * Returns the value of the '<em><b>Cdn Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdn Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdn Alias</em>' attribute.
	 * @see org.soluvas.image.ImagePackage#getS3Connector_CdnAlias()
	 * @model changeable="false"
	 * @generated
	 */
	String getCdnAlias();
} // S3Connector
