/**
 */
package org.soluvas.commons;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.soluvas.commons.CommonsFactory
 * @model kind="package"
 * @generated
 */
public interface CommonsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commons";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.soluvas.org/schema/commons/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "commons";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonsPackage eINSTANCE = org.soluvas.commons.impl.CommonsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.soluvas.commons.ResourceAware <em>Resource Aware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.ResourceAware
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getResourceAware()
	 * @generated
	 */
	int RESOURCE_AWARE = 0;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AWARE__RESOURCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Resource Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AWARE__RESOURCE_URI = 1;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AWARE__RESOURCE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Resource Aware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AWARE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.Positionable <em>Positionable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Positionable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPositionable()
	 * @generated
	 */
	int POSITIONABLE = 1;

	/**
	 * The feature id for the '<em><b>Positioner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE__POSITIONER = 0;

	/**
	 * The number of structural features of the '<em>Positionable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.AppManifestImpl <em>App Manifest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.AppManifestImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getAppManifest()
	 * @generated
	 */
	int APP_MANIFEST = 2;

	/**
	 * The feature id for the '<em><b>Positioner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__POSITIONER = POSITIONABLE__POSITIONER;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__RESOURCE_TYPE = POSITIONABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__RESOURCE_URI = POSITIONABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__RESOURCE_NAME = POSITIONABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__BUNDLE = POSITIONABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expansion State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__EXPANSION_STATE = POSITIONABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__TITLE = POSITIONABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__SUMMARY = POSITIONABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__DESCRIPTION = POSITIONABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__DOMAIN = POSITIONABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Domain Prd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__DOMAIN_PRD = POSITIONABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Domain Dev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__DOMAIN_DEV = POSITIONABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Domain Stg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__DOMAIN_STG = POSITIONABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>General Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__GENERAL_EMAIL = POSITIONABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>General Email Prd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__GENERAL_EMAIL_PRD = POSITIONABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>General Email Dev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__GENERAL_EMAIL_DEV = POSITIONABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>General Email Stg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__GENERAL_EMAIL_STG = POSITIONABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Organization Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__ORGANIZATION_NAME = POSITIONABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Organization Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__ORGANIZATION_ADDRESS = POSITIONABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Organization Phone Numbers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__ORGANIZATION_PHONE_NUMBERS = POSITIONABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Default Time Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__DEFAULT_TIME_ZONE_ID = POSITIONABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Default Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__DEFAULT_TIME_ZONE = POSITIONABLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Default Currency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__DEFAULT_CURRENCY_CODE = POSITIONABLE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Default Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__DEFAULT_CURRENCY = POSITIONABLE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Default Language Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__DEFAULT_LANGUAGE_TAG = POSITIONABLE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Default Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__DEFAULT_COUNTRY_CODE = POSITIONABLE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Default Category UName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__DEFAULT_CATEGORY_UNAME = POSITIONABLE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Email Logo Uri Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__EMAIL_LOGO_URI_TEMPLATE = POSITIONABLE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Letter Salutation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__LETTER_SALUTATION = POSITIONABLE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Letter Closing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__LETTER_CLOSING = POSITIONABLE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Footnote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__FOOTNOTE = POSITIONABLE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Www Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__WWW_USED = POSITIONABLE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Head Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__HEAD_NOTE = POSITIONABLE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Head Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__HEAD_TITLE = POSITIONABLE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Default Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__DEFAULT_STYLE = POSITIONABLE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Default Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__DEFAULT_VARIATION = POSITIONABLE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Kurs Dollar Paypal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__KURS_DOLLAR_PAYPAL = POSITIONABLE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Kurs Dollar Dpex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__KURS_DOLLAR_DPEX = POSITIONABLE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Reminder Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__REMINDER_SCHEDULE = POSITIONABLE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Reminder Period Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__REMINDER_PERIOD_STR = POSITIONABLE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Reminder Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__REMINDER_PERIOD = POSITIONABLE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Reminder Schedule Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__REMINDER_SCHEDULE_STR = POSITIONABLE_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Support Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__SUPPORT_EMAIL = POSITIONABLE_FEATURE_COUNT + 41;

	/**
	 * The number of structural features of the '<em>App Manifest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST_FEATURE_COUNT = POSITIONABLE_FEATURE_COUNT + 42;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.Identifiable <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Identifiable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.PersonInfoImpl <em>Person Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.PersonInfoImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPersonInfo()
	 * @generated
	 */
	int PERSON_INFO = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Photo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO__PHOTO_ID = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO__SLUG = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO__NAME = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO__GENDER = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO__EMAIL = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mobile Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO__MOBILE_NUMBER = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Person Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.Timestamped <em>Timestamped</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Timestamped
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTimestamped()
	 * @generated
	 */
	int TIMESTAMPED = 4;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMPED__CREATION_TIME = 0;

	/**
	 * The feature id for the '<em><b>Modification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMPED__MODIFICATION_TIME = 1;

	/**
	 * The number of structural features of the '<em>Timestamped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMPED_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.Sluggable <em>Sluggable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Sluggable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getSluggable()
	 * @generated
	 */
	int SLUGGABLE = 6;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLUGGABLE__SLUG = 0;

	/**
	 * The number of structural features of the '<em>Sluggable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLUGGABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.Nameable <em>Nameable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Nameable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getNameable()
	 * @generated
	 */
	int NAMEABLE = 7;

	/**
	 * The number of structural features of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.Imageable <em>Imageable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Imageable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getImageable()
	 * @generated
	 */
	int IMAGEABLE = 8;

	/**
	 * The number of structural features of the '<em>Imageable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.PhotoIdContainerImpl <em>Photo Id Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.PhotoIdContainerImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPhotoIdContainer()
	 * @generated
	 */
	int PHOTO_ID_CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>Photo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_ID_CONTAINER__PHOTO_ID = IMAGEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Photo Id Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_ID_CONTAINER_FEATURE_COUNT = IMAGEABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.NameContainer <em>Name Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.NameContainer
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getNameContainer()
	 * @generated
	 */
	int NAME_CONTAINER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CONTAINER__NAME = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CONTAINER_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.Informer <em>Informer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Informer
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getInformer()
	 * @generated
	 */
	int INFORMER = 11;

	/**
	 * The number of structural features of the '<em>Informer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.Describable <em>Describable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Describable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getDescribable()
	 * @generated
	 */
	int DESCRIBABLE = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Describable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.BundleAware <em>Bundle Aware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.BundleAware
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getBundleAware()
	 * @generated
	 */
	int BUNDLE_AWARE = 13;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_AWARE__BUNDLE = 0;

	/**
	 * The number of structural features of the '<em>Bundle Aware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_AWARE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.JavaClassLinked <em>Java Class Linked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.JavaClassLinked
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getJavaClassLinked()
	 * @generated
	 */
	int JAVA_CLASS_LINKED = 14;

	/**
	 * The feature id for the '<em><b>Java Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_LINKED__JAVA_CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_LINKED__JAVA_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Java Class Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_LINKED__JAVA_CLASS_STATUS = 2;

	/**
	 * The number of structural features of the '<em>Java Class Linked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_LINKED_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.EClassLinked <em>EClass Linked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.EClassLinked
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEClassLinked()
	 * @generated
	 */
	int ECLASS_LINKED = 15;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_LINKED__ECLASS = 0;

	/**
	 * The feature id for the '<em><b>EClass Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_LINKED__ECLASS_STATUS = 1;

	/**
	 * The feature id for the '<em><b>EPackage Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_LINKED__EPACKAGE_NS_PREFIX = 2;

	/**
	 * The feature id for the '<em><b>EClass Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_LINKED__ECLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>EPackage Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_LINKED__EPACKAGE_NAME = 4;

	/**
	 * The number of structural features of the '<em>EClass Linked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_LINKED_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.SchemaVersionable <em>Schema Versionable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.SchemaVersionable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getSchemaVersionable()
	 * @generated
	 */
	int SCHEMA_VERSIONABLE = 16;

	/**
	 * The number of structural features of the '<em>Schema Versionable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_VERSIONABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.EFactoryLinked <em>EFactory Linked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.EFactoryLinked
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEFactoryLinked()
	 * @generated
	 */
	int EFACTORY_LINKED = 17;

	/**
	 * The feature id for the '<em><b>EFactory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY_LINKED__EFACTORY = 0;

	/**
	 * The number of structural features of the '<em>EFactory Linked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY_LINKED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.NsPrefixable <em>Ns Prefixable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.NsPrefixable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getNsPrefixable()
	 * @generated
	 */
	int NS_PREFIXABLE = 18;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NS_PREFIXABLE__NS_PREFIX = 0;

	/**
	 * The number of structural features of the '<em>Ns Prefixable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NS_PREFIXABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.WebAddressImpl <em>Web Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.WebAddressImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getWebAddress()
	 * @generated
	 */
	int WEB_ADDRESS = 19;

	/**
	 * The feature id for the '<em><b>Positioner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__POSITIONER = POSITIONABLE__POSITIONER;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__BUNDLE = POSITIONABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__RESOURCE_TYPE = POSITIONABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__RESOURCE_URI = POSITIONABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__RESOURCE_NAME = POSITIONABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expansion State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__EXPANSION_STATE = POSITIONABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Base Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__BASE_URI = POSITIONABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__BASE_PATH = POSITIONABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Api Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__API_PATH = POSITIONABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Images Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__IMAGES_URI = POSITIONABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Skin Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__SKIN_URI = POSITIONABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Js Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__JS_URI = POSITIONABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Secure Base Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__SECURE_BASE_URI = POSITIONABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Secure Images Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__SECURE_IMAGES_URI = POSITIONABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Secure Skin Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__SECURE_SKIN_URI = POSITIONABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Secure Js Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__SECURE_JS_URI = POSITIONABLE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Web Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS_FEATURE_COUNT = POSITIONABLE_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.EObjectLinked <em>EObject Linked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.EObjectLinked
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEObjectLinked()
	 * @generated
	 */
	int EOBJECT_LINKED = 30;

	/**
	 * The number of structural features of the '<em>EObject Linked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_LINKED_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.ModelNotificationImpl <em>Model Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.ModelNotificationImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getModelNotification()
	 * @generated
	 */
	int MODEL_NOTIFICATION = 21;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NOTIFICATION__CONTAINER = EOBJECT_LINKED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NOTIFICATION_FEATURE_COUNT = EOBJECT_LINKED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.ObjectNotificationImpl <em>Object Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.ObjectNotificationImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getObjectNotification()
	 * @generated
	 */
	int OBJECT_NOTIFICATION = 25;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NOTIFICATION__CONTAINER = MODEL_NOTIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NOTIFICATION__OBJECT = MODEL_NOTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NOTIFICATION_FEATURE_COUNT = MODEL_NOTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.AddedImpl <em>Added</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.AddedImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getAdded()
	 * @generated
	 */
	int ADDED = 20;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDED__CONTAINER = OBJECT_NOTIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDED__OBJECT = OBJECT_NOTIFICATION__OBJECT;

	/**
	 * The number of structural features of the '<em>Added</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDED_FEATURE_COUNT = OBJECT_NOTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.AttributeNotificationImpl <em>Attribute Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.AttributeNotificationImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getAttributeNotification()
	 * @generated
	 */
	int ATTRIBUTE_NOTIFICATION = 26;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOTIFICATION__CONTAINER = MODEL_NOTIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOTIFICATION__ATTRIBUTE = MODEL_NOTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOTIFICATION__OBJECT = MODEL_NOTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOTIFICATION__OLD_VALUE = MODEL_NOTIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOTIFICATION__NEW_VALUE = MODEL_NOTIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOTIFICATION_FEATURE_COUNT = MODEL_NOTIFICATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.AttributeSetImpl <em>Attribute Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.AttributeSetImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getAttributeSet()
	 * @generated
	 */
	int ATTRIBUTE_SET = 22;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SET__CONTAINER = ATTRIBUTE_NOTIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SET__ATTRIBUTE = ATTRIBUTE_NOTIFICATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SET__OBJECT = ATTRIBUTE_NOTIFICATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SET__OLD_VALUE = ATTRIBUTE_NOTIFICATION__OLD_VALUE;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SET__NEW_VALUE = ATTRIBUTE_NOTIFICATION__NEW_VALUE;

	/**
	 * The feature id for the '<em><b>Principals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SET__PRINCIPALS = ATTRIBUTE_NOTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SET_FEATURE_COUNT = ATTRIBUTE_NOTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.AttributeUnsetImpl <em>Attribute Unset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.AttributeUnsetImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getAttributeUnset()
	 * @generated
	 */
	int ATTRIBUTE_UNSET = 23;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_UNSET__CONTAINER = ATTRIBUTE_NOTIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_UNSET__ATTRIBUTE = ATTRIBUTE_NOTIFICATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_UNSET__OBJECT = ATTRIBUTE_NOTIFICATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_UNSET__OLD_VALUE = ATTRIBUTE_NOTIFICATION__OLD_VALUE;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_UNSET__NEW_VALUE = ATTRIBUTE_NOTIFICATION__NEW_VALUE;

	/**
	 * The number of structural features of the '<em>Attribute Unset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_UNSET_FEATURE_COUNT = ATTRIBUTE_NOTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.RemovedImpl <em>Removed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.RemovedImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getRemoved()
	 * @generated
	 */
	int REMOVED = 24;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED__CONTAINER = OBJECT_NOTIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED__OBJECT = OBJECT_NOTIFICATION__OBJECT;

	/**
	 * The number of structural features of the '<em>Removed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_FEATURE_COUNT = OBJECT_NOTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.ObjectsNotificationImpl <em>Objects Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.ObjectsNotificationImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getObjectsNotification()
	 * @generated
	 */
	int OBJECTS_NOTIFICATION = 29;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTS_NOTIFICATION__CONTAINER = MODEL_NOTIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTS_NOTIFICATION__OBJECTS = MODEL_NOTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Objects Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTS_NOTIFICATION_FEATURE_COUNT = MODEL_NOTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.AddedManyImpl <em>Added Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.AddedManyImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getAddedMany()
	 * @generated
	 */
	int ADDED_MANY = 27;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDED_MANY__CONTAINER = OBJECTS_NOTIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDED_MANY__OBJECTS = OBJECTS_NOTIFICATION__OBJECTS;

	/**
	 * The number of structural features of the '<em>Added Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDED_MANY_FEATURE_COUNT = OBJECTS_NOTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.RemovedManyImpl <em>Removed Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.RemovedManyImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getRemovedMany()
	 * @generated
	 */
	int REMOVED_MANY = 28;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_MANY__CONTAINER = OBJECTS_NOTIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_MANY__OBJECTS = OBJECTS_NOTIFICATION__OBJECTS;

	/**
	 * The number of structural features of the '<em>Removed Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_MANY_FEATURE_COUNT = OBJECTS_NOTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.Parentable <em>Parentable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Parentable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getParentable()
	 * @generated
	 */
	int PARENTABLE = 31;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTABLE__PARENT = 0;

	/**
	 * The number of structural features of the '<em>Parentable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.CategoryLike <em>Category Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.CategoryLike
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getCategoryLike()
	 * @generated
	 */
	int CATEGORY_LIKE = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_LIKE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_LIKE__NS_PREFIX = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_LIKE__NAME = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Positioner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_LIKE__POSITIONER = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_LIKE__SLUG = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Slug Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_LIKE__SLUG_PATH = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_LIKE__COLOR = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_LIKE__IMAGE_ID = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_LIKE__LEVEL = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Category Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_LIKE__CATEGORY_COUNT = IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Category Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_LIKE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.CategoryInfoImpl <em>Category Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.CategoryInfoImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getCategoryInfo()
	 * @generated
	 */
	int CATEGORY_INFO = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__ID = CATEGORY_LIKE__ID;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__NS_PREFIX = CATEGORY_LIKE__NS_PREFIX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__NAME = CATEGORY_LIKE__NAME;

	/**
	 * The feature id for the '<em><b>Positioner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__POSITIONER = CATEGORY_LIKE__POSITIONER;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__SLUG = CATEGORY_LIKE__SLUG;

	/**
	 * The feature id for the '<em><b>Slug Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__SLUG_PATH = CATEGORY_LIKE__SLUG_PATH;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__COLOR = CATEGORY_LIKE__COLOR;

	/**
	 * The feature id for the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__IMAGE_ID = CATEGORY_LIKE__IMAGE_ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__LEVEL = CATEGORY_LIKE__LEVEL;

	/**
	 * The feature id for the '<em><b>Category Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__CATEGORY_COUNT = CATEGORY_LIKE__CATEGORY_COUNT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__PARENT = CATEGORY_LIKE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Translation State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__TRANSLATION_STATE = CATEGORY_LIKE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Original Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__ORIGINAL_LANGUAGE = CATEGORY_LIKE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__LANGUAGE = CATEGORY_LIKE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__TRANSLATIONS = CATEGORY_LIKE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__PARENTS = CATEGORY_LIKE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Primary Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__PRIMARY_URI = CATEGORY_LIKE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Google Formal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO__GOOGLE_FORMAL_ID = CATEGORY_LIKE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Category Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_INFO_FEATURE_COUNT = CATEGORY_LIKE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.ProgressMonitorImpl <em>Progress Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.ProgressMonitorImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getProgressMonitor()
	 * @generated
	 */
	int PROGRESS_MONITOR = 34;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_MONITOR__CANCELED = 0;

	/**
	 * The feature id for the '<em><b>Task Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_MONITOR__TASK_NAME = 1;

	/**
	 * The number of structural features of the '<em>Progress Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_MONITOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.ShellProgressMonitorImpl <em>Shell Progress Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.ShellProgressMonitorImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getShellProgressMonitor()
	 * @generated
	 */
	int SHELL_PROGRESS_MONITOR = 35;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PROGRESS_MONITOR__CANCELED = PROGRESS_MONITOR__CANCELED;

	/**
	 * The feature id for the '<em><b>Task Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PROGRESS_MONITOR__TASK_NAME = PROGRESS_MONITOR__TASK_NAME;

	/**
	 * The number of structural features of the '<em>Shell Progress Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PROGRESS_MONITOR_FEATURE_COUNT = PROGRESS_MONITOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.EventBusProgressMonitorImpl <em>Event Bus Progress Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.EventBusProgressMonitorImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEventBusProgressMonitor()
	 * @generated
	 */
	int EVENT_BUS_PROGRESS_MONITOR = 36;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BUS_PROGRESS_MONITOR__CANCELED = PROGRESS_MONITOR__CANCELED;

	/**
	 * The feature id for the '<em><b>Task Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BUS_PROGRESS_MONITOR__TASK_NAME = PROGRESS_MONITOR__TASK_NAME;

	/**
	 * The feature id for the '<em><b>Event Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BUS_PROGRESS_MONITOR__EVENT_BUS = PROGRESS_MONITOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tracking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BUS_PROGRESS_MONITOR__TRACKING_ID = PROGRESS_MONITOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Bus Progress Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BUS_PROGRESS_MONITOR_FEATURE_COUNT = PROGRESS_MONITOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.ProgressMonitorWrapperImpl <em>Progress Monitor Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.ProgressMonitorWrapperImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getProgressMonitorWrapper()
	 * @generated
	 */
	int PROGRESS_MONITOR_WRAPPER = 37;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_MONITOR_WRAPPER__CANCELED = PROGRESS_MONITOR__CANCELED;

	/**
	 * The feature id for the '<em><b>Task Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_MONITOR_WRAPPER__TASK_NAME = PROGRESS_MONITOR__TASK_NAME;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_MONITOR_WRAPPER__DELEGATE = PROGRESS_MONITOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Progress Monitor Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_MONITOR_WRAPPER_FEATURE_COUNT = PROGRESS_MONITOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.Colorable <em>Colorable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Colorable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getColorable()
	 * @generated
	 */
	int COLORABLE = 38;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORABLE__COLOR = 0;

	/**
	 * The number of structural features of the '<em>Colorable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.Translatable <em>Translatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Translatable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTranslatable()
	 * @generated
	 */
	int TRANSLATABLE = 39;

	/**
	 * The feature id for the '<em><b>Translation State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATABLE__TRANSLATION_STATE = 0;

	/**
	 * The feature id for the '<em><b>Original Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATABLE__ORIGINAL_LANGUAGE = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATABLE__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATABLE__TRANSLATIONS = 3;

	/**
	 * The number of structural features of the '<em>Translatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.TranslationImpl <em>Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.TranslationImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTranslation()
	 * @generated
	 */
	int TRANSLATION = 40;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__MESSAGES = 1;

	/**
	 * The number of structural features of the '<em>Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.TranslationMessageEntryImpl <em>Translation Message Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.TranslationMessageEntryImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTranslationMessageEntry()
	 * @generated
	 */
	int TRANSLATION_MESSAGE_ENTRY = 41;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_MESSAGE_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_MESSAGE_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Translation Message Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_MESSAGE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.TranslationManagerImpl <em>Translation Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.TranslationManagerImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTranslationManager()
	 * @generated
	 */
	int TRANSLATION_MANAGER = 42;

	/**
	 * The number of structural features of the '<em>Translation Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.TranslationEntryImpl <em>Translation Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.TranslationEntryImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTranslationEntry()
	 * @generated
	 */
	int TRANSLATION_ENTRY = 43;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_ENTRY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_ENTRY__KEY = 1;

	/**
	 * The number of structural features of the '<em>Translation Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.StyleConfiguration <em>Style Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.StyleConfiguration
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getStyleConfiguration()
	 * @generated
	 */
	int STYLE_CONFIGURATION = 44;

	/**
	 * The number of structural features of the '<em>Style Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.Expandable <em>Expandable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Expandable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getExpandable()
	 * @generated
	 */
	int EXPANDABLE = 45;

	/**
	 * The feature id for the '<em><b>Expansion State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDABLE__EXPANSION_STATE = 0;

	/**
	 * The number of structural features of the '<em>Expandable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.PersonLike <em>Person Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.PersonLike
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPersonLike()
	 * @generated
	 */
	int PERSON_LIKE = 46;

	/**
	 * The number of structural features of the '<em>Person Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_LIKE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.PersonImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = NAME_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Photo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PHOTO_ID = NAME_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = NAME_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREATION_TIME = NAME_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MODIFICATION_TIME = NAME_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DESCRIPTION = NAME_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SLUG = NAME_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Canonical Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CANONICAL_SLUG = NAME_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Twitter Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TWITTER_ACCESS_TOKEN = NAME_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Twitter Access Token Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TWITTER_ACCESS_TOKEN_SECRET = NAME_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Twitter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TWITTER_ID = NAME_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Twitter Screen Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TWITTER_SCREEN_NAME = NAME_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Facebook Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FACEBOOK_ID = NAME_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Facebook Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FACEBOOK_USERNAME = NAME_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Facebook Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FACEBOOK_ACCESS_TOKEN = NAME_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GUID = NAME_CONTAINER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__REVISION = NAME_CONTAINER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SCHEMA_VERSION = NAME_CONTAINER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = NAME_CONTAINER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = NAME_CONTAINER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PASSWORD = NAME_CONTAINER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Phone Numbers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PHONE_NUMBERS = NAME_CONTAINER_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Emails</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAILS = NAME_CONTAINER_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Mobile Numbers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MOBILE_NUMBERS = NAME_CONTAINER_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ADDRESSES = NAME_CONTAINER_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Account Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ACCOUNT_STATUS = NAME_CONTAINER_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Birth Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTH_YEAR = NAME_CONTAINER_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Birth Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTH_MONTH = NAME_CONTAINER_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Birth Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTH_DAY = NAME_CONTAINER_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTH_DATE = NAME_CONTAINER_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENDER = NAME_CONTAINER_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LANGUAGE = NAME_CONTAINER_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Currency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CURRENCY_CODE = NAME_CONTAINER_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CURRENCY = NAME_CONTAINER_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Google Plus Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GOOGLE_PLUS_ID = NAME_CONTAINER_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Google Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GOOGLE_USERNAME = NAME_CONTAINER_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Virtual Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__VIRTUAL_MAIL = NAME_CONTAINER_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NICKNAME = NAME_CONTAINER_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Customer Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CUSTOMER_ROLE = NAME_CONTAINER_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Member Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MEMBER_ROLE = NAME_CONTAINER_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Manager Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MANAGER_ROLE = NAME_CONTAINER_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Time Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TIME_ZONE_ID = NAME_CONTAINER_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TIME_ZONE = NAME_CONTAINER_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Referrer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__REFERRER_ID = NAME_CONTAINER_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Referrer Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__REFERRER_TYPE = NAME_CONTAINER_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Signup Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SIGNUP_SOURCE = NAME_CONTAINER_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Signup Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SIGNUP_SOURCE_TYPE = NAME_CONTAINER_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IP_ADDRESS = NAME_CONTAINER_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Last Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_IP_ADDRESS = NAME_CONTAINER_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Last Login Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_LOGIN_TIME = NAME_CONTAINER_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Validation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__VALIDATION_TIME = NAME_CONTAINER_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Activation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ACTIVATION_TIME = NAME_CONTAINER_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>Verification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__VERIFICATION_TIME = NAME_CONTAINER_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>Newsletter Subscription Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NEWSLETTER_SUBSCRIPTION_ENABLED = NAME_CONTAINER_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>Newsletter Subscription Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NEWSLETTER_SUBSCRIPTION_TIME = NAME_CONTAINER_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>Social Sharing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SOCIAL_SHARING_ENABLED = NAME_CONTAINER_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>Publication Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PUBLICATION_STATUS = NAME_CONTAINER_FEATURE_COUNT + 55;

	/**
	 * The feature id for the '<em><b>Archival Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ARCHIVAL_STATUS = NAME_CONTAINER_FEATURE_COUNT + 56;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FOLDER = NAME_CONTAINER_FEATURE_COUNT + 57;

	/**
	 * The feature id for the '<em><b>Religion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__RELIGION = NAME_CONTAINER_FEATURE_COUNT + 58;

	/**
	 * The feature id for the '<em><b>Password Reset Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PASSWORD_RESET_CODE = NAME_CONTAINER_FEATURE_COUNT + 59;

	/**
	 * The feature id for the '<em><b>Password Reset Expiry Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PASSWORD_RESET_EXPIRY_TIME = NAME_CONTAINER_FEATURE_COUNT + 60;

	/**
	 * The feature id for the '<em><b>Client Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CLIENT_ACCESS_TOKEN = NAME_CONTAINER_FEATURE_COUNT + 61;

	/**
	 * The feature id for the '<em><b>Security Role Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SECURITY_ROLE_IDS = NAME_CONTAINER_FEATURE_COUNT + 62;

	/**
	 * The feature id for the '<em><b>Debit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DEBIT_BALANCE = NAME_CONTAINER_FEATURE_COUNT + 63;

	/**
	 * The feature id for the '<em><b>Debit Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DEBIT_CURRENCY = NAME_CONTAINER_FEATURE_COUNT + 64;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TYPE = NAME_CONTAINER_FEATURE_COUNT + 65;

	/**
	 * The feature id for the '<em><b>Verify Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__VERIFY_CODE = NAME_CONTAINER_FEATURE_COUNT + 66;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ORGANIZATIONS = NAME_CONTAINER_FEATURE_COUNT + 67;

	/**
	 * The feature id for the '<em><b>Zendesk User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ZENDESK_USER_ID = NAME_CONTAINER_FEATURE_COUNT + 68;

	/**
	 * The feature id for the '<em><b>Customer Role Edit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CUSTOMER_ROLE_EDIT_TIME = NAME_CONTAINER_FEATURE_COUNT + 69;

	/**
	 * The feature id for the '<em><b>Last Time Synchronize With Zendesk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_TIME_SYNCHRONIZE_WITH_ZENDESK = NAME_CONTAINER_FEATURE_COUNT + 70;

	/**
	 * The feature id for the '<em><b>Zendesk Integration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ZENDESK_INTEGRATION = NAME_CONTAINER_FEATURE_COUNT + 71;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = NAME_CONTAINER_FEATURE_COUNT + 72;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.PhoneNumberImpl <em>Phone Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.PhoneNumberImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPhoneNumber()
	 * @generated
	 */
	int PHONE_NUMBER = 48;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_NUMBER__PHONE_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_NUMBER__PRIMARY = 1;

	/**
	 * The feature id for the '<em><b>Validation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_NUMBER__VALIDATION_TIME = 2;

	/**
	 * The number of structural features of the '<em>Phone Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_NUMBER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.EmailImpl <em>Email</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.EmailImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEmail()
	 * @generated
	 */
	int EMAIL = 49;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__EMAIL = 0;

	/**
	 * The feature id for the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__PRIMARY = 1;

	/**
	 * The feature id for the '<em><b>Validation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__VALIDATION_TIME = 2;

	/**
	 * The number of structural features of the '<em>Email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.PostalAddressImpl <em>Postal Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.PostalAddressImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPostalAddress()
	 * @generated
	 */
	int POSTAL_ADDRESS = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__NAME = NAME_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__ID = NAME_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__SCHEMA_VERSION = NAME_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__ORGANIZATION = NAME_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__STREET = NAME_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__CITY = NAME_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__POSTAL_CODE = NAME_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__PROVINCE = NAME_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__COUNTRY = NAME_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__COUNTRY_CODE = NAME_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Primary Mobile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__PRIMARY_MOBILE = NAME_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Mobiles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__MOBILES = NAME_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Primary Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__PRIMARY_PHONE = NAME_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Phones</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__PHONES = NAME_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Primary Home Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__PRIMARY_HOME_PHONE = NAME_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Home Phones</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__HOME_PHONES = NAME_CONTAINER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Primary Work Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__PRIMARY_WORK_PHONE = NAME_CONTAINER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Work Phones</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__WORK_PHONES = NAME_CONTAINER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Primary Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__PRIMARY_EMAIL = NAME_CONTAINER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Emails</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__EMAILS = NAME_CONTAINER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__DESCRIPTION = NAME_CONTAINER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__PRIMARY = NAME_CONTAINER_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Primary Billing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__PRIMARY_BILLING = NAME_CONTAINER_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Primary Shipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__PRIMARY_SHIPPING = NAME_CONTAINER_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Validation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__VALIDATION_TIME = NAME_CONTAINER_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>District</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__DISTRICT = NAME_CONTAINER_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Jne Area Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__JNE_AREA_CODE = NAME_CONTAINER_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Postal Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_FEATURE_COUNT = NAME_CONTAINER_FEATURE_COUNT + 26;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.PersonCatalogImpl <em>Person Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.PersonCatalogImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPersonCatalog()
	 * @generated
	 */
	int PERSON_CATALOG = 51;

	/**
	 * The feature id for the '<em><b>People</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CATALOG__PEOPLE = 0;

	/**
	 * The number of structural features of the '<em>Person Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CATALOG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.CanonicalSluggable <em>Canonical Sluggable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.CanonicalSluggable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getCanonicalSluggable()
	 * @generated
	 */
	int CANONICAL_SLUGGABLE = 52;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICAL_SLUGGABLE__SLUG = SLUGGABLE__SLUG;

	/**
	 * The feature id for the '<em><b>Canonical Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICAL_SLUGGABLE__CANONICAL_SLUG = SLUGGABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Canonical Sluggable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICAL_SLUGGABLE_FEATURE_COUNT = SLUGGABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.TwitterAccessible <em>Twitter Accessible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.TwitterAccessible
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTwitterAccessible()
	 * @generated
	 */
	int TWITTER_ACCESSIBLE = 53;

	/**
	 * The feature id for the '<em><b>Twitter Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_ACCESSIBLE__TWITTER_ACCESS_TOKEN = 0;

	/**
	 * The feature id for the '<em><b>Twitter Access Token Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_ACCESSIBLE__TWITTER_ACCESS_TOKEN_SECRET = 1;

	/**
	 * The number of structural features of the '<em>Twitter Accessible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_ACCESSIBLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.TwitterIdentity <em>Twitter Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.TwitterIdentity
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTwitterIdentity()
	 * @generated
	 */
	int TWITTER_IDENTITY = 54;

	/**
	 * The feature id for the '<em><b>Twitter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_IDENTITY__TWITTER_ID = 0;

	/**
	 * The feature id for the '<em><b>Twitter Screen Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_IDENTITY__TWITTER_SCREEN_NAME = 1;

	/**
	 * The number of structural features of the '<em>Twitter Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_IDENTITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.FacebookIdentityImpl <em>Facebook Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.FacebookIdentityImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getFacebookIdentity()
	 * @generated
	 */
	int FACEBOOK_IDENTITY = 55;

	/**
	 * The feature id for the '<em><b>Facebook Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_IDENTITY__FACEBOOK_ID = 0;

	/**
	 * The feature id for the '<em><b>Facebook Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_IDENTITY__FACEBOOK_USERNAME = 1;

	/**
	 * The number of structural features of the '<em>Facebook Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_IDENTITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.FacebookAccessibleImpl <em>Facebook Accessible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.FacebookAccessibleImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getFacebookAccessible()
	 * @generated
	 */
	int FACEBOOK_ACCESSIBLE = 56;

	/**
	 * The feature id for the '<em><b>Facebook Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_ACCESSIBLE__FACEBOOK_ACCESS_TOKEN = 0;

	/**
	 * The number of structural features of the '<em>Facebook Accessible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_ACCESSIBLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.Revisionable <em>Revisionable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Revisionable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getRevisionable()
	 * @generated
	 */
	int REVISIONABLE = 57;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISIONABLE__GUID = 0;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISIONABLE__REVISION = 1;

	/**
	 * The number of structural features of the '<em>Revisionable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISIONABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.SysConfig <em>Sys Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.SysConfig
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getSysConfig()
	 * @generated
	 */
	int SYS_CONFIG = 58;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_CONFIG__CREATION_TIME = TIMESTAMPED__CREATION_TIME;

	/**
	 * The feature id for the '<em><b>Modification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_CONFIG__MODIFICATION_TIME = TIMESTAMPED__MODIFICATION_TIME;

	/**
	 * The feature id for the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_CONFIG__TENANT_ID = TIMESTAMPED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sys Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_CONFIG_FEATURE_COUNT = TIMESTAMPED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.GeolocationImpl <em>Geolocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.GeolocationImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getGeolocation()
	 * @generated
	 */
	int GEOLOCATION = 59;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOLOCATION__LATITUDE = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOLOCATION__LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOLOCATION__ELEVATION = 2;

	/**
	 * The number of structural features of the '<em>Geolocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOLOCATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.ThingInfoImpl <em>Thing Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.ThingInfoImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getThingInfo()
	 * @generated
	 */
	int THING_INFO = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INFO__NAME = NAME_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INFO__ID = NAME_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INFO__SLUG = NAME_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INFO__IMAGE_ID = NAME_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Thing Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INFO_FEATURE_COUNT = NAME_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.GeneralSysConfigImpl <em>General Sys Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.GeneralSysConfigImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getGeneralSysConfig()
	 * @generated
	 */
	int GENERAL_SYS_CONFIG = 61;

	/**
	 * The feature id for the '<em><b>Expansion State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SYS_CONFIG__EXPANSION_STATE = EXPANDABLE__EXPANSION_STATE;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SYS_CONFIG__CREATION_TIME = EXPANDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SYS_CONFIG__MODIFICATION_TIME = EXPANDABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SYS_CONFIG__TENANT_ID = EXPANDABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ssl Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SYS_CONFIG__SSL_SUPPORTED = EXPANDABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>General Sys Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SYS_CONFIG_FEATURE_COUNT = EXPANDABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.OrganizationImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 62;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__SCHEMA_VERSION = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Black Berry Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__BLACK_BERRY_PIN = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__WEBSITE = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Facebook Page Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__FACEBOOK_PAGE_URI = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Facebook Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__FACEBOOK_ACCESS_TOKEN = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Facebook Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__FACEBOOK_ID = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Facebook User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__FACEBOOK_USER_NAME = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Twitter Screen Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TWITTER_SCREEN_NAME = IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Twitter Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TWITTER_ACCESS_TOKEN = IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Twitter Access Token Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TWITTER_ACCESS_TOKEN_SECRET = IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Twitter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TWITTER_ID = IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.CustomerRoleImpl <em>Customer Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.CustomerRoleImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getCustomerRole()
	 * @generated
	 */
	int CUSTOMER_ROLE = 63;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__CREATION_TIME = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__MODIFICATION_TIME = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__DESCRIPTION = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__SCHEMA_VERSION = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__STATUS = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__READ_ONLY = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Quick Shop Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__QUICK_SHOP_ENABLED = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sales Order Report Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__SALES_ORDER_REPORT_ENABLED = IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>History Sales Order Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__HISTORY_SALES_ORDER_ENABLED = IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Agent Sales Report Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__AGENT_SALES_REPORT_ENABLED = IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Transaction History Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__TRANSACTION_HISTORY_ENABLED = IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Booking Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__BOOKING_ENABLED = IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Payment Gateway Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__PAYMENT_GATEWAY_ENABLED = IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Booking Expiry Time In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__BOOKING_EXPIRY_TIME_IN_MINUTES = IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Dropship Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__DROPSHIP_ENABLED = IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Review Reminder Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__REVIEW_REMINDER_ENABLED = IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Zendesk Integration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__ZENDESK_INTEGRATION = IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Zendesk Organization Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE__ZENDESK_ORGANIZATION_ID = IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Customer Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ROLE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 19;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.MongoSysConfig <em>Mongo Sys Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.MongoSysConfig
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getMongoSysConfig()
	 * @generated
	 */
	int MONGO_SYS_CONFIG = 64;

	/**
	 * The feature id for the '<em><b>Mongo Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_SYS_CONFIG__MONGO_URI = 0;

	/**
	 * The number of structural features of the '<em>Mongo Sys Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_SYS_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.ResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.ResourceType
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 65;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Gender
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 66;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.EClassStatus <em>EClass Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.EClassStatus
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEClassStatus()
	 * @generated
	 */
	int ECLASS_STATUS = 67;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.JavaClassStatus <em>Java Class Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.JavaClassStatus
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getJavaClassStatus()
	 * @generated
	 */
	int JAVA_CLASS_STATUS = 68;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.ProgressStatus <em>Progress Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.ProgressStatus
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getProgressStatus()
	 * @generated
	 */
	int PROGRESS_STATUS = 69;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.AccountStatus <em>Account Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.AccountStatus
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getAccountStatus()
	 * @generated
	 */
	int ACCOUNT_STATUS = 70;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.PublicationStatus <em>Publication Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.PublicationStatus
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPublicationStatus()
	 * @generated
	 */
	int PUBLICATION_STATUS = 71;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.ArchivalStatus <em>Archival Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.ArchivalStatus
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getArchivalStatus()
	 * @generated
	 */
	int ARCHIVAL_STATUS = 72;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.TranslationState <em>Translation State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.TranslationState
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTranslationState()
	 * @generated
	 */
	int TRANSLATION_STATE = 73;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.ExpansionState <em>Expansion State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.ExpansionState
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getExpansionState()
	 * @generated
	 */
	int EXPANSION_STATE = 74;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.SignupSourceType <em>Signup Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.SignupSourceType
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getSignupSourceType()
	 * @generated
	 */
	int SIGNUP_SOURCE_TYPE = 75;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.TenantSource <em>Tenant Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.TenantSource
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTenantSource()
	 * @generated
	 */
	int TENANT_SOURCE = 76;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.GenericStatus <em>Generic Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.GenericStatus
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getGenericStatus()
	 * @generated
	 */
	int GENERIC_STATUS = 77;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.CustomerRoleStatus <em>Customer Role Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.CustomerRoleStatus
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getCustomerRoleStatus()
	 * @generated
	 */
	int CUSTOMER_ROLE_STATUS = 78;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.EntityKind <em>Entity Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.EntityKind
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEntityKind()
	 * @generated
	 */
	int ENTITY_KIND = 79;

	/**
	 * The meta object id for the '<em>Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.joda.time.DateTime
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 80;

	/**
	 * The meta object id for the '<em>Currency Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.money.CurrencyUnit
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getCurrencyUnit()
	 * @generated
	 */
	int CURRENCY_UNIT = 81;

	/**
	 * The meta object id for the '<em>Quantity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.quantity.Quantity
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 82;

	/**
	 * The meta object id for the '<em>Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.unit.Unit
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 83;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getList()
	 * @generated
	 */
	int LIST = 84;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 85;

	/**
	 * The meta object id for the '<em>Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Set
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getSet()
	 * @generated
	 */
	int SET = 86;

	/**
	 * The meta object id for the '<em>Collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 87;

	/**
	 * The meta object id for the '<em>Multimap</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.common.collect.Multimap
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getMultimap()
	 * @generated
	 */
	int MULTIMAP = 88;

	/**
	 * The meta object id for the '<em>Navigable Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.NavigableMap
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getNavigableMap()
	 * @generated
	 */
	int NAVIGABLE_MAP = 89;

	/**
	 * The meta object id for the '<em>Queue</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Queue
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getQueue()
	 * @generated
	 */
	int QUEUE = 90;

	/**
	 * The meta object id for the '<em>Multiset</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.common.collect.Multiset
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getMultiset()
	 * @generated
	 */
	int MULTISET = 91;

	/**
	 * The meta object id for the '<em>Serializable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.Serializable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getSerializable()
	 * @generated
	 */
	int SERIALIZABLE = 92;

	/**
	 * The meta object id for the '<em>Bundle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osgi.framework.Bundle
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 93;

	/**
	 * The meta object id for the '<em>Money</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.javamoney.moneta.Money
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getMoney()
	 * @generated
	 */
	int MONEY = 94;

	/**
	 * The meta object id for the '<em>Measurable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.Measurable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getMeasurable()
	 * @generated
	 */
	int MEASURABLE = 95;

	/**
	 * The meta object id for the '<em>Date Time Zone</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.joda.time.DateTimeZone
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getDateTimeZone()
	 * @generated
	 */
	int DATE_TIME_ZONE = 96;

	/**
	 * The meta object id for the '<em>Locale</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Locale
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getLocale()
	 * @generated
	 */
	int LOCALE = 97;

	/**
	 * The meta object id for the '<em>File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 98;

	/**
	 * The meta object id for the '<em>Listenable Future</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.common.util.concurrent.ListenableFuture
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getListenableFuture()
	 * @generated
	 */
	int LISTENABLE_FUTURE = 99;

	/**
	 * The meta object id for the '<em>Listening Executor Service</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.common.util.concurrent.ListeningExecutorService
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getListeningExecutorService()
	 * @generated
	 */
	int LISTENING_EXECUTOR_SERVICE = 100;

	/**
	 * The meta object id for the '<em>Class Loader</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.ClassLoader
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getClassLoader()
	 * @generated
	 */
	int CLASS_LOADER = 101;

	/**
	 * The meta object id for the '<em>URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getURL()
	 * @generated
	 */
	int URL = 102;

	/**
	 * The meta object id for the '<em>Event Bus</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.common.eventbus.EventBus
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEventBus()
	 * @generated
	 */
	int EVENT_BUS = 103;

	/**
	 * The meta object id for the '<em>Local Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.joda.time.LocalDate
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getLocalDate()
	 * @generated
	 */
	int LOCAL_DATE = 104;

	/**
	 * The meta object id for the '<em>No Such Element Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.NoSuchElementException
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getNoSuchElementException()
	 * @generated
	 */
	int NO_SUCH_ELEMENT_EXCEPTION = 105;

	/**
	 * The meta object id for the '<em>Deque</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Deque
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getDeque()
	 * @generated
	 */
	int DEQUE = 106;

	/**
	 * The meta object id for the '<em>Temperature</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.quantity.Temperature
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTemperature()
	 * @generated
	 */
	int TEMPERATURE = 107;

	/**
	 * The meta object id for the '<em>Local Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.joda.time.LocalTime
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getLocalTime()
	 * @generated
	 */
	int LOCAL_TIME = 108;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 109;

	/**
	 * The meta object id for the '<em>EFactory</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EFactory
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEFactory()
	 * @generated
	 */
	int EFACTORY = 110;

	/**
	 * The meta object id for the '<em>Mass</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.quantity.Mass
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getMass()
	 * @generated
	 */
	int MASS = 111;

	/**
	 * The meta object id for the '<em>Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.quantity.Length
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 112;

	/**
	 * The meta object id for the '<em>List Multimap</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.common.collect.ListMultimap
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getListMultimap()
	 * @generated
	 */
	int LIST_MULTIMAP = 113;

	/**
	 * The meta object id for the '<em>UUID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.UUID
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getUUID()
	 * @generated
	 */
	int UUID = 114;

	/**
	 * The meta object id for the '<em>Period</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.joda.time.Period
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 115;


	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.ResourceAware <em>Resource Aware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Aware</em>'.
	 * @see org.soluvas.commons.ResourceAware
	 * @generated
	 */
	EClass getResourceAware();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.ResourceAware#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see org.soluvas.commons.ResourceAware#getResourceType()
	 * @see #getResourceAware()
	 * @generated
	 */
	EAttribute getResourceAware_ResourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.ResourceAware#getResourceUri <em>Resource Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Uri</em>'.
	 * @see org.soluvas.commons.ResourceAware#getResourceUri()
	 * @see #getResourceAware()
	 * @generated
	 */
	EAttribute getResourceAware_ResourceUri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.ResourceAware#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see org.soluvas.commons.ResourceAware#getResourceName()
	 * @see #getResourceAware()
	 * @generated
	 */
	EAttribute getResourceAware_ResourceName();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Positionable <em>Positionable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positionable</em>'.
	 * @see org.soluvas.commons.Positionable
	 * @generated
	 */
	EClass getPositionable();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Positionable#getPositioner <em>Positioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positioner</em>'.
	 * @see org.soluvas.commons.Positionable#getPositioner()
	 * @see #getPositionable()
	 * @generated
	 */
	EAttribute getPositionable_Positioner();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.AppManifest <em>App Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Manifest</em>'.
	 * @see org.soluvas.commons.AppManifest
	 * @generated
	 */
	EClass getAppManifest();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.soluvas.commons.AppManifest#getTitle()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.soluvas.commons.AppManifest#getSummary()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_Summary();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.soluvas.commons.AppManifest#getDescription()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see org.soluvas.commons.AppManifest#getDomain()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_Domain();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getDomainPrd <em>Domain Prd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Prd</em>'.
	 * @see org.soluvas.commons.AppManifest#getDomainPrd()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_DomainPrd();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getDomainDev <em>Domain Dev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Dev</em>'.
	 * @see org.soluvas.commons.AppManifest#getDomainDev()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_DomainDev();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getDomainStg <em>Domain Stg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Stg</em>'.
	 * @see org.soluvas.commons.AppManifest#getDomainStg()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_DomainStg();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getGeneralEmail <em>General Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>General Email</em>'.
	 * @see org.soluvas.commons.AppManifest#getGeneralEmail()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_GeneralEmail();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getGeneralEmailPrd <em>General Email Prd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>General Email Prd</em>'.
	 * @see org.soluvas.commons.AppManifest#getGeneralEmailPrd()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_GeneralEmailPrd();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getGeneralEmailDev <em>General Email Dev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>General Email Dev</em>'.
	 * @see org.soluvas.commons.AppManifest#getGeneralEmailDev()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_GeneralEmailDev();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getGeneralEmailStg <em>General Email Stg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>General Email Stg</em>'.
	 * @see org.soluvas.commons.AppManifest#getGeneralEmailStg()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_GeneralEmailStg();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getOrganizationName <em>Organization Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Name</em>'.
	 * @see org.soluvas.commons.AppManifest#getOrganizationName()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_OrganizationName();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getOrganizationAddress <em>Organization Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Address</em>'.
	 * @see org.soluvas.commons.AppManifest#getOrganizationAddress()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_OrganizationAddress();

	/**
	 * Returns the meta object for the attribute list '{@link org.soluvas.commons.AppManifest#getOrganizationPhoneNumbers <em>Organization Phone Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Organization Phone Numbers</em>'.
	 * @see org.soluvas.commons.AppManifest#getOrganizationPhoneNumbers()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_OrganizationPhoneNumbers();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getDefaultTimeZoneId <em>Default Time Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Time Zone Id</em>'.
	 * @see org.soluvas.commons.AppManifest#getDefaultTimeZoneId()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_DefaultTimeZoneId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getDefaultTimeZone <em>Default Time Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Time Zone</em>'.
	 * @see org.soluvas.commons.AppManifest#getDefaultTimeZone()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_DefaultTimeZone();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getDefaultCurrencyCode <em>Default Currency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Currency Code</em>'.
	 * @see org.soluvas.commons.AppManifest#getDefaultCurrencyCode()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_DefaultCurrencyCode();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getDefaultCurrency <em>Default Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Currency</em>'.
	 * @see org.soluvas.commons.AppManifest#getDefaultCurrency()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_DefaultCurrency();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getDefaultLanguageTag <em>Default Language Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Language Tag</em>'.
	 * @see org.soluvas.commons.AppManifest#getDefaultLanguageTag()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_DefaultLanguageTag();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getDefaultCountryCode <em>Default Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Country Code</em>'.
	 * @see org.soluvas.commons.AppManifest#getDefaultCountryCode()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_DefaultCountryCode();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getDefaultCategoryUName <em>Default Category UName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Category UName</em>'.
	 * @see org.soluvas.commons.AppManifest#getDefaultCategoryUName()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_DefaultCategoryUName();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getEmailLogoUriTemplate <em>Email Logo Uri Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Logo Uri Template</em>'.
	 * @see org.soluvas.commons.AppManifest#getEmailLogoUriTemplate()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_EmailLogoUriTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getLetterSalutation <em>Letter Salutation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Letter Salutation</em>'.
	 * @see org.soluvas.commons.AppManifest#getLetterSalutation()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_LetterSalutation();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getLetterClosing <em>Letter Closing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Letter Closing</em>'.
	 * @see org.soluvas.commons.AppManifest#getLetterClosing()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_LetterClosing();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getFootnote <em>Footnote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footnote</em>'.
	 * @see org.soluvas.commons.AppManifest#getFootnote()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_Footnote();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getWwwUsed <em>Www Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Www Used</em>'.
	 * @see org.soluvas.commons.AppManifest#getWwwUsed()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_WwwUsed();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getHeadNote <em>Head Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Head Note</em>'.
	 * @see org.soluvas.commons.AppManifest#getHeadNote()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_HeadNote();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getHeadTitle <em>Head Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Head Title</em>'.
	 * @see org.soluvas.commons.AppManifest#getHeadTitle()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_HeadTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getDefaultStyle <em>Default Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Style</em>'.
	 * @see org.soluvas.commons.AppManifest#getDefaultStyle()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_DefaultStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getDefaultVariation <em>Default Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Variation</em>'.
	 * @see org.soluvas.commons.AppManifest#getDefaultVariation()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_DefaultVariation();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getKursDollarPaypal <em>Kurs Dollar Paypal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kurs Dollar Paypal</em>'.
	 * @see org.soluvas.commons.AppManifest#getKursDollarPaypal()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_KursDollarPaypal();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getKursDollarDpex <em>Kurs Dollar Dpex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kurs Dollar Dpex</em>'.
	 * @see org.soluvas.commons.AppManifest#getKursDollarDpex()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_KursDollarDpex();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getReminderSchedule <em>Reminder Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reminder Schedule</em>'.
	 * @see org.soluvas.commons.AppManifest#getReminderSchedule()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_ReminderSchedule();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getReminderPeriodStr <em>Reminder Period Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reminder Period Str</em>'.
	 * @see org.soluvas.commons.AppManifest#getReminderPeriodStr()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_ReminderPeriodStr();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getReminderPeriod <em>Reminder Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reminder Period</em>'.
	 * @see org.soluvas.commons.AppManifest#getReminderPeriod()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_ReminderPeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getReminderScheduleStr <em>Reminder Schedule Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reminder Schedule Str</em>'.
	 * @see org.soluvas.commons.AppManifest#getReminderScheduleStr()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_ReminderScheduleStr();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getSupportEmail <em>Support Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Support Email</em>'.
	 * @see org.soluvas.commons.AppManifest#getSupportEmail()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_SupportEmail();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.PersonInfo <em>Person Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Info</em>'.
	 * @see org.soluvas.commons.PersonInfo
	 * @generated
	 */
	EClass getPersonInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PersonInfo#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see org.soluvas.commons.PersonInfo#getGender()
	 * @see #getPersonInfo()
	 * @generated
	 */
	EAttribute getPersonInfo_Gender();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PersonInfo#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.soluvas.commons.PersonInfo#getEmail()
	 * @see #getPersonInfo()
	 * @generated
	 */
	EAttribute getPersonInfo_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PersonInfo#getMobileNumber <em>Mobile Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mobile Number</em>'.
	 * @see org.soluvas.commons.PersonInfo#getMobileNumber()
	 * @see #getPersonInfo()
	 * @generated
	 */
	EAttribute getPersonInfo_MobileNumber();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Timestamped <em>Timestamped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamped</em>'.
	 * @see org.soluvas.commons.Timestamped
	 * @generated
	 */
	EClass getTimestamped();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Timestamped#getCreationTime <em>Creation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Time</em>'.
	 * @see org.soluvas.commons.Timestamped#getCreationTime()
	 * @see #getTimestamped()
	 * @generated
	 */
	EAttribute getTimestamped_CreationTime();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Timestamped#getModificationTime <em>Modification Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification Time</em>'.
	 * @see org.soluvas.commons.Timestamped#getModificationTime()
	 * @see #getTimestamped()
	 * @generated
	 */
	EAttribute getTimestamped_ModificationTime();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see org.soluvas.commons.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Identifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.soluvas.commons.Identifiable#getId()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Id();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Sluggable <em>Sluggable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sluggable</em>'.
	 * @see org.soluvas.commons.Sluggable
	 * @generated
	 */
	EClass getSluggable();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Sluggable#getSlug <em>Slug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slug</em>'.
	 * @see org.soluvas.commons.Sluggable#getSlug()
	 * @see #getSluggable()
	 * @generated
	 */
	EAttribute getSluggable_Slug();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Nameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nameable</em>'.
	 * @see org.soluvas.commons.Nameable
	 * @generated
	 */
	EClass getNameable();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Imageable <em>Imageable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imageable</em>'.
	 * @see org.soluvas.commons.Imageable
	 * @generated
	 */
	EClass getImageable();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.PhotoIdContainer <em>Photo Id Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo Id Container</em>'.
	 * @see org.soluvas.commons.PhotoIdContainer
	 * @generated
	 */
	EClass getPhotoIdContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PhotoIdContainer#getPhotoId <em>Photo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Photo Id</em>'.
	 * @see org.soluvas.commons.PhotoIdContainer#getPhotoId()
	 * @see #getPhotoIdContainer()
	 * @generated
	 */
	EAttribute getPhotoIdContainer_PhotoId();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.NameContainer <em>Name Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Container</em>'.
	 * @see org.soluvas.commons.NameContainer
	 * @generated
	 */
	EClass getNameContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.NameContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.soluvas.commons.NameContainer#getName()
	 * @see #getNameContainer()
	 * @generated
	 */
	EAttribute getNameContainer_Name();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Informer <em>Informer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Informer</em>'.
	 * @see org.soluvas.commons.Informer
	 * @generated
	 */
	EClass getInformer();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Describable <em>Describable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Describable</em>'.
	 * @see org.soluvas.commons.Describable
	 * @generated
	 */
	EClass getDescribable();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Describable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.soluvas.commons.Describable#getDescription()
	 * @see #getDescribable()
	 * @generated
	 */
	EAttribute getDescribable_Description();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.BundleAware <em>Bundle Aware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Aware</em>'.
	 * @see org.soluvas.commons.BundleAware
	 * @generated
	 */
	EClass getBundleAware();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.BundleAware#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bundle</em>'.
	 * @see org.soluvas.commons.BundleAware#getBundle()
	 * @see #getBundleAware()
	 * @generated
	 */
	EAttribute getBundleAware_Bundle();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.JavaClassLinked <em>Java Class Linked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Class Linked</em>'.
	 * @see org.soluvas.commons.JavaClassLinked
	 * @generated
	 */
	EClass getJavaClassLinked();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.JavaClassLinked#getJavaClassName <em>Java Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Class Name</em>'.
	 * @see org.soluvas.commons.JavaClassLinked#getJavaClassName()
	 * @see #getJavaClassLinked()
	 * @generated
	 */
	EAttribute getJavaClassLinked_JavaClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.JavaClassLinked#getJavaClass <em>Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Class</em>'.
	 * @see org.soluvas.commons.JavaClassLinked#getJavaClass()
	 * @see #getJavaClassLinked()
	 * @generated
	 */
	EAttribute getJavaClassLinked_JavaClass();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.JavaClassLinked#getJavaClassStatus <em>Java Class Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Class Status</em>'.
	 * @see org.soluvas.commons.JavaClassLinked#getJavaClassStatus()
	 * @see #getJavaClassLinked()
	 * @generated
	 */
	EAttribute getJavaClassLinked_JavaClassStatus();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.EClassLinked <em>EClass Linked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass Linked</em>'.
	 * @see org.soluvas.commons.EClassLinked
	 * @generated
	 */
	EClass getEClassLinked();

	/**
	 * Returns the meta object for the reference '{@link org.soluvas.commons.EClassLinked#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see org.soluvas.commons.EClassLinked#getEClass()
	 * @see #getEClassLinked()
	 * @generated
	 */
	EReference getEClassLinked_EClass();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.EClassLinked#getEClassStatus <em>EClass Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EClass Status</em>'.
	 * @see org.soluvas.commons.EClassLinked#getEClassStatus()
	 * @see #getEClassLinked()
	 * @generated
	 */
	EAttribute getEClassLinked_EClassStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.EClassLinked#getEPackageNsPrefix <em>EPackage Ns Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EPackage Ns Prefix</em>'.
	 * @see org.soluvas.commons.EClassLinked#getEPackageNsPrefix()
	 * @see #getEClassLinked()
	 * @generated
	 */
	EAttribute getEClassLinked_EPackageNsPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.EClassLinked#getEClassName <em>EClass Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EClass Name</em>'.
	 * @see org.soluvas.commons.EClassLinked#getEClassName()
	 * @see #getEClassLinked()
	 * @generated
	 */
	EAttribute getEClassLinked_EClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.EClassLinked#getEPackageName <em>EPackage Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EPackage Name</em>'.
	 * @see org.soluvas.commons.EClassLinked#getEPackageName()
	 * @see #getEClassLinked()
	 * @generated
	 */
	EAttribute getEClassLinked_EPackageName();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.SchemaVersionable <em>Schema Versionable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Versionable</em>'.
	 * @see org.soluvas.commons.SchemaVersionable
	 * @generated
	 */
	EClass getSchemaVersionable();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.EFactoryLinked <em>EFactory Linked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFactory Linked</em>'.
	 * @see org.soluvas.commons.EFactoryLinked
	 * @generated
	 */
	EClass getEFactoryLinked();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.EFactoryLinked#getEFactory <em>EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EFactory</em>'.
	 * @see org.soluvas.commons.EFactoryLinked#getEFactory()
	 * @see #getEFactoryLinked()
	 * @generated
	 */
	EAttribute getEFactoryLinked_EFactory();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.NsPrefixable <em>Ns Prefixable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ns Prefixable</em>'.
	 * @see org.soluvas.commons.NsPrefixable
	 * @generated
	 */
	EClass getNsPrefixable();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.NsPrefixable#getNsPrefix <em>Ns Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns Prefix</em>'.
	 * @see org.soluvas.commons.NsPrefixable#getNsPrefix()
	 * @see #getNsPrefixable()
	 * @generated
	 */
	EAttribute getNsPrefixable_NsPrefix();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.WebAddress <em>Web Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Address</em>'.
	 * @see org.soluvas.commons.WebAddress
	 * @generated
	 */
	EClass getWebAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.WebAddress#getBaseUri <em>Base Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Uri</em>'.
	 * @see org.soluvas.commons.WebAddress#getBaseUri()
	 * @see #getWebAddress()
	 * @generated
	 */
	EAttribute getWebAddress_BaseUri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.WebAddress#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see org.soluvas.commons.WebAddress#getBasePath()
	 * @see #getWebAddress()
	 * @generated
	 */
	EAttribute getWebAddress_BasePath();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.WebAddress#getApiPath <em>Api Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Path</em>'.
	 * @see org.soluvas.commons.WebAddress#getApiPath()
	 * @see #getWebAddress()
	 * @generated
	 */
	EAttribute getWebAddress_ApiPath();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.WebAddress#getImagesUri <em>Images Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Images Uri</em>'.
	 * @see org.soluvas.commons.WebAddress#getImagesUri()
	 * @see #getWebAddress()
	 * @generated
	 */
	EAttribute getWebAddress_ImagesUri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.WebAddress#getSkinUri <em>Skin Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skin Uri</em>'.
	 * @see org.soluvas.commons.WebAddress#getSkinUri()
	 * @see #getWebAddress()
	 * @generated
	 */
	EAttribute getWebAddress_SkinUri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.WebAddress#getJsUri <em>Js Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Js Uri</em>'.
	 * @see org.soluvas.commons.WebAddress#getJsUri()
	 * @see #getWebAddress()
	 * @generated
	 */
	EAttribute getWebAddress_JsUri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.WebAddress#getSecureBaseUri <em>Secure Base Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secure Base Uri</em>'.
	 * @see org.soluvas.commons.WebAddress#getSecureBaseUri()
	 * @see #getWebAddress()
	 * @generated
	 */
	EAttribute getWebAddress_SecureBaseUri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.WebAddress#getSecureImagesUri <em>Secure Images Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secure Images Uri</em>'.
	 * @see org.soluvas.commons.WebAddress#getSecureImagesUri()
	 * @see #getWebAddress()
	 * @generated
	 */
	EAttribute getWebAddress_SecureImagesUri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.WebAddress#getSecureSkinUri <em>Secure Skin Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secure Skin Uri</em>'.
	 * @see org.soluvas.commons.WebAddress#getSecureSkinUri()
	 * @see #getWebAddress()
	 * @generated
	 */
	EAttribute getWebAddress_SecureSkinUri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.WebAddress#getSecureJsUri <em>Secure Js Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secure Js Uri</em>'.
	 * @see org.soluvas.commons.WebAddress#getSecureJsUri()
	 * @see #getWebAddress()
	 * @generated
	 */
	EAttribute getWebAddress_SecureJsUri();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Added <em>Added</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Added</em>'.
	 * @see org.soluvas.commons.Added
	 * @generated
	 */
	EClass getAdded();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.ModelNotification <em>Model Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Notification</em>'.
	 * @see org.soluvas.commons.ModelNotification
	 * @generated
	 */
	EClass getModelNotification();

	/**
	 * Returns the meta object for the reference '{@link org.soluvas.commons.ModelNotification#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see org.soluvas.commons.ModelNotification#getContainer()
	 * @see #getModelNotification()
	 * @generated
	 */
	EReference getModelNotification_Container();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.AttributeSet <em>Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Set</em>'.
	 * @see org.soluvas.commons.AttributeSet
	 * @generated
	 */
	EClass getAttributeSet();

	/**
	 * Returns the meta object for the attribute list '{@link org.soluvas.commons.AttributeSet#getPrincipals <em>Principals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Principals</em>'.
	 * @see org.soluvas.commons.AttributeSet#getPrincipals()
	 * @see #getAttributeSet()
	 * @generated
	 */
	EAttribute getAttributeSet_Principals();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.AttributeUnset <em>Attribute Unset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Unset</em>'.
	 * @see org.soluvas.commons.AttributeUnset
	 * @generated
	 */
	EClass getAttributeUnset();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Removed <em>Removed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Removed</em>'.
	 * @see org.soluvas.commons.Removed
	 * @generated
	 */
	EClass getRemoved();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.ObjectNotification <em>Object Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Notification</em>'.
	 * @see org.soluvas.commons.ObjectNotification
	 * @generated
	 */
	EClass getObjectNotification();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.ObjectNotification#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.soluvas.commons.ObjectNotification#getObject()
	 * @see #getObjectNotification()
	 * @generated
	 */
	EAttribute getObjectNotification_Object();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.AttributeNotification <em>Attribute Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Notification</em>'.
	 * @see org.soluvas.commons.AttributeNotification
	 * @generated
	 */
	EClass getAttributeNotification();

	/**
	 * Returns the meta object for the reference '{@link org.soluvas.commons.AttributeNotification#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.soluvas.commons.AttributeNotification#getAttribute()
	 * @see #getAttributeNotification()
	 * @generated
	 */
	EReference getAttributeNotification_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AttributeNotification#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.soluvas.commons.AttributeNotification#getObject()
	 * @see #getAttributeNotification()
	 * @generated
	 */
	EAttribute getAttributeNotification_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AttributeNotification#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see org.soluvas.commons.AttributeNotification#getOldValue()
	 * @see #getAttributeNotification()
	 * @generated
	 */
	EAttribute getAttributeNotification_OldValue();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AttributeNotification#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see org.soluvas.commons.AttributeNotification#getNewValue()
	 * @see #getAttributeNotification()
	 * @generated
	 */
	EAttribute getAttributeNotification_NewValue();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.AddedMany <em>Added Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Added Many</em>'.
	 * @see org.soluvas.commons.AddedMany
	 * @generated
	 */
	EClass getAddedMany();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.RemovedMany <em>Removed Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Removed Many</em>'.
	 * @see org.soluvas.commons.RemovedMany
	 * @generated
	 */
	EClass getRemovedMany();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.ObjectsNotification <em>Objects Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objects Notification</em>'.
	 * @see org.soluvas.commons.ObjectsNotification
	 * @generated
	 */
	EClass getObjectsNotification();

	/**
	 * Returns the meta object for the attribute list '{@link org.soluvas.commons.ObjectsNotification#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Objects</em>'.
	 * @see org.soluvas.commons.ObjectsNotification#getObjects()
	 * @see #getObjectsNotification()
	 * @generated
	 */
	EAttribute getObjectsNotification_Objects();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.EObjectLinked <em>EObject Linked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Linked</em>'.
	 * @see org.soluvas.commons.EObjectLinked
	 * @generated
	 */
	EClass getEObjectLinked();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Parentable <em>Parentable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parentable</em>'.
	 * @see org.soluvas.commons.Parentable
	 * @generated
	 */
	EClass getParentable();

	/**
	 * Returns the meta object for the reference '{@link org.soluvas.commons.Parentable#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.soluvas.commons.Parentable#getParent()
	 * @see #getParentable()
	 * @generated
	 */
	EReference getParentable_Parent();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.CategoryLike <em>Category Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Like</em>'.
	 * @see org.soluvas.commons.CategoryLike
	 * @generated
	 */
	EClass getCategoryLike();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CategoryLike#getSlugPath <em>Slug Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slug Path</em>'.
	 * @see org.soluvas.commons.CategoryLike#getSlugPath()
	 * @see #getCategoryLike()
	 * @generated
	 */
	EAttribute getCategoryLike_SlugPath();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CategoryLike#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.soluvas.commons.CategoryLike#getColor()
	 * @see #getCategoryLike()
	 * @generated
	 */
	EAttribute getCategoryLike_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CategoryLike#getImageId <em>Image Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Id</em>'.
	 * @see org.soluvas.commons.CategoryLike#getImageId()
	 * @see #getCategoryLike()
	 * @generated
	 */
	EAttribute getCategoryLike_ImageId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CategoryLike#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.soluvas.commons.CategoryLike#getLevel()
	 * @see #getCategoryLike()
	 * @generated
	 */
	EAttribute getCategoryLike_Level();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CategoryLike#getCategoryCount <em>Category Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Count</em>'.
	 * @see org.soluvas.commons.CategoryLike#getCategoryCount()
	 * @see #getCategoryLike()
	 * @generated
	 */
	EAttribute getCategoryLike_CategoryCount();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.CategoryInfo <em>Category Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Info</em>'.
	 * @see org.soluvas.commons.CategoryInfo
	 * @generated
	 */
	EClass getCategoryInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.soluvas.commons.CategoryInfo#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parents</em>'.
	 * @see org.soluvas.commons.CategoryInfo#getParents()
	 * @see #getCategoryInfo()
	 * @generated
	 */
	EReference getCategoryInfo_Parents();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CategoryInfo#getPrimaryUri <em>Primary Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Uri</em>'.
	 * @see org.soluvas.commons.CategoryInfo#getPrimaryUri()
	 * @see #getCategoryInfo()
	 * @generated
	 */
	EAttribute getCategoryInfo_PrimaryUri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CategoryInfo#getGoogleFormalId <em>Google Formal Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Google Formal Id</em>'.
	 * @see org.soluvas.commons.CategoryInfo#getGoogleFormalId()
	 * @see #getCategoryInfo()
	 * @generated
	 */
	EAttribute getCategoryInfo_GoogleFormalId();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.ProgressMonitor <em>Progress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Monitor</em>'.
	 * @see org.soluvas.commons.ProgressMonitor
	 * @generated
	 */
	EClass getProgressMonitor();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.ProgressMonitor#isCanceled <em>Canceled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canceled</em>'.
	 * @see org.soluvas.commons.ProgressMonitor#isCanceled()
	 * @see #getProgressMonitor()
	 * @generated
	 */
	EAttribute getProgressMonitor_Canceled();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.ProgressMonitor#getTaskName <em>Task Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Name</em>'.
	 * @see org.soluvas.commons.ProgressMonitor#getTaskName()
	 * @see #getProgressMonitor()
	 * @generated
	 */
	EAttribute getProgressMonitor_TaskName();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.ShellProgressMonitor <em>Shell Progress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shell Progress Monitor</em>'.
	 * @see org.soluvas.commons.ShellProgressMonitor
	 * @generated
	 */
	EClass getShellProgressMonitor();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.EventBusProgressMonitor <em>Event Bus Progress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Bus Progress Monitor</em>'.
	 * @see org.soluvas.commons.EventBusProgressMonitor
	 * @generated
	 */
	EClass getEventBusProgressMonitor();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.EventBusProgressMonitor#getEventBus <em>Event Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Bus</em>'.
	 * @see org.soluvas.commons.EventBusProgressMonitor#getEventBus()
	 * @see #getEventBusProgressMonitor()
	 * @generated
	 */
	EAttribute getEventBusProgressMonitor_EventBus();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.EventBusProgressMonitor#getTrackingId <em>Tracking Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Id</em>'.
	 * @see org.soluvas.commons.EventBusProgressMonitor#getTrackingId()
	 * @see #getEventBusProgressMonitor()
	 * @generated
	 */
	EAttribute getEventBusProgressMonitor_TrackingId();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.ProgressMonitorWrapper <em>Progress Monitor Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Monitor Wrapper</em>'.
	 * @see org.soluvas.commons.ProgressMonitorWrapper
	 * @generated
	 */
	EClass getProgressMonitorWrapper();

	/**
	 * Returns the meta object for the reference '{@link org.soluvas.commons.ProgressMonitorWrapper#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see org.soluvas.commons.ProgressMonitorWrapper#getDelegate()
	 * @see #getProgressMonitorWrapper()
	 * @generated
	 */
	EReference getProgressMonitorWrapper_Delegate();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Colorable <em>Colorable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colorable</em>'.
	 * @see org.soluvas.commons.Colorable
	 * @generated
	 */
	EClass getColorable();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Colorable#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.soluvas.commons.Colorable#getColor()
	 * @see #getColorable()
	 * @generated
	 */
	EAttribute getColorable_Color();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Translatable <em>Translatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translatable</em>'.
	 * @see org.soluvas.commons.Translatable
	 * @generated
	 */
	EClass getTranslatable();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Translatable#getTranslationState <em>Translation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translation State</em>'.
	 * @see org.soluvas.commons.Translatable#getTranslationState()
	 * @see #getTranslatable()
	 * @generated
	 */
	EAttribute getTranslatable_TranslationState();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Translatable#getOriginalLanguage <em>Original Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Language</em>'.
	 * @see org.soluvas.commons.Translatable#getOriginalLanguage()
	 * @see #getTranslatable()
	 * @generated
	 */
	EAttribute getTranslatable_OriginalLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Translatable#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.soluvas.commons.Translatable#getLanguage()
	 * @see #getTranslatable()
	 * @generated
	 */
	EAttribute getTranslatable_Language();

	/**
	 * Returns the meta object for the map '{@link org.soluvas.commons.Translatable#getTranslations <em>Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Translations</em>'.
	 * @see org.soluvas.commons.Translatable#getTranslations()
	 * @see #getTranslatable()
	 * @generated
	 */
	EReference getTranslatable_Translations();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Translation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation</em>'.
	 * @see org.soluvas.commons.Translation
	 * @generated
	 */
	EClass getTranslation();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Translation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.soluvas.commons.Translation#getLanguage()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_Language();

	/**
	 * Returns the meta object for the map '{@link org.soluvas.commons.Translation#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Messages</em>'.
	 * @see org.soluvas.commons.Translation#getMessages()
	 * @see #getTranslation()
	 * @generated
	 */
	EReference getTranslation_Messages();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Translation Message Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation Message Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getTranslationMessageEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTranslationMessageEntry()
	 * @generated
	 */
	EAttribute getTranslationMessageEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTranslationMessageEntry()
	 * @generated
	 */
	EAttribute getTranslationMessageEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.TranslationManager <em>Translation Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation Manager</em>'.
	 * @see org.soluvas.commons.TranslationManager
	 * @generated
	 */
	EClass getTranslationManager();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Translation Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model features="value key" 
	 *        valueType="org.soluvas.commons.Translation" valueContainment="true"
	 *        keyDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getTranslationEntry();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTranslationEntry()
	 * @generated
	 */
	EReference getTranslationEntry_Value();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTranslationEntry()
	 * @generated
	 */
	EAttribute getTranslationEntry_Key();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.StyleConfiguration <em>Style Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Configuration</em>'.
	 * @see org.soluvas.commons.StyleConfiguration
	 * @generated
	 */
	EClass getStyleConfiguration();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Expandable <em>Expandable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expandable</em>'.
	 * @see org.soluvas.commons.Expandable
	 * @generated
	 */
	EClass getExpandable();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Expandable#getExpansionState <em>Expansion State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expansion State</em>'.
	 * @see org.soluvas.commons.Expandable#getExpansionState()
	 * @see #getExpandable()
	 * @generated
	 */
	EAttribute getExpandable_ExpansionState();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.PersonLike <em>Person Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Like</em>'.
	 * @see org.soluvas.commons.PersonLike
	 * @generated
	 */
	EClass getPersonLike();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.soluvas.commons.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see org.soluvas.commons.Person#getSchemaVersion()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.soluvas.commons.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.soluvas.commons.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.soluvas.commons.Person#getPassword()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Password();

	/**
	 * Returns the meta object for the containment reference list '{@link org.soluvas.commons.Person#getPhoneNumbers <em>Phone Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phone Numbers</em>'.
	 * @see org.soluvas.commons.Person#getPhoneNumbers()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_PhoneNumbers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.soluvas.commons.Person#getEmails <em>Emails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emails</em>'.
	 * @see org.soluvas.commons.Person#getEmails()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Emails();

	/**
	 * Returns the meta object for the containment reference list '{@link org.soluvas.commons.Person#getMobileNumbers <em>Mobile Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mobile Numbers</em>'.
	 * @see org.soluvas.commons.Person#getMobileNumbers()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_MobileNumbers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.soluvas.commons.Person#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addresses</em>'.
	 * @see org.soluvas.commons.Person#getAddresses()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Addresses();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getAccountStatus <em>Account Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Status</em>'.
	 * @see org.soluvas.commons.Person#getAccountStatus()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_AccountStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getBirthYear <em>Birth Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Year</em>'.
	 * @see org.soluvas.commons.Person#getBirthYear()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_BirthYear();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getBirthMonth <em>Birth Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Month</em>'.
	 * @see org.soluvas.commons.Person#getBirthMonth()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_BirthMonth();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getBirthDay <em>Birth Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Day</em>'.
	 * @see org.soluvas.commons.Person#getBirthDay()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_BirthDay();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Date</em>'.
	 * @see org.soluvas.commons.Person#getBirthDate()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_BirthDate();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see org.soluvas.commons.Person#getGender()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Gender();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.soluvas.commons.Person#getLanguage()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getCurrencyCode <em>Currency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Code</em>'.
	 * @see org.soluvas.commons.Person#getCurrencyCode()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_CurrencyCode();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see org.soluvas.commons.Person#getCurrency()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Currency();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getGooglePlusId <em>Google Plus Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Google Plus Id</em>'.
	 * @see org.soluvas.commons.Person#getGooglePlusId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_GooglePlusId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getGoogleUsername <em>Google Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Google Username</em>'.
	 * @see org.soluvas.commons.Person#getGoogleUsername()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_GoogleUsername();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getVirtualMail <em>Virtual Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Mail</em>'.
	 * @see org.soluvas.commons.Person#getVirtualMail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_VirtualMail();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getNickname <em>Nickname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nickname</em>'.
	 * @see org.soluvas.commons.Person#getNickname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Nickname();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getCustomerRole <em>Customer Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Role</em>'.
	 * @see org.soluvas.commons.Person#getCustomerRole()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_CustomerRole();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getMemberRole <em>Member Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Role</em>'.
	 * @see org.soluvas.commons.Person#getMemberRole()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_MemberRole();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getManagerRole <em>Manager Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager Role</em>'.
	 * @see org.soluvas.commons.Person#getManagerRole()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ManagerRole();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getTimeZoneId <em>Time Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Zone Id</em>'.
	 * @see org.soluvas.commons.Person#getTimeZoneId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_TimeZoneId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getTimeZone <em>Time Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Zone</em>'.
	 * @see org.soluvas.commons.Person#getTimeZone()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_TimeZone();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getReferrerId <em>Referrer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referrer Id</em>'.
	 * @see org.soluvas.commons.Person#getReferrerId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ReferrerId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getReferrerType <em>Referrer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referrer Type</em>'.
	 * @see org.soluvas.commons.Person#getReferrerType()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ReferrerType();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getSignupSource <em>Signup Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signup Source</em>'.
	 * @see org.soluvas.commons.Person#getSignupSource()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SignupSource();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getSignupSourceType <em>Signup Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signup Source Type</em>'.
	 * @see org.soluvas.commons.Person#getSignupSourceType()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SignupSourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getIpAddress <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Address</em>'.
	 * @see org.soluvas.commons.Person#getIpAddress()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_IpAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getLastIpAddress <em>Last Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Ip Address</em>'.
	 * @see org.soluvas.commons.Person#getLastIpAddress()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastIpAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getLastLoginTime <em>Last Login Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Login Time</em>'.
	 * @see org.soluvas.commons.Person#getLastLoginTime()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastLoginTime();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getValidationTime <em>Validation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Time</em>'.
	 * @see org.soluvas.commons.Person#getValidationTime()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ValidationTime();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getActivationTime <em>Activation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Time</em>'.
	 * @see org.soluvas.commons.Person#getActivationTime()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ActivationTime();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getVerificationTime <em>Verification Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verification Time</em>'.
	 * @see org.soluvas.commons.Person#getVerificationTime()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_VerificationTime();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getNewsletterSubscriptionEnabled <em>Newsletter Subscription Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newsletter Subscription Enabled</em>'.
	 * @see org.soluvas.commons.Person#getNewsletterSubscriptionEnabled()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_NewsletterSubscriptionEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getNewsletterSubscriptionTime <em>Newsletter Subscription Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newsletter Subscription Time</em>'.
	 * @see org.soluvas.commons.Person#getNewsletterSubscriptionTime()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_NewsletterSubscriptionTime();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getSocialSharingEnabled <em>Social Sharing Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social Sharing Enabled</em>'.
	 * @see org.soluvas.commons.Person#getSocialSharingEnabled()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SocialSharingEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getPublicationStatus <em>Publication Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Status</em>'.
	 * @see org.soluvas.commons.Person#getPublicationStatus()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PublicationStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getArchivalStatus <em>Archival Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archival Status</em>'.
	 * @see org.soluvas.commons.Person#getArchivalStatus()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ArchivalStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder</em>'.
	 * @see org.soluvas.commons.Person#getFolder()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Folder();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getReligion <em>Religion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Religion</em>'.
	 * @see org.soluvas.commons.Person#getReligion()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Religion();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getPasswordResetCode <em>Password Reset Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Reset Code</em>'.
	 * @see org.soluvas.commons.Person#getPasswordResetCode()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PasswordResetCode();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getPasswordResetExpiryTime <em>Password Reset Expiry Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Reset Expiry Time</em>'.
	 * @see org.soluvas.commons.Person#getPasswordResetExpiryTime()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PasswordResetExpiryTime();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getClientAccessToken <em>Client Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Access Token</em>'.
	 * @see org.soluvas.commons.Person#getClientAccessToken()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ClientAccessToken();

	/**
	 * Returns the meta object for the attribute list '{@link org.soluvas.commons.Person#getSecurityRoleIds <em>Security Role Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Security Role Ids</em>'.
	 * @see org.soluvas.commons.Person#getSecurityRoleIds()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SecurityRoleIds();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getDebitBalance <em>Debit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debit Balance</em>'.
	 * @see org.soluvas.commons.Person#getDebitBalance()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DebitBalance();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getDebitCurrency <em>Debit Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debit Currency</em>'.
	 * @see org.soluvas.commons.Person#getDebitCurrency()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DebitCurrency();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.soluvas.commons.Person#getType()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getVerifyCode <em>Verify Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verify Code</em>'.
	 * @see org.soluvas.commons.Person#getVerifyCode()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_VerifyCode();

	/**
	 * Returns the meta object for the reference list '{@link org.soluvas.commons.Person#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organizations</em>'.
	 * @see org.soluvas.commons.Person#getOrganizations()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Organizations();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getZendeskUserId <em>Zendesk User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zendesk User Id</em>'.
	 * @see org.soluvas.commons.Person#getZendeskUserId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ZendeskUserId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getCustomerRoleEditTime <em>Customer Role Edit Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Role Edit Time</em>'.
	 * @see org.soluvas.commons.Person#getCustomerRoleEditTime()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_CustomerRoleEditTime();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#getLastTimeSynchronizeWithZendesk <em>Last Time Synchronize With Zendesk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Time Synchronize With Zendesk</em>'.
	 * @see org.soluvas.commons.Person#getLastTimeSynchronizeWithZendesk()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastTimeSynchronizeWithZendesk();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Person#isZendeskIntegration <em>Zendesk Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zendesk Integration</em>'.
	 * @see org.soluvas.commons.Person#isZendeskIntegration()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ZendeskIntegration();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.PhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phone Number</em>'.
	 * @see org.soluvas.commons.PhoneNumber
	 * @generated
	 */
	EClass getPhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PhoneNumber#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see org.soluvas.commons.PhoneNumber#getPhoneNumber()
	 * @see #getPhoneNumber()
	 * @generated
	 */
	EAttribute getPhoneNumber_PhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PhoneNumber#isPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary</em>'.
	 * @see org.soluvas.commons.PhoneNumber#isPrimary()
	 * @see #getPhoneNumber()
	 * @generated
	 */
	EAttribute getPhoneNumber_Primary();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PhoneNumber#getValidationTime <em>Validation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Time</em>'.
	 * @see org.soluvas.commons.PhoneNumber#getValidationTime()
	 * @see #getPhoneNumber()
	 * @generated
	 */
	EAttribute getPhoneNumber_ValidationTime();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Email <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email</em>'.
	 * @see org.soluvas.commons.Email
	 * @generated
	 */
	EClass getEmail();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Email#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.soluvas.commons.Email#getEmail()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Email#isPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary</em>'.
	 * @see org.soluvas.commons.Email#isPrimary()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_Primary();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Email#getValidationTime <em>Validation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Time</em>'.
	 * @see org.soluvas.commons.Email#getValidationTime()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_ValidationTime();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.PostalAddress <em>Postal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Address</em>'.
	 * @see org.soluvas.commons.PostalAddress
	 * @generated
	 */
	EClass getPostalAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see org.soluvas.commons.PostalAddress#getSchemaVersion()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_SchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see org.soluvas.commons.PostalAddress#getOrganization()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_Organization();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see org.soluvas.commons.PostalAddress#getStreet()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.soluvas.commons.PostalAddress#getCity()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see org.soluvas.commons.PostalAddress#getPostalCode()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getProvince <em>Province</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Province</em>'.
	 * @see org.soluvas.commons.PostalAddress#getProvince()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_Province();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.soluvas.commons.PostalAddress#getCountry()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see org.soluvas.commons.PostalAddress#getCountryCode()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getPrimaryMobile <em>Primary Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Mobile</em>'.
	 * @see org.soluvas.commons.PostalAddress#getPrimaryMobile()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_PrimaryMobile();

	/**
	 * Returns the meta object for the attribute list '{@link org.soluvas.commons.PostalAddress#getMobiles <em>Mobiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mobiles</em>'.
	 * @see org.soluvas.commons.PostalAddress#getMobiles()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_Mobiles();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getPrimaryPhone <em>Primary Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Phone</em>'.
	 * @see org.soluvas.commons.PostalAddress#getPrimaryPhone()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_PrimaryPhone();

	/**
	 * Returns the meta object for the attribute list '{@link org.soluvas.commons.PostalAddress#getPhones <em>Phones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Phones</em>'.
	 * @see org.soluvas.commons.PostalAddress#getPhones()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_Phones();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getPrimaryHomePhone <em>Primary Home Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Home Phone</em>'.
	 * @see org.soluvas.commons.PostalAddress#getPrimaryHomePhone()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_PrimaryHomePhone();

	/**
	 * Returns the meta object for the attribute list '{@link org.soluvas.commons.PostalAddress#getHomePhones <em>Home Phones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Home Phones</em>'.
	 * @see org.soluvas.commons.PostalAddress#getHomePhones()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_HomePhones();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getPrimaryWorkPhone <em>Primary Work Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Work Phone</em>'.
	 * @see org.soluvas.commons.PostalAddress#getPrimaryWorkPhone()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_PrimaryWorkPhone();

	/**
	 * Returns the meta object for the attribute list '{@link org.soluvas.commons.PostalAddress#getWorkPhones <em>Work Phones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Work Phones</em>'.
	 * @see org.soluvas.commons.PostalAddress#getWorkPhones()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_WorkPhones();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getPrimaryEmail <em>Primary Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Email</em>'.
	 * @see org.soluvas.commons.PostalAddress#getPrimaryEmail()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_PrimaryEmail();

	/**
	 * Returns the meta object for the attribute list '{@link org.soluvas.commons.PostalAddress#getEmails <em>Emails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Emails</em>'.
	 * @see org.soluvas.commons.PostalAddress#getEmails()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_Emails();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.soluvas.commons.PostalAddress#getDescription()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#isPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary</em>'.
	 * @see org.soluvas.commons.PostalAddress#isPrimary()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_Primary();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#isPrimaryBilling <em>Primary Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Billing</em>'.
	 * @see org.soluvas.commons.PostalAddress#isPrimaryBilling()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_PrimaryBilling();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#isPrimaryShipping <em>Primary Shipping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Shipping</em>'.
	 * @see org.soluvas.commons.PostalAddress#isPrimaryShipping()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_PrimaryShipping();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getValidationTime <em>Validation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Time</em>'.
	 * @see org.soluvas.commons.PostalAddress#getValidationTime()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_ValidationTime();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getDistrict <em>District</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>District</em>'.
	 * @see org.soluvas.commons.PostalAddress#getDistrict()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_District();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PostalAddress#getJneAreaCode <em>Jne Area Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jne Area Code</em>'.
	 * @see org.soluvas.commons.PostalAddress#getJneAreaCode()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_JneAreaCode();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.PersonCatalog <em>Person Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Catalog</em>'.
	 * @see org.soluvas.commons.PersonCatalog
	 * @generated
	 */
	EClass getPersonCatalog();

	/**
	 * Returns the meta object for the containment reference list '{@link org.soluvas.commons.PersonCatalog#getPeople <em>People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>People</em>'.
	 * @see org.soluvas.commons.PersonCatalog#getPeople()
	 * @see #getPersonCatalog()
	 * @generated
	 */
	EReference getPersonCatalog_People();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.CanonicalSluggable <em>Canonical Sluggable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canonical Sluggable</em>'.
	 * @see org.soluvas.commons.CanonicalSluggable
	 * @generated
	 */
	EClass getCanonicalSluggable();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CanonicalSluggable#getCanonicalSlug <em>Canonical Slug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canonical Slug</em>'.
	 * @see org.soluvas.commons.CanonicalSluggable#getCanonicalSlug()
	 * @see #getCanonicalSluggable()
	 * @generated
	 */
	EAttribute getCanonicalSluggable_CanonicalSlug();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.TwitterAccessible <em>Twitter Accessible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter Accessible</em>'.
	 * @see org.soluvas.commons.TwitterAccessible
	 * @generated
	 */
	EClass getTwitterAccessible();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.TwitterAccessible#getTwitterAccessToken <em>Twitter Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Twitter Access Token</em>'.
	 * @see org.soluvas.commons.TwitterAccessible#getTwitterAccessToken()
	 * @see #getTwitterAccessible()
	 * @generated
	 */
	EAttribute getTwitterAccessible_TwitterAccessToken();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.TwitterAccessible#getTwitterAccessTokenSecret <em>Twitter Access Token Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Twitter Access Token Secret</em>'.
	 * @see org.soluvas.commons.TwitterAccessible#getTwitterAccessTokenSecret()
	 * @see #getTwitterAccessible()
	 * @generated
	 */
	EAttribute getTwitterAccessible_TwitterAccessTokenSecret();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.TwitterIdentity <em>Twitter Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter Identity</em>'.
	 * @see org.soluvas.commons.TwitterIdentity
	 * @generated
	 */
	EClass getTwitterIdentity();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.TwitterIdentity#getTwitterId <em>Twitter Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Twitter Id</em>'.
	 * @see org.soluvas.commons.TwitterIdentity#getTwitterId()
	 * @see #getTwitterIdentity()
	 * @generated
	 */
	EAttribute getTwitterIdentity_TwitterId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.TwitterIdentity#getTwitterScreenName <em>Twitter Screen Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Twitter Screen Name</em>'.
	 * @see org.soluvas.commons.TwitterIdentity#getTwitterScreenName()
	 * @see #getTwitterIdentity()
	 * @generated
	 */
	EAttribute getTwitterIdentity_TwitterScreenName();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.FacebookIdentity <em>Facebook Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facebook Identity</em>'.
	 * @see org.soluvas.commons.FacebookIdentity
	 * @generated
	 */
	EClass getFacebookIdentity();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.FacebookIdentity#getFacebookId <em>Facebook Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facebook Id</em>'.
	 * @see org.soluvas.commons.FacebookIdentity#getFacebookId()
	 * @see #getFacebookIdentity()
	 * @generated
	 */
	EAttribute getFacebookIdentity_FacebookId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.FacebookIdentity#getFacebookUsername <em>Facebook Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facebook Username</em>'.
	 * @see org.soluvas.commons.FacebookIdentity#getFacebookUsername()
	 * @see #getFacebookIdentity()
	 * @generated
	 */
	EAttribute getFacebookIdentity_FacebookUsername();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.FacebookAccessible <em>Facebook Accessible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facebook Accessible</em>'.
	 * @see org.soluvas.commons.FacebookAccessible
	 * @generated
	 */
	EClass getFacebookAccessible();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.FacebookAccessible#getFacebookAccessToken <em>Facebook Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facebook Access Token</em>'.
	 * @see org.soluvas.commons.FacebookAccessible#getFacebookAccessToken()
	 * @see #getFacebookAccessible()
	 * @generated
	 */
	EAttribute getFacebookAccessible_FacebookAccessToken();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Revisionable <em>Revisionable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revisionable</em>'.
	 * @see org.soluvas.commons.Revisionable
	 * @generated
	 */
	EClass getRevisionable();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Revisionable#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid</em>'.
	 * @see org.soluvas.commons.Revisionable#getGuid()
	 * @see #getRevisionable()
	 * @generated
	 */
	EAttribute getRevisionable_Guid();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Revisionable#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.soluvas.commons.Revisionable#getRevision()
	 * @see #getRevisionable()
	 * @generated
	 */
	EAttribute getRevisionable_Revision();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.SysConfig <em>Sys Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys Config</em>'.
	 * @see org.soluvas.commons.SysConfig
	 * @generated
	 */
	EClass getSysConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.SysConfig#getTenantId <em>Tenant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Id</em>'.
	 * @see org.soluvas.commons.SysConfig#getTenantId()
	 * @see #getSysConfig()
	 * @generated
	 */
	EAttribute getSysConfig_TenantId();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Geolocation <em>Geolocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geolocation</em>'.
	 * @see org.soluvas.commons.Geolocation
	 * @generated
	 */
	EClass getGeolocation();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Geolocation#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see org.soluvas.commons.Geolocation#getLatitude()
	 * @see #getGeolocation()
	 * @generated
	 */
	EAttribute getGeolocation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Geolocation#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see org.soluvas.commons.Geolocation#getLongitude()
	 * @see #getGeolocation()
	 * @generated
	 */
	EAttribute getGeolocation_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Geolocation#getElevation <em>Elevation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevation</em>'.
	 * @see org.soluvas.commons.Geolocation#getElevation()
	 * @see #getGeolocation()
	 * @generated
	 */
	EAttribute getGeolocation_Elevation();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.ThingInfo <em>Thing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing Info</em>'.
	 * @see org.soluvas.commons.ThingInfo
	 * @generated
	 */
	EClass getThingInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.ThingInfo#getImageId <em>Image Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Id</em>'.
	 * @see org.soluvas.commons.ThingInfo#getImageId()
	 * @see #getThingInfo()
	 * @generated
	 */
	EAttribute getThingInfo_ImageId();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.GeneralSysConfig <em>General Sys Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Sys Config</em>'.
	 * @see org.soluvas.commons.GeneralSysConfig
	 * @generated
	 */
	EClass getGeneralSysConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.GeneralSysConfig#getSslSupported <em>Ssl Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssl Supported</em>'.
	 * @see org.soluvas.commons.GeneralSysConfig#getSslSupported()
	 * @see #getGeneralSysConfig()
	 * @generated
	 */
	EAttribute getGeneralSysConfig_SslSupported();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.soluvas.commons.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Organization#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see org.soluvas.commons.Organization#getSchemaVersion()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_SchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Organization#getBlackBerryPin <em>Black Berry Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Black Berry Pin</em>'.
	 * @see org.soluvas.commons.Organization#getBlackBerryPin()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_BlackBerryPin();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Organization#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see org.soluvas.commons.Organization#getWebsite()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Website();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Organization#getFacebookPageUri <em>Facebook Page Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facebook Page Uri</em>'.
	 * @see org.soluvas.commons.Organization#getFacebookPageUri()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_FacebookPageUri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Organization#getFacebookAccessToken <em>Facebook Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facebook Access Token</em>'.
	 * @see org.soluvas.commons.Organization#getFacebookAccessToken()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_FacebookAccessToken();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Organization#getFacebookId <em>Facebook Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facebook Id</em>'.
	 * @see org.soluvas.commons.Organization#getFacebookId()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_FacebookId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Organization#getFacebookUserName <em>Facebook User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facebook User Name</em>'.
	 * @see org.soluvas.commons.Organization#getFacebookUserName()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_FacebookUserName();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Organization#getTwitterScreenName <em>Twitter Screen Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Twitter Screen Name</em>'.
	 * @see org.soluvas.commons.Organization#getTwitterScreenName()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_TwitterScreenName();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Organization#getTwitterAccessToken <em>Twitter Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Twitter Access Token</em>'.
	 * @see org.soluvas.commons.Organization#getTwitterAccessToken()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_TwitterAccessToken();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Organization#getTwitterAccessTokenSecret <em>Twitter Access Token Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Twitter Access Token Secret</em>'.
	 * @see org.soluvas.commons.Organization#getTwitterAccessTokenSecret()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_TwitterAccessTokenSecret();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Organization#getTwitterId <em>Twitter Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Twitter Id</em>'.
	 * @see org.soluvas.commons.Organization#getTwitterId()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_TwitterId();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.CustomerRole <em>Customer Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Role</em>'.
	 * @see org.soluvas.commons.CustomerRole
	 * @generated
	 */
	EClass getCustomerRole();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CustomerRole#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see org.soluvas.commons.CustomerRole#getSchemaVersion()
	 * @see #getCustomerRole()
	 * @generated
	 */
	EAttribute getCustomerRole_SchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CustomerRole#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.soluvas.commons.CustomerRole#getStatus()
	 * @see #getCustomerRole()
	 * @generated
	 */
	EAttribute getCustomerRole_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CustomerRole#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.soluvas.commons.CustomerRole#isReadOnly()
	 * @see #getCustomerRole()
	 * @generated
	 */
	EAttribute getCustomerRole_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CustomerRole#isQuickShopEnabled <em>Quick Shop Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quick Shop Enabled</em>'.
	 * @see org.soluvas.commons.CustomerRole#isQuickShopEnabled()
	 * @see #getCustomerRole()
	 * @generated
	 */
	EAttribute getCustomerRole_QuickShopEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CustomerRole#isSalesOrderReportEnabled <em>Sales Order Report Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Order Report Enabled</em>'.
	 * @see org.soluvas.commons.CustomerRole#isSalesOrderReportEnabled()
	 * @see #getCustomerRole()
	 * @generated
	 */
	EAttribute getCustomerRole_SalesOrderReportEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CustomerRole#isHistorySalesOrderEnabled <em>History Sales Order Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>History Sales Order Enabled</em>'.
	 * @see org.soluvas.commons.CustomerRole#isHistorySalesOrderEnabled()
	 * @see #getCustomerRole()
	 * @generated
	 */
	EAttribute getCustomerRole_HistorySalesOrderEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CustomerRole#isAgentSalesReportEnabled <em>Agent Sales Report Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent Sales Report Enabled</em>'.
	 * @see org.soluvas.commons.CustomerRole#isAgentSalesReportEnabled()
	 * @see #getCustomerRole()
	 * @generated
	 */
	EAttribute getCustomerRole_AgentSalesReportEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CustomerRole#isTransactionHistoryEnabled <em>Transaction History Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction History Enabled</em>'.
	 * @see org.soluvas.commons.CustomerRole#isTransactionHistoryEnabled()
	 * @see #getCustomerRole()
	 * @generated
	 */
	EAttribute getCustomerRole_TransactionHistoryEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CustomerRole#isBookingEnabled <em>Booking Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Enabled</em>'.
	 * @see org.soluvas.commons.CustomerRole#isBookingEnabled()
	 * @see #getCustomerRole()
	 * @generated
	 */
	EAttribute getCustomerRole_BookingEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CustomerRole#isPaymentGatewayEnabled <em>Payment Gateway Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Gateway Enabled</em>'.
	 * @see org.soluvas.commons.CustomerRole#isPaymentGatewayEnabled()
	 * @see #getCustomerRole()
	 * @generated
	 */
	EAttribute getCustomerRole_PaymentGatewayEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CustomerRole#getBookingExpiryTimeInMinutes <em>Booking Expiry Time In Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Expiry Time In Minutes</em>'.
	 * @see org.soluvas.commons.CustomerRole#getBookingExpiryTimeInMinutes()
	 * @see #getCustomerRole()
	 * @generated
	 */
	EAttribute getCustomerRole_BookingExpiryTimeInMinutes();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CustomerRole#isDropshipEnabled <em>Dropship Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dropship Enabled</em>'.
	 * @see org.soluvas.commons.CustomerRole#isDropshipEnabled()
	 * @see #getCustomerRole()
	 * @generated
	 */
	EAttribute getCustomerRole_DropshipEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CustomerRole#isReviewReminderEnabled <em>Review Reminder Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review Reminder Enabled</em>'.
	 * @see org.soluvas.commons.CustomerRole#isReviewReminderEnabled()
	 * @see #getCustomerRole()
	 * @generated
	 */
	EAttribute getCustomerRole_ReviewReminderEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CustomerRole#isZendeskIntegration <em>Zendesk Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zendesk Integration</em>'.
	 * @see org.soluvas.commons.CustomerRole#isZendeskIntegration()
	 * @see #getCustomerRole()
	 * @generated
	 */
	EAttribute getCustomerRole_ZendeskIntegration();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.CustomerRole#getZendeskOrganizationId <em>Zendesk Organization Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zendesk Organization Id</em>'.
	 * @see org.soluvas.commons.CustomerRole#getZendeskOrganizationId()
	 * @see #getCustomerRole()
	 * @generated
	 */
	EAttribute getCustomerRole_ZendeskOrganizationId();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.MongoSysConfig <em>Mongo Sys Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mongo Sys Config</em>'.
	 * @see org.soluvas.commons.MongoSysConfig
	 * @generated
	 */
	EClass getMongoSysConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.MongoSysConfig#getMongoUri <em>Mongo Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mongo Uri</em>'.
	 * @see org.soluvas.commons.MongoSysConfig#getMongoUri()
	 * @see #getMongoSysConfig()
	 * @generated
	 */
	EAttribute getMongoSysConfig_MongoUri();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see org.soluvas.commons.ResourceType
	 * @generated
	 */
	EEnum getResourceType();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see org.soluvas.commons.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.EClassStatus <em>EClass Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EClass Status</em>'.
	 * @see org.soluvas.commons.EClassStatus
	 * @generated
	 */
	EEnum getEClassStatus();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.JavaClassStatus <em>Java Class Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Java Class Status</em>'.
	 * @see org.soluvas.commons.JavaClassStatus
	 * @generated
	 */
	EEnum getJavaClassStatus();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.ProgressStatus <em>Progress Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Progress Status</em>'.
	 * @see org.soluvas.commons.ProgressStatus
	 * @generated
	 */
	EEnum getProgressStatus();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.AccountStatus <em>Account Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Account Status</em>'.
	 * @see org.soluvas.commons.AccountStatus
	 * @generated
	 */
	EEnum getAccountStatus();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.PublicationStatus <em>Publication Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Publication Status</em>'.
	 * @see org.soluvas.commons.PublicationStatus
	 * @generated
	 */
	EEnum getPublicationStatus();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.ArchivalStatus <em>Archival Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Archival Status</em>'.
	 * @see org.soluvas.commons.ArchivalStatus
	 * @generated
	 */
	EEnum getArchivalStatus();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.TranslationState <em>Translation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Translation State</em>'.
	 * @see org.soluvas.commons.TranslationState
	 * @generated
	 */
	EEnum getTranslationState();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.ExpansionState <em>Expansion State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expansion State</em>'.
	 * @see org.soluvas.commons.ExpansionState
	 * @generated
	 */
	EEnum getExpansionState();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.SignupSourceType <em>Signup Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signup Source Type</em>'.
	 * @see org.soluvas.commons.SignupSourceType
	 * @generated
	 */
	EEnum getSignupSourceType();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.TenantSource <em>Tenant Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tenant Source</em>'.
	 * @see org.soluvas.commons.TenantSource
	 * @generated
	 */
	EEnum getTenantSource();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.GenericStatus <em>Generic Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generic Status</em>'.
	 * @see org.soluvas.commons.GenericStatus
	 * @generated
	 */
	EEnum getGenericStatus();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.CustomerRoleStatus <em>Customer Role Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Customer Role Status</em>'.
	 * @see org.soluvas.commons.CustomerRoleStatus
	 * @generated
	 */
	EEnum getCustomerRoleStatus();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.EntityKind <em>Entity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Kind</em>'.
	 * @see org.soluvas.commons.EntityKind
	 * @generated
	 */
	EEnum getEntityKind();

	/**
	 * Returns the meta object for data type '{@link org.joda.time.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time</em>'.
	 * @see org.joda.time.DateTime
	 * @model instanceClass="org.joda.time.DateTime"
	 * @generated
	 */
	EDataType getDateTime();

	/**
	 * Returns the meta object for data type '{@link javax.money.CurrencyUnit <em>Currency Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Currency Unit</em>'.
	 * @see javax.money.CurrencyUnit
	 * @model instanceClass="javax.money.CurrencyUnit"
	 * @generated
	 */
	EDataType getCurrencyUnit();

	/**
	 * Returns the meta object for data type '{@link javax.measure.quantity.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Quantity</em>'.
	 * @see javax.measure.quantity.Quantity
	 * @model instanceClass="javax.measure.quantity.Quantity"
	 * @generated
	 */
	EDataType getQuantity();

	/**
	 * Returns the meta object for data type '{@link javax.measure.unit.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit</em>'.
	 * @see javax.measure.unit.Unit
	 * @model instanceClass="javax.measure.unit.Unit" typeParameters="Q" QBounds="org.soluvas.commons.Quantity"
	 * @generated
	 */
	EDataType getUnit();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
	EDataType getMap();

	/**
	 * Returns the meta object for data type '{@link java.util.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Set</em>'.
	 * @see java.util.Set
	 * @model instanceClass="java.util.Set" typeParameters="T"
	 * @generated
	 */
	EDataType getSet();

	/**
	 * Returns the meta object for data type '{@link java.util.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T"
	 * @generated
	 */
	EDataType getCollection();

	/**
	 * Returns the meta object for data type '{@link com.google.common.collect.Multimap <em>Multimap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Multimap</em>'.
	 * @see com.google.common.collect.Multimap
	 * @model instanceClass="com.google.common.collect.Multimap" typeParameters="K V"
	 * @generated
	 */
	EDataType getMultimap();

	/**
	 * Returns the meta object for data type '{@link java.util.NavigableMap <em>Navigable Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Navigable Map</em>'.
	 * @see java.util.NavigableMap
	 * @model instanceClass="java.util.NavigableMap" typeParameters="K V"
	 * @generated
	 */
	EDataType getNavigableMap();

	/**
	 * Returns the meta object for data type '{@link java.util.Queue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Queue</em>'.
	 * @see java.util.Queue
	 * @model instanceClass="java.util.Queue" typeParameters="T"
	 * @generated
	 */
	EDataType getQueue();

	/**
	 * Returns the meta object for data type '{@link com.google.common.collect.Multiset <em>Multiset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Multiset</em>'.
	 * @see com.google.common.collect.Multiset
	 * @model instanceClass="com.google.common.collect.Multiset" typeParameters="T"
	 * @generated
	 */
	EDataType getMultiset();

	/**
	 * Returns the meta object for data type '{@link java.io.Serializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Serializable</em>'.
	 * @see java.io.Serializable
	 * @model instanceClass="java.io.Serializable"
	 * @generated
	 */
	EDataType getSerializable();

	/**
	 * Returns the meta object for data type '{@link org.osgi.framework.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bundle</em>'.
	 * @see org.osgi.framework.Bundle
	 * @model instanceClass="org.osgi.framework.Bundle" serializeable="false"
	 * @generated
	 */
	EDataType getBundle();

	/**
	 * Returns the meta object for data type '{@link org.javamoney.moneta.Money <em>Money</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Money</em>'.
	 * @see org.javamoney.moneta.Money
	 * @model instanceClass="org.javamoney.moneta.Money"
	 * @generated
	 */
	EDataType getMoney();

	/**
	 * Returns the meta object for data type '{@link javax.measure.Measurable <em>Measurable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Measurable</em>'.
	 * @see javax.measure.Measurable
	 * @model instanceClass="javax.measure.Measurable" typeParameters="Q" QBounds="org.soluvas.commons.Quantity"
	 * @generated
	 */
	EDataType getMeasurable();

	/**
	 * Returns the meta object for data type '{@link org.joda.time.DateTimeZone <em>Date Time Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time Zone</em>'.
	 * @see org.joda.time.DateTimeZone
	 * @model instanceClass="org.joda.time.DateTimeZone"
	 * @generated
	 */
	EDataType getDateTimeZone();

	/**
	 * Returns the meta object for data type '{@link java.util.Locale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Locale</em>'.
	 * @see java.util.Locale
	 * @model instanceClass="java.util.Locale"
	 * @generated
	 */
	EDataType getLocale();

	/**
	 * Returns the meta object for data type '{@link java.io.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>File</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File"
	 * @generated
	 */
	EDataType getFile();

	/**
	 * Returns the meta object for data type '{@link com.google.common.util.concurrent.ListenableFuture <em>Listenable Future</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Listenable Future</em>'.
	 * @see com.google.common.util.concurrent.ListenableFuture
	 * @model instanceClass="com.google.common.util.concurrent.ListenableFuture" serializeable="false" typeParameters="V"
	 * @generated
	 */
	EDataType getListenableFuture();

	/**
	 * Returns the meta object for data type '{@link com.google.common.util.concurrent.ListeningExecutorService <em>Listening Executor Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Listening Executor Service</em>'.
	 * @see com.google.common.util.concurrent.ListeningExecutorService
	 * @model instanceClass="com.google.common.util.concurrent.ListeningExecutorService" serializeable="false"
	 * @generated
	 */
	EDataType getListeningExecutorService();

	/**
	 * Returns the meta object for data type '{@link java.lang.ClassLoader <em>Class Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class Loader</em>'.
	 * @see java.lang.ClassLoader
	 * @model instanceClass="java.lang.ClassLoader" serializeable="false"
	 * @generated
	 */
	EDataType getClassLoader();

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URL</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL" serializeable="false"
	 * @generated
	 */
	EDataType getURL();

	/**
	 * Returns the meta object for data type '{@link com.google.common.eventbus.EventBus <em>Event Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Event Bus</em>'.
	 * @see com.google.common.eventbus.EventBus
	 * @model instanceClass="com.google.common.eventbus.EventBus" serializeable="false"
	 * @generated
	 */
	EDataType getEventBus();

	/**
	 * Returns the meta object for data type '{@link org.joda.time.LocalDate <em>Local Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Local Date</em>'.
	 * @see org.joda.time.LocalDate
	 * @model instanceClass="org.joda.time.LocalDate"
	 * @generated
	 */
	EDataType getLocalDate();

	/**
	 * Returns the meta object for data type '{@link java.util.NoSuchElementException <em>No Such Element Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>No Such Element Exception</em>'.
	 * @see java.util.NoSuchElementException
	 * @model instanceClass="java.util.NoSuchElementException"
	 * @generated
	 */
	EDataType getNoSuchElementException();

	/**
	 * Returns the meta object for data type '{@link java.util.Deque <em>Deque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Deque</em>'.
	 * @see java.util.Deque
	 * @model instanceClass="java.util.Deque" typeParameters="T"
	 * @generated
	 */
	EDataType getDeque();

	/**
	 * Returns the meta object for data type '{@link javax.measure.quantity.Temperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Temperature</em>'.
	 * @see javax.measure.quantity.Temperature
	 * @model instanceClass="javax.measure.quantity.Temperature"
	 * @generated
	 */
	EDataType getTemperature();

	/**
	 * Returns the meta object for data type '{@link org.joda.time.LocalTime <em>Local Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Local Time</em>'.
	 * @see org.joda.time.LocalTime
	 * @model instanceClass="org.joda.time.LocalTime"
	 * @generated
	 */
	EDataType getLocalTime();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.EFactory <em>EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFactory</em>'.
	 * @see org.eclipse.emf.ecore.EFactory
	 * @model instanceClass="org.eclipse.emf.ecore.EFactory" serializeable="false"
	 * @generated
	 */
	EDataType getEFactory();

	/**
	 * Returns the meta object for data type '{@link javax.measure.quantity.Mass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mass</em>'.
	 * @see javax.measure.quantity.Mass
	 * @model instanceClass="javax.measure.quantity.Mass" serializeable="false"
	 * @generated
	 */
	EDataType getMass();

	/**
	 * Returns the meta object for data type '{@link javax.measure.quantity.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Length</em>'.
	 * @see javax.measure.quantity.Length
	 * @model instanceClass="javax.measure.quantity.Length" serializeable="false"
	 * @generated
	 */
	EDataType getLength();

	/**
	 * Returns the meta object for data type '{@link com.google.common.collect.ListMultimap <em>List Multimap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List Multimap</em>'.
	 * @see com.google.common.collect.ListMultimap
	 * @model instanceClass="com.google.common.collect.ListMultimap" typeParameters="K V"
	 * @generated
	 */
	EDataType getListMultimap();

	/**
	 * Returns the meta object for data type '{@link java.util.UUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>UUID</em>'.
	 * @see java.util.UUID
	 * @model instanceClass="java.util.UUID"
	 * @generated
	 */
	EDataType getUUID();

	/**
	 * Returns the meta object for data type '{@link org.joda.time.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Period</em>'.
	 * @see org.joda.time.Period
	 * @model instanceClass="org.joda.time.Period"
	 * @generated
	 */
	EDataType getPeriod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonsFactory getCommonsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.soluvas.commons.ResourceAware <em>Resource Aware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.ResourceAware
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getResourceAware()
		 * @generated
		 */
		EClass RESOURCE_AWARE = eINSTANCE.getResourceAware();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_AWARE__RESOURCE_TYPE = eINSTANCE.getResourceAware_ResourceType();

		/**
		 * The meta object literal for the '<em><b>Resource Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_AWARE__RESOURCE_URI = eINSTANCE.getResourceAware_ResourceUri();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_AWARE__RESOURCE_NAME = eINSTANCE.getResourceAware_ResourceName();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Positionable <em>Positionable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Positionable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPositionable()
		 * @generated
		 */
		EClass POSITIONABLE = eINSTANCE.getPositionable();

		/**
		 * The meta object literal for the '<em><b>Positioner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONABLE__POSITIONER = eINSTANCE.getPositionable_Positioner();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.AppManifestImpl <em>App Manifest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.AppManifestImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getAppManifest()
		 * @generated
		 */
		EClass APP_MANIFEST = eINSTANCE.getAppManifest();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__TITLE = eINSTANCE.getAppManifest_Title();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__SUMMARY = eINSTANCE.getAppManifest_Summary();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__DESCRIPTION = eINSTANCE.getAppManifest_Description();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__DOMAIN = eINSTANCE.getAppManifest_Domain();

		/**
		 * The meta object literal for the '<em><b>Domain Prd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__DOMAIN_PRD = eINSTANCE.getAppManifest_DomainPrd();

		/**
		 * The meta object literal for the '<em><b>Domain Dev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__DOMAIN_DEV = eINSTANCE.getAppManifest_DomainDev();

		/**
		 * The meta object literal for the '<em><b>Domain Stg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__DOMAIN_STG = eINSTANCE.getAppManifest_DomainStg();

		/**
		 * The meta object literal for the '<em><b>General Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__GENERAL_EMAIL = eINSTANCE.getAppManifest_GeneralEmail();

		/**
		 * The meta object literal for the '<em><b>General Email Prd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__GENERAL_EMAIL_PRD = eINSTANCE.getAppManifest_GeneralEmailPrd();

		/**
		 * The meta object literal for the '<em><b>General Email Dev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__GENERAL_EMAIL_DEV = eINSTANCE.getAppManifest_GeneralEmailDev();

		/**
		 * The meta object literal for the '<em><b>General Email Stg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__GENERAL_EMAIL_STG = eINSTANCE.getAppManifest_GeneralEmailStg();

		/**
		 * The meta object literal for the '<em><b>Organization Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__ORGANIZATION_NAME = eINSTANCE.getAppManifest_OrganizationName();

		/**
		 * The meta object literal for the '<em><b>Organization Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__ORGANIZATION_ADDRESS = eINSTANCE.getAppManifest_OrganizationAddress();

		/**
		 * The meta object literal for the '<em><b>Organization Phone Numbers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__ORGANIZATION_PHONE_NUMBERS = eINSTANCE.getAppManifest_OrganizationPhoneNumbers();

		/**
		 * The meta object literal for the '<em><b>Default Time Zone Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__DEFAULT_TIME_ZONE_ID = eINSTANCE.getAppManifest_DefaultTimeZoneId();

		/**
		 * The meta object literal for the '<em><b>Default Time Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__DEFAULT_TIME_ZONE = eINSTANCE.getAppManifest_DefaultTimeZone();

		/**
		 * The meta object literal for the '<em><b>Default Currency Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__DEFAULT_CURRENCY_CODE = eINSTANCE.getAppManifest_DefaultCurrencyCode();

		/**
		 * The meta object literal for the '<em><b>Default Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__DEFAULT_CURRENCY = eINSTANCE.getAppManifest_DefaultCurrency();

		/**
		 * The meta object literal for the '<em><b>Default Language Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__DEFAULT_LANGUAGE_TAG = eINSTANCE.getAppManifest_DefaultLanguageTag();

		/**
		 * The meta object literal for the '<em><b>Default Country Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__DEFAULT_COUNTRY_CODE = eINSTANCE.getAppManifest_DefaultCountryCode();

		/**
		 * The meta object literal for the '<em><b>Default Category UName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__DEFAULT_CATEGORY_UNAME = eINSTANCE.getAppManifest_DefaultCategoryUName();

		/**
		 * The meta object literal for the '<em><b>Email Logo Uri Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__EMAIL_LOGO_URI_TEMPLATE = eINSTANCE.getAppManifest_EmailLogoUriTemplate();

		/**
		 * The meta object literal for the '<em><b>Letter Salutation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__LETTER_SALUTATION = eINSTANCE.getAppManifest_LetterSalutation();

		/**
		 * The meta object literal for the '<em><b>Letter Closing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__LETTER_CLOSING = eINSTANCE.getAppManifest_LetterClosing();

		/**
		 * The meta object literal for the '<em><b>Footnote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__FOOTNOTE = eINSTANCE.getAppManifest_Footnote();

		/**
		 * The meta object literal for the '<em><b>Www Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__WWW_USED = eINSTANCE.getAppManifest_WwwUsed();

		/**
		 * The meta object literal for the '<em><b>Head Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__HEAD_NOTE = eINSTANCE.getAppManifest_HeadNote();

		/**
		 * The meta object literal for the '<em><b>Head Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__HEAD_TITLE = eINSTANCE.getAppManifest_HeadTitle();

		/**
		 * The meta object literal for the '<em><b>Default Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__DEFAULT_STYLE = eINSTANCE.getAppManifest_DefaultStyle();

		/**
		 * The meta object literal for the '<em><b>Default Variation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__DEFAULT_VARIATION = eINSTANCE.getAppManifest_DefaultVariation();

		/**
		 * The meta object literal for the '<em><b>Kurs Dollar Paypal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__KURS_DOLLAR_PAYPAL = eINSTANCE.getAppManifest_KursDollarPaypal();

		/**
		 * The meta object literal for the '<em><b>Kurs Dollar Dpex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__KURS_DOLLAR_DPEX = eINSTANCE.getAppManifest_KursDollarDpex();

		/**
		 * The meta object literal for the '<em><b>Reminder Schedule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__REMINDER_SCHEDULE = eINSTANCE.getAppManifest_ReminderSchedule();

		/**
		 * The meta object literal for the '<em><b>Reminder Period Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__REMINDER_PERIOD_STR = eINSTANCE.getAppManifest_ReminderPeriodStr();

		/**
		 * The meta object literal for the '<em><b>Reminder Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__REMINDER_PERIOD = eINSTANCE.getAppManifest_ReminderPeriod();

		/**
		 * The meta object literal for the '<em><b>Reminder Schedule Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__REMINDER_SCHEDULE_STR = eINSTANCE.getAppManifest_ReminderScheduleStr();

		/**
		 * The meta object literal for the '<em><b>Support Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__SUPPORT_EMAIL = eINSTANCE.getAppManifest_SupportEmail();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.PersonInfoImpl <em>Person Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.PersonInfoImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPersonInfo()
		 * @generated
		 */
		EClass PERSON_INFO = eINSTANCE.getPersonInfo();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_INFO__GENDER = eINSTANCE.getPersonInfo_Gender();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_INFO__EMAIL = eINSTANCE.getPersonInfo_Email();

		/**
		 * The meta object literal for the '<em><b>Mobile Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_INFO__MOBILE_NUMBER = eINSTANCE.getPersonInfo_MobileNumber();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Timestamped <em>Timestamped</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Timestamped
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTimestamped()
		 * @generated
		 */
		EClass TIMESTAMPED = eINSTANCE.getTimestamped();

		/**
		 * The meta object literal for the '<em><b>Creation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESTAMPED__CREATION_TIME = eINSTANCE.getTimestamped_CreationTime();

		/**
		 * The meta object literal for the '<em><b>Modification Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESTAMPED__MODIFICATION_TIME = eINSTANCE.getTimestamped_ModificationTime();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Identifiable <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Identifiable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_Id();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Sluggable <em>Sluggable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Sluggable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getSluggable()
		 * @generated
		 */
		EClass SLUGGABLE = eINSTANCE.getSluggable();

		/**
		 * The meta object literal for the '<em><b>Slug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLUGGABLE__SLUG = eINSTANCE.getSluggable_Slug();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Nameable <em>Nameable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Nameable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getNameable()
		 * @generated
		 */
		EClass NAMEABLE = eINSTANCE.getNameable();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Imageable <em>Imageable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Imageable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getImageable()
		 * @generated
		 */
		EClass IMAGEABLE = eINSTANCE.getImageable();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.PhotoIdContainerImpl <em>Photo Id Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.PhotoIdContainerImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPhotoIdContainer()
		 * @generated
		 */
		EClass PHOTO_ID_CONTAINER = eINSTANCE.getPhotoIdContainer();

		/**
		 * The meta object literal for the '<em><b>Photo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO_ID_CONTAINER__PHOTO_ID = eINSTANCE.getPhotoIdContainer_PhotoId();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.NameContainer <em>Name Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.NameContainer
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getNameContainer()
		 * @generated
		 */
		EClass NAME_CONTAINER = eINSTANCE.getNameContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_CONTAINER__NAME = eINSTANCE.getNameContainer_Name();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Informer <em>Informer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Informer
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getInformer()
		 * @generated
		 */
		EClass INFORMER = eINSTANCE.getInformer();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Describable <em>Describable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Describable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getDescribable()
		 * @generated
		 */
		EClass DESCRIBABLE = eINSTANCE.getDescribable();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBABLE__DESCRIPTION = eINSTANCE.getDescribable_Description();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.BundleAware <em>Bundle Aware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.BundleAware
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getBundleAware()
		 * @generated
		 */
		EClass BUNDLE_AWARE = eINSTANCE.getBundleAware();

		/**
		 * The meta object literal for the '<em><b>Bundle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_AWARE__BUNDLE = eINSTANCE.getBundleAware_Bundle();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.JavaClassLinked <em>Java Class Linked</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.JavaClassLinked
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getJavaClassLinked()
		 * @generated
		 */
		EClass JAVA_CLASS_LINKED = eINSTANCE.getJavaClassLinked();

		/**
		 * The meta object literal for the '<em><b>Java Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_CLASS_LINKED__JAVA_CLASS_NAME = eINSTANCE.getJavaClassLinked_JavaClassName();

		/**
		 * The meta object literal for the '<em><b>Java Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_CLASS_LINKED__JAVA_CLASS = eINSTANCE.getJavaClassLinked_JavaClass();

		/**
		 * The meta object literal for the '<em><b>Java Class Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_CLASS_LINKED__JAVA_CLASS_STATUS = eINSTANCE.getJavaClassLinked_JavaClassStatus();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.EClassLinked <em>EClass Linked</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.EClassLinked
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEClassLinked()
		 * @generated
		 */
		EClass ECLASS_LINKED = eINSTANCE.getEClassLinked();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_LINKED__ECLASS = eINSTANCE.getEClassLinked_EClass();

		/**
		 * The meta object literal for the '<em><b>EClass Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS_LINKED__ECLASS_STATUS = eINSTANCE.getEClassLinked_EClassStatus();

		/**
		 * The meta object literal for the '<em><b>EPackage Ns Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS_LINKED__EPACKAGE_NS_PREFIX = eINSTANCE.getEClassLinked_EPackageNsPrefix();

		/**
		 * The meta object literal for the '<em><b>EClass Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS_LINKED__ECLASS_NAME = eINSTANCE.getEClassLinked_EClassName();

		/**
		 * The meta object literal for the '<em><b>EPackage Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS_LINKED__EPACKAGE_NAME = eINSTANCE.getEClassLinked_EPackageName();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.SchemaVersionable <em>Schema Versionable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.SchemaVersionable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getSchemaVersionable()
		 * @generated
		 */
		EClass SCHEMA_VERSIONABLE = eINSTANCE.getSchemaVersionable();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.EFactoryLinked <em>EFactory Linked</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.EFactoryLinked
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEFactoryLinked()
		 * @generated
		 */
		EClass EFACTORY_LINKED = eINSTANCE.getEFactoryLinked();

		/**
		 * The meta object literal for the '<em><b>EFactory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFACTORY_LINKED__EFACTORY = eINSTANCE.getEFactoryLinked_EFactory();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.NsPrefixable <em>Ns Prefixable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.NsPrefixable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getNsPrefixable()
		 * @generated
		 */
		EClass NS_PREFIXABLE = eINSTANCE.getNsPrefixable();

		/**
		 * The meta object literal for the '<em><b>Ns Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NS_PREFIXABLE__NS_PREFIX = eINSTANCE.getNsPrefixable_NsPrefix();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.WebAddressImpl <em>Web Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.WebAddressImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getWebAddress()
		 * @generated
		 */
		EClass WEB_ADDRESS = eINSTANCE.getWebAddress();

		/**
		 * The meta object literal for the '<em><b>Base Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ADDRESS__BASE_URI = eINSTANCE.getWebAddress_BaseUri();

		/**
		 * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ADDRESS__BASE_PATH = eINSTANCE.getWebAddress_BasePath();

		/**
		 * The meta object literal for the '<em><b>Api Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ADDRESS__API_PATH = eINSTANCE.getWebAddress_ApiPath();

		/**
		 * The meta object literal for the '<em><b>Images Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ADDRESS__IMAGES_URI = eINSTANCE.getWebAddress_ImagesUri();

		/**
		 * The meta object literal for the '<em><b>Skin Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ADDRESS__SKIN_URI = eINSTANCE.getWebAddress_SkinUri();

		/**
		 * The meta object literal for the '<em><b>Js Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ADDRESS__JS_URI = eINSTANCE.getWebAddress_JsUri();

		/**
		 * The meta object literal for the '<em><b>Secure Base Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ADDRESS__SECURE_BASE_URI = eINSTANCE.getWebAddress_SecureBaseUri();

		/**
		 * The meta object literal for the '<em><b>Secure Images Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ADDRESS__SECURE_IMAGES_URI = eINSTANCE.getWebAddress_SecureImagesUri();

		/**
		 * The meta object literal for the '<em><b>Secure Skin Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ADDRESS__SECURE_SKIN_URI = eINSTANCE.getWebAddress_SecureSkinUri();

		/**
		 * The meta object literal for the '<em><b>Secure Js Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ADDRESS__SECURE_JS_URI = eINSTANCE.getWebAddress_SecureJsUri();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.AddedImpl <em>Added</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.AddedImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getAdded()
		 * @generated
		 */
		EClass ADDED = eINSTANCE.getAdded();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.ModelNotificationImpl <em>Model Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.ModelNotificationImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getModelNotification()
		 * @generated
		 */
		EClass MODEL_NOTIFICATION = eINSTANCE.getModelNotification();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_NOTIFICATION__CONTAINER = eINSTANCE.getModelNotification_Container();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.AttributeSetImpl <em>Attribute Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.AttributeSetImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getAttributeSet()
		 * @generated
		 */
		EClass ATTRIBUTE_SET = eINSTANCE.getAttributeSet();

		/**
		 * The meta object literal for the '<em><b>Principals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_SET__PRINCIPALS = eINSTANCE.getAttributeSet_Principals();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.AttributeUnsetImpl <em>Attribute Unset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.AttributeUnsetImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getAttributeUnset()
		 * @generated
		 */
		EClass ATTRIBUTE_UNSET = eINSTANCE.getAttributeUnset();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.RemovedImpl <em>Removed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.RemovedImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getRemoved()
		 * @generated
		 */
		EClass REMOVED = eINSTANCE.getRemoved();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.ObjectNotificationImpl <em>Object Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.ObjectNotificationImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getObjectNotification()
		 * @generated
		 */
		EClass OBJECT_NOTIFICATION = eINSTANCE.getObjectNotification();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_NOTIFICATION__OBJECT = eINSTANCE.getObjectNotification_Object();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.AttributeNotificationImpl <em>Attribute Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.AttributeNotificationImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getAttributeNotification()
		 * @generated
		 */
		EClass ATTRIBUTE_NOTIFICATION = eINSTANCE.getAttributeNotification();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_NOTIFICATION__ATTRIBUTE = eINSTANCE.getAttributeNotification_Attribute();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_NOTIFICATION__OBJECT = eINSTANCE.getAttributeNotification_Object();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_NOTIFICATION__OLD_VALUE = eINSTANCE.getAttributeNotification_OldValue();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_NOTIFICATION__NEW_VALUE = eINSTANCE.getAttributeNotification_NewValue();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.AddedManyImpl <em>Added Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.AddedManyImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getAddedMany()
		 * @generated
		 */
		EClass ADDED_MANY = eINSTANCE.getAddedMany();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.RemovedManyImpl <em>Removed Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.RemovedManyImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getRemovedMany()
		 * @generated
		 */
		EClass REMOVED_MANY = eINSTANCE.getRemovedMany();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.ObjectsNotificationImpl <em>Objects Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.ObjectsNotificationImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getObjectsNotification()
		 * @generated
		 */
		EClass OBJECTS_NOTIFICATION = eINSTANCE.getObjectsNotification();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTS_NOTIFICATION__OBJECTS = eINSTANCE.getObjectsNotification_Objects();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.EObjectLinked <em>EObject Linked</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.EObjectLinked
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEObjectLinked()
		 * @generated
		 */
		EClass EOBJECT_LINKED = eINSTANCE.getEObjectLinked();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Parentable <em>Parentable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Parentable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getParentable()
		 * @generated
		 */
		EClass PARENTABLE = eINSTANCE.getParentable();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTABLE__PARENT = eINSTANCE.getParentable_Parent();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.CategoryLike <em>Category Like</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.CategoryLike
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getCategoryLike()
		 * @generated
		 */
		EClass CATEGORY_LIKE = eINSTANCE.getCategoryLike();

		/**
		 * The meta object literal for the '<em><b>Slug Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_LIKE__SLUG_PATH = eINSTANCE.getCategoryLike_SlugPath();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_LIKE__COLOR = eINSTANCE.getCategoryLike_Color();

		/**
		 * The meta object literal for the '<em><b>Image Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_LIKE__IMAGE_ID = eINSTANCE.getCategoryLike_ImageId();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_LIKE__LEVEL = eINSTANCE.getCategoryLike_Level();

		/**
		 * The meta object literal for the '<em><b>Category Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_LIKE__CATEGORY_COUNT = eINSTANCE.getCategoryLike_CategoryCount();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.CategoryInfoImpl <em>Category Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.CategoryInfoImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getCategoryInfo()
		 * @generated
		 */
		EClass CATEGORY_INFO = eINSTANCE.getCategoryInfo();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_INFO__PARENTS = eINSTANCE.getCategoryInfo_Parents();

		/**
		 * The meta object literal for the '<em><b>Primary Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_INFO__PRIMARY_URI = eINSTANCE.getCategoryInfo_PrimaryUri();

		/**
		 * The meta object literal for the '<em><b>Google Formal Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_INFO__GOOGLE_FORMAL_ID = eINSTANCE.getCategoryInfo_GoogleFormalId();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.ProgressMonitorImpl <em>Progress Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.ProgressMonitorImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getProgressMonitor()
		 * @generated
		 */
		EClass PROGRESS_MONITOR = eINSTANCE.getProgressMonitor();

		/**
		 * The meta object literal for the '<em><b>Canceled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_MONITOR__CANCELED = eINSTANCE.getProgressMonitor_Canceled();

		/**
		 * The meta object literal for the '<em><b>Task Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_MONITOR__TASK_NAME = eINSTANCE.getProgressMonitor_TaskName();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.ShellProgressMonitorImpl <em>Shell Progress Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.ShellProgressMonitorImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getShellProgressMonitor()
		 * @generated
		 */
		EClass SHELL_PROGRESS_MONITOR = eINSTANCE.getShellProgressMonitor();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.EventBusProgressMonitorImpl <em>Event Bus Progress Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.EventBusProgressMonitorImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEventBusProgressMonitor()
		 * @generated
		 */
		EClass EVENT_BUS_PROGRESS_MONITOR = eINSTANCE.getEventBusProgressMonitor();

		/**
		 * The meta object literal for the '<em><b>Event Bus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_BUS_PROGRESS_MONITOR__EVENT_BUS = eINSTANCE.getEventBusProgressMonitor_EventBus();

		/**
		 * The meta object literal for the '<em><b>Tracking Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_BUS_PROGRESS_MONITOR__TRACKING_ID = eINSTANCE.getEventBusProgressMonitor_TrackingId();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.ProgressMonitorWrapperImpl <em>Progress Monitor Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.ProgressMonitorWrapperImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getProgressMonitorWrapper()
		 * @generated
		 */
		EClass PROGRESS_MONITOR_WRAPPER = eINSTANCE.getProgressMonitorWrapper();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRESS_MONITOR_WRAPPER__DELEGATE = eINSTANCE.getProgressMonitorWrapper_Delegate();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Colorable <em>Colorable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Colorable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getColorable()
		 * @generated
		 */
		EClass COLORABLE = eINSTANCE.getColorable();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLORABLE__COLOR = eINSTANCE.getColorable_Color();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Translatable <em>Translatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Translatable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTranslatable()
		 * @generated
		 */
		EClass TRANSLATABLE = eINSTANCE.getTranslatable();

		/**
		 * The meta object literal for the '<em><b>Translation State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATABLE__TRANSLATION_STATE = eINSTANCE.getTranslatable_TranslationState();

		/**
		 * The meta object literal for the '<em><b>Original Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATABLE__ORIGINAL_LANGUAGE = eINSTANCE.getTranslatable_OriginalLanguage();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATABLE__LANGUAGE = eINSTANCE.getTranslatable_Language();

		/**
		 * The meta object literal for the '<em><b>Translations</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATABLE__TRANSLATIONS = eINSTANCE.getTranslatable_Translations();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.TranslationImpl <em>Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.TranslationImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTranslation()
		 * @generated
		 */
		EClass TRANSLATION = eINSTANCE.getTranslation();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__LANGUAGE = eINSTANCE.getTranslation_Language();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION__MESSAGES = eINSTANCE.getTranslation_Messages();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.TranslationMessageEntryImpl <em>Translation Message Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.TranslationMessageEntryImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTranslationMessageEntry()
		 * @generated
		 */
		EClass TRANSLATION_MESSAGE_ENTRY = eINSTANCE.getTranslationMessageEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION_MESSAGE_ENTRY__KEY = eINSTANCE.getTranslationMessageEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION_MESSAGE_ENTRY__VALUE = eINSTANCE.getTranslationMessageEntry_Value();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.TranslationManagerImpl <em>Translation Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.TranslationManagerImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTranslationManager()
		 * @generated
		 */
		EClass TRANSLATION_MANAGER = eINSTANCE.getTranslationManager();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.TranslationEntryImpl <em>Translation Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.TranslationEntryImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTranslationEntry()
		 * @generated
		 */
		EClass TRANSLATION_ENTRY = eINSTANCE.getTranslationEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION_ENTRY__VALUE = eINSTANCE.getTranslationEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION_ENTRY__KEY = eINSTANCE.getTranslationEntry_Key();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.StyleConfiguration <em>Style Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.StyleConfiguration
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getStyleConfiguration()
		 * @generated
		 */
		EClass STYLE_CONFIGURATION = eINSTANCE.getStyleConfiguration();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Expandable <em>Expandable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Expandable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getExpandable()
		 * @generated
		 */
		EClass EXPANDABLE = eINSTANCE.getExpandable();

		/**
		 * The meta object literal for the '<em><b>Expansion State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPANDABLE__EXPANSION_STATE = eINSTANCE.getExpandable_ExpansionState();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.PersonLike <em>Person Like</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.PersonLike
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPersonLike()
		 * @generated
		 */
		EClass PERSON_LIKE = eINSTANCE.getPersonLike();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.PersonImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SCHEMA_VERSION = eINSTANCE.getPerson_SchemaVersion();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PASSWORD = eINSTANCE.getPerson_Password();

		/**
		 * The meta object literal for the '<em><b>Phone Numbers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PHONE_NUMBERS = eINSTANCE.getPerson_PhoneNumbers();

		/**
		 * The meta object literal for the '<em><b>Emails</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__EMAILS = eINSTANCE.getPerson_Emails();

		/**
		 * The meta object literal for the '<em><b>Mobile Numbers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__MOBILE_NUMBERS = eINSTANCE.getPerson_MobileNumbers();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ADDRESSES = eINSTANCE.getPerson_Addresses();

		/**
		 * The meta object literal for the '<em><b>Account Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ACCOUNT_STATUS = eINSTANCE.getPerson_AccountStatus();

		/**
		 * The meta object literal for the '<em><b>Birth Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTH_YEAR = eINSTANCE.getPerson_BirthYear();

		/**
		 * The meta object literal for the '<em><b>Birth Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTH_MONTH = eINSTANCE.getPerson_BirthMonth();

		/**
		 * The meta object literal for the '<em><b>Birth Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTH_DAY = eINSTANCE.getPerson_BirthDay();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTH_DATE = eINSTANCE.getPerson_BirthDate();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LANGUAGE = eINSTANCE.getPerson_Language();

		/**
		 * The meta object literal for the '<em><b>Currency Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__CURRENCY_CODE = eINSTANCE.getPerson_CurrencyCode();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__CURRENCY = eINSTANCE.getPerson_Currency();

		/**
		 * The meta object literal for the '<em><b>Google Plus Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GOOGLE_PLUS_ID = eINSTANCE.getPerson_GooglePlusId();

		/**
		 * The meta object literal for the '<em><b>Google Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GOOGLE_USERNAME = eINSTANCE.getPerson_GoogleUsername();

		/**
		 * The meta object literal for the '<em><b>Virtual Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__VIRTUAL_MAIL = eINSTANCE.getPerson_VirtualMail();

		/**
		 * The meta object literal for the '<em><b>Nickname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NICKNAME = eINSTANCE.getPerson_Nickname();

		/**
		 * The meta object literal for the '<em><b>Customer Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__CUSTOMER_ROLE = eINSTANCE.getPerson_CustomerRole();

		/**
		 * The meta object literal for the '<em><b>Member Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MEMBER_ROLE = eINSTANCE.getPerson_MemberRole();

		/**
		 * The meta object literal for the '<em><b>Manager Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MANAGER_ROLE = eINSTANCE.getPerson_ManagerRole();

		/**
		 * The meta object literal for the '<em><b>Time Zone Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__TIME_ZONE_ID = eINSTANCE.getPerson_TimeZoneId();

		/**
		 * The meta object literal for the '<em><b>Time Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__TIME_ZONE = eINSTANCE.getPerson_TimeZone();

		/**
		 * The meta object literal for the '<em><b>Referrer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__REFERRER_ID = eINSTANCE.getPerson_ReferrerId();

		/**
		 * The meta object literal for the '<em><b>Referrer Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__REFERRER_TYPE = eINSTANCE.getPerson_ReferrerType();

		/**
		 * The meta object literal for the '<em><b>Signup Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SIGNUP_SOURCE = eINSTANCE.getPerson_SignupSource();

		/**
		 * The meta object literal for the '<em><b>Signup Source Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SIGNUP_SOURCE_TYPE = eINSTANCE.getPerson_SignupSourceType();

		/**
		 * The meta object literal for the '<em><b>Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__IP_ADDRESS = eINSTANCE.getPerson_IpAddress();

		/**
		 * The meta object literal for the '<em><b>Last Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_IP_ADDRESS = eINSTANCE.getPerson_LastIpAddress();

		/**
		 * The meta object literal for the '<em><b>Last Login Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_LOGIN_TIME = eINSTANCE.getPerson_LastLoginTime();

		/**
		 * The meta object literal for the '<em><b>Validation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__VALIDATION_TIME = eINSTANCE.getPerson_ValidationTime();

		/**
		 * The meta object literal for the '<em><b>Activation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ACTIVATION_TIME = eINSTANCE.getPerson_ActivationTime();

		/**
		 * The meta object literal for the '<em><b>Verification Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__VERIFICATION_TIME = eINSTANCE.getPerson_VerificationTime();

		/**
		 * The meta object literal for the '<em><b>Newsletter Subscription Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NEWSLETTER_SUBSCRIPTION_ENABLED = eINSTANCE.getPerson_NewsletterSubscriptionEnabled();

		/**
		 * The meta object literal for the '<em><b>Newsletter Subscription Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NEWSLETTER_SUBSCRIPTION_TIME = eINSTANCE.getPerson_NewsletterSubscriptionTime();

		/**
		 * The meta object literal for the '<em><b>Social Sharing Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SOCIAL_SHARING_ENABLED = eINSTANCE.getPerson_SocialSharingEnabled();

		/**
		 * The meta object literal for the '<em><b>Publication Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PUBLICATION_STATUS = eINSTANCE.getPerson_PublicationStatus();

		/**
		 * The meta object literal for the '<em><b>Archival Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ARCHIVAL_STATUS = eINSTANCE.getPerson_ArchivalStatus();

		/**
		 * The meta object literal for the '<em><b>Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FOLDER = eINSTANCE.getPerson_Folder();

		/**
		 * The meta object literal for the '<em><b>Religion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__RELIGION = eINSTANCE.getPerson_Religion();

		/**
		 * The meta object literal for the '<em><b>Password Reset Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PASSWORD_RESET_CODE = eINSTANCE.getPerson_PasswordResetCode();

		/**
		 * The meta object literal for the '<em><b>Password Reset Expiry Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PASSWORD_RESET_EXPIRY_TIME = eINSTANCE.getPerson_PasswordResetExpiryTime();

		/**
		 * The meta object literal for the '<em><b>Client Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__CLIENT_ACCESS_TOKEN = eINSTANCE.getPerson_ClientAccessToken();

		/**
		 * The meta object literal for the '<em><b>Security Role Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SECURITY_ROLE_IDS = eINSTANCE.getPerson_SecurityRoleIds();

		/**
		 * The meta object literal for the '<em><b>Debit Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DEBIT_BALANCE = eINSTANCE.getPerson_DebitBalance();

		/**
		 * The meta object literal for the '<em><b>Debit Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DEBIT_CURRENCY = eINSTANCE.getPerson_DebitCurrency();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__TYPE = eINSTANCE.getPerson_Type();

		/**
		 * The meta object literal for the '<em><b>Verify Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__VERIFY_CODE = eINSTANCE.getPerson_VerifyCode();

		/**
		 * The meta object literal for the '<em><b>Organizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ORGANIZATIONS = eINSTANCE.getPerson_Organizations();

		/**
		 * The meta object literal for the '<em><b>Zendesk User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ZENDESK_USER_ID = eINSTANCE.getPerson_ZendeskUserId();

		/**
		 * The meta object literal for the '<em><b>Customer Role Edit Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__CUSTOMER_ROLE_EDIT_TIME = eINSTANCE.getPerson_CustomerRoleEditTime();

		/**
		 * The meta object literal for the '<em><b>Last Time Synchronize With Zendesk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_TIME_SYNCHRONIZE_WITH_ZENDESK = eINSTANCE.getPerson_LastTimeSynchronizeWithZendesk();

		/**
		 * The meta object literal for the '<em><b>Zendesk Integration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ZENDESK_INTEGRATION = eINSTANCE.getPerson_ZendeskIntegration();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.PhoneNumberImpl <em>Phone Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.PhoneNumberImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPhoneNumber()
		 * @generated
		 */
		EClass PHONE_NUMBER = eINSTANCE.getPhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE_NUMBER__PHONE_NUMBER = eINSTANCE.getPhoneNumber_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE_NUMBER__PRIMARY = eINSTANCE.getPhoneNumber_Primary();

		/**
		 * The meta object literal for the '<em><b>Validation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE_NUMBER__VALIDATION_TIME = eINSTANCE.getPhoneNumber_ValidationTime();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.EmailImpl <em>Email</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.EmailImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEmail()
		 * @generated
		 */
		EClass EMAIL = eINSTANCE.getEmail();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__EMAIL = eINSTANCE.getEmail_Email();

		/**
		 * The meta object literal for the '<em><b>Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__PRIMARY = eINSTANCE.getEmail_Primary();

		/**
		 * The meta object literal for the '<em><b>Validation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__VALIDATION_TIME = eINSTANCE.getEmail_ValidationTime();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.PostalAddressImpl <em>Postal Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.PostalAddressImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPostalAddress()
		 * @generated
		 */
		EClass POSTAL_ADDRESS = eINSTANCE.getPostalAddress();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__SCHEMA_VERSION = eINSTANCE.getPostalAddress_SchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__ORGANIZATION = eINSTANCE.getPostalAddress_Organization();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__STREET = eINSTANCE.getPostalAddress_Street();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__CITY = eINSTANCE.getPostalAddress_City();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__POSTAL_CODE = eINSTANCE.getPostalAddress_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Province</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__PROVINCE = eINSTANCE.getPostalAddress_Province();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__COUNTRY = eINSTANCE.getPostalAddress_Country();

		/**
		 * The meta object literal for the '<em><b>Country Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__COUNTRY_CODE = eINSTANCE.getPostalAddress_CountryCode();

		/**
		 * The meta object literal for the '<em><b>Primary Mobile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__PRIMARY_MOBILE = eINSTANCE.getPostalAddress_PrimaryMobile();

		/**
		 * The meta object literal for the '<em><b>Mobiles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__MOBILES = eINSTANCE.getPostalAddress_Mobiles();

		/**
		 * The meta object literal for the '<em><b>Primary Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__PRIMARY_PHONE = eINSTANCE.getPostalAddress_PrimaryPhone();

		/**
		 * The meta object literal for the '<em><b>Phones</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__PHONES = eINSTANCE.getPostalAddress_Phones();

		/**
		 * The meta object literal for the '<em><b>Primary Home Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__PRIMARY_HOME_PHONE = eINSTANCE.getPostalAddress_PrimaryHomePhone();

		/**
		 * The meta object literal for the '<em><b>Home Phones</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__HOME_PHONES = eINSTANCE.getPostalAddress_HomePhones();

		/**
		 * The meta object literal for the '<em><b>Primary Work Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__PRIMARY_WORK_PHONE = eINSTANCE.getPostalAddress_PrimaryWorkPhone();

		/**
		 * The meta object literal for the '<em><b>Work Phones</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__WORK_PHONES = eINSTANCE.getPostalAddress_WorkPhones();

		/**
		 * The meta object literal for the '<em><b>Primary Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__PRIMARY_EMAIL = eINSTANCE.getPostalAddress_PrimaryEmail();

		/**
		 * The meta object literal for the '<em><b>Emails</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__EMAILS = eINSTANCE.getPostalAddress_Emails();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__DESCRIPTION = eINSTANCE.getPostalAddress_Description();

		/**
		 * The meta object literal for the '<em><b>Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__PRIMARY = eINSTANCE.getPostalAddress_Primary();

		/**
		 * The meta object literal for the '<em><b>Primary Billing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__PRIMARY_BILLING = eINSTANCE.getPostalAddress_PrimaryBilling();

		/**
		 * The meta object literal for the '<em><b>Primary Shipping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__PRIMARY_SHIPPING = eINSTANCE.getPostalAddress_PrimaryShipping();

		/**
		 * The meta object literal for the '<em><b>Validation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__VALIDATION_TIME = eINSTANCE.getPostalAddress_ValidationTime();

		/**
		 * The meta object literal for the '<em><b>District</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__DISTRICT = eINSTANCE.getPostalAddress_District();

		/**
		 * The meta object literal for the '<em><b>Jne Area Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__JNE_AREA_CODE = eINSTANCE.getPostalAddress_JneAreaCode();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.PersonCatalogImpl <em>Person Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.PersonCatalogImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPersonCatalog()
		 * @generated
		 */
		EClass PERSON_CATALOG = eINSTANCE.getPersonCatalog();

		/**
		 * The meta object literal for the '<em><b>People</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_CATALOG__PEOPLE = eINSTANCE.getPersonCatalog_People();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.CanonicalSluggable <em>Canonical Sluggable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.CanonicalSluggable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getCanonicalSluggable()
		 * @generated
		 */
		EClass CANONICAL_SLUGGABLE = eINSTANCE.getCanonicalSluggable();

		/**
		 * The meta object literal for the '<em><b>Canonical Slug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANONICAL_SLUGGABLE__CANONICAL_SLUG = eINSTANCE.getCanonicalSluggable_CanonicalSlug();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.TwitterAccessible <em>Twitter Accessible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.TwitterAccessible
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTwitterAccessible()
		 * @generated
		 */
		EClass TWITTER_ACCESSIBLE = eINSTANCE.getTwitterAccessible();

		/**
		 * The meta object literal for the '<em><b>Twitter Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_ACCESSIBLE__TWITTER_ACCESS_TOKEN = eINSTANCE.getTwitterAccessible_TwitterAccessToken();

		/**
		 * The meta object literal for the '<em><b>Twitter Access Token Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_ACCESSIBLE__TWITTER_ACCESS_TOKEN_SECRET = eINSTANCE.getTwitterAccessible_TwitterAccessTokenSecret();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.TwitterIdentity <em>Twitter Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.TwitterIdentity
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTwitterIdentity()
		 * @generated
		 */
		EClass TWITTER_IDENTITY = eINSTANCE.getTwitterIdentity();

		/**
		 * The meta object literal for the '<em><b>Twitter Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_IDENTITY__TWITTER_ID = eINSTANCE.getTwitterIdentity_TwitterId();

		/**
		 * The meta object literal for the '<em><b>Twitter Screen Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_IDENTITY__TWITTER_SCREEN_NAME = eINSTANCE.getTwitterIdentity_TwitterScreenName();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.FacebookIdentityImpl <em>Facebook Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.FacebookIdentityImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getFacebookIdentity()
		 * @generated
		 */
		EClass FACEBOOK_IDENTITY = eINSTANCE.getFacebookIdentity();

		/**
		 * The meta object literal for the '<em><b>Facebook Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACEBOOK_IDENTITY__FACEBOOK_ID = eINSTANCE.getFacebookIdentity_FacebookId();

		/**
		 * The meta object literal for the '<em><b>Facebook Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACEBOOK_IDENTITY__FACEBOOK_USERNAME = eINSTANCE.getFacebookIdentity_FacebookUsername();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.FacebookAccessibleImpl <em>Facebook Accessible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.FacebookAccessibleImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getFacebookAccessible()
		 * @generated
		 */
		EClass FACEBOOK_ACCESSIBLE = eINSTANCE.getFacebookAccessible();

		/**
		 * The meta object literal for the '<em><b>Facebook Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACEBOOK_ACCESSIBLE__FACEBOOK_ACCESS_TOKEN = eINSTANCE.getFacebookAccessible_FacebookAccessToken();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Revisionable <em>Revisionable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Revisionable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getRevisionable()
		 * @generated
		 */
		EClass REVISIONABLE = eINSTANCE.getRevisionable();

		/**
		 * The meta object literal for the '<em><b>Guid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISIONABLE__GUID = eINSTANCE.getRevisionable_Guid();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISIONABLE__REVISION = eINSTANCE.getRevisionable_Revision();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.SysConfig <em>Sys Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.SysConfig
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getSysConfig()
		 * @generated
		 */
		EClass SYS_CONFIG = eINSTANCE.getSysConfig();

		/**
		 * The meta object literal for the '<em><b>Tenant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYS_CONFIG__TENANT_ID = eINSTANCE.getSysConfig_TenantId();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.GeolocationImpl <em>Geolocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.GeolocationImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getGeolocation()
		 * @generated
		 */
		EClass GEOLOCATION = eINSTANCE.getGeolocation();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOLOCATION__LATITUDE = eINSTANCE.getGeolocation_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOLOCATION__LONGITUDE = eINSTANCE.getGeolocation_Longitude();

		/**
		 * The meta object literal for the '<em><b>Elevation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOLOCATION__ELEVATION = eINSTANCE.getGeolocation_Elevation();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.ThingInfoImpl <em>Thing Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.ThingInfoImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getThingInfo()
		 * @generated
		 */
		EClass THING_INFO = eINSTANCE.getThingInfo();

		/**
		 * The meta object literal for the '<em><b>Image Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_INFO__IMAGE_ID = eINSTANCE.getThingInfo_ImageId();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.GeneralSysConfigImpl <em>General Sys Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.GeneralSysConfigImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getGeneralSysConfig()
		 * @generated
		 */
		EClass GENERAL_SYS_CONFIG = eINSTANCE.getGeneralSysConfig();

		/**
		 * The meta object literal for the '<em><b>Ssl Supported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_SYS_CONFIG__SSL_SUPPORTED = eINSTANCE.getGeneralSysConfig_SslSupported();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.OrganizationImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__SCHEMA_VERSION = eINSTANCE.getOrganization_SchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Black Berry Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__BLACK_BERRY_PIN = eINSTANCE.getOrganization_BlackBerryPin();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__WEBSITE = eINSTANCE.getOrganization_Website();

		/**
		 * The meta object literal for the '<em><b>Facebook Page Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__FACEBOOK_PAGE_URI = eINSTANCE.getOrganization_FacebookPageUri();

		/**
		 * The meta object literal for the '<em><b>Facebook Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__FACEBOOK_ACCESS_TOKEN = eINSTANCE.getOrganization_FacebookAccessToken();

		/**
		 * The meta object literal for the '<em><b>Facebook Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__FACEBOOK_ID = eINSTANCE.getOrganization_FacebookId();

		/**
		 * The meta object literal for the '<em><b>Facebook User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__FACEBOOK_USER_NAME = eINSTANCE.getOrganization_FacebookUserName();

		/**
		 * The meta object literal for the '<em><b>Twitter Screen Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__TWITTER_SCREEN_NAME = eINSTANCE.getOrganization_TwitterScreenName();

		/**
		 * The meta object literal for the '<em><b>Twitter Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__TWITTER_ACCESS_TOKEN = eINSTANCE.getOrganization_TwitterAccessToken();

		/**
		 * The meta object literal for the '<em><b>Twitter Access Token Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__TWITTER_ACCESS_TOKEN_SECRET = eINSTANCE.getOrganization_TwitterAccessTokenSecret();

		/**
		 * The meta object literal for the '<em><b>Twitter Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__TWITTER_ID = eINSTANCE.getOrganization_TwitterId();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.CustomerRoleImpl <em>Customer Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.CustomerRoleImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getCustomerRole()
		 * @generated
		 */
		EClass CUSTOMER_ROLE = eINSTANCE.getCustomerRole();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ROLE__SCHEMA_VERSION = eINSTANCE.getCustomerRole_SchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ROLE__STATUS = eINSTANCE.getCustomerRole_Status();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ROLE__READ_ONLY = eINSTANCE.getCustomerRole_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Quick Shop Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ROLE__QUICK_SHOP_ENABLED = eINSTANCE.getCustomerRole_QuickShopEnabled();

		/**
		 * The meta object literal for the '<em><b>Sales Order Report Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ROLE__SALES_ORDER_REPORT_ENABLED = eINSTANCE.getCustomerRole_SalesOrderReportEnabled();

		/**
		 * The meta object literal for the '<em><b>History Sales Order Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ROLE__HISTORY_SALES_ORDER_ENABLED = eINSTANCE.getCustomerRole_HistorySalesOrderEnabled();

		/**
		 * The meta object literal for the '<em><b>Agent Sales Report Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ROLE__AGENT_SALES_REPORT_ENABLED = eINSTANCE.getCustomerRole_AgentSalesReportEnabled();

		/**
		 * The meta object literal for the '<em><b>Transaction History Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ROLE__TRANSACTION_HISTORY_ENABLED = eINSTANCE.getCustomerRole_TransactionHistoryEnabled();

		/**
		 * The meta object literal for the '<em><b>Booking Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ROLE__BOOKING_ENABLED = eINSTANCE.getCustomerRole_BookingEnabled();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ROLE__PAYMENT_GATEWAY_ENABLED = eINSTANCE.getCustomerRole_PaymentGatewayEnabled();

		/**
		 * The meta object literal for the '<em><b>Booking Expiry Time In Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ROLE__BOOKING_EXPIRY_TIME_IN_MINUTES = eINSTANCE.getCustomerRole_BookingExpiryTimeInMinutes();

		/**
		 * The meta object literal for the '<em><b>Dropship Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ROLE__DROPSHIP_ENABLED = eINSTANCE.getCustomerRole_DropshipEnabled();

		/**
		 * The meta object literal for the '<em><b>Review Reminder Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ROLE__REVIEW_REMINDER_ENABLED = eINSTANCE.getCustomerRole_ReviewReminderEnabled();

		/**
		 * The meta object literal for the '<em><b>Zendesk Integration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ROLE__ZENDESK_INTEGRATION = eINSTANCE.getCustomerRole_ZendeskIntegration();

		/**
		 * The meta object literal for the '<em><b>Zendesk Organization Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ROLE__ZENDESK_ORGANIZATION_ID = eINSTANCE.getCustomerRole_ZendeskOrganizationId();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.MongoSysConfig <em>Mongo Sys Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.MongoSysConfig
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getMongoSysConfig()
		 * @generated
		 */
		EClass MONGO_SYS_CONFIG = eINSTANCE.getMongoSysConfig();

		/**
		 * The meta object literal for the '<em><b>Mongo Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_SYS_CONFIG__MONGO_URI = eINSTANCE.getMongoSysConfig_MongoUri();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.ResourceType <em>Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.ResourceType
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getResourceType()
		 * @generated
		 */
		EEnum RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Gender
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.EClassStatus <em>EClass Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.EClassStatus
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEClassStatus()
		 * @generated
		 */
		EEnum ECLASS_STATUS = eINSTANCE.getEClassStatus();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.JavaClassStatus <em>Java Class Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.JavaClassStatus
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getJavaClassStatus()
		 * @generated
		 */
		EEnum JAVA_CLASS_STATUS = eINSTANCE.getJavaClassStatus();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.ProgressStatus <em>Progress Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.ProgressStatus
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getProgressStatus()
		 * @generated
		 */
		EEnum PROGRESS_STATUS = eINSTANCE.getProgressStatus();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.AccountStatus <em>Account Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.AccountStatus
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getAccountStatus()
		 * @generated
		 */
		EEnum ACCOUNT_STATUS = eINSTANCE.getAccountStatus();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.PublicationStatus <em>Publication Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.PublicationStatus
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPublicationStatus()
		 * @generated
		 */
		EEnum PUBLICATION_STATUS = eINSTANCE.getPublicationStatus();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.ArchivalStatus <em>Archival Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.ArchivalStatus
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getArchivalStatus()
		 * @generated
		 */
		EEnum ARCHIVAL_STATUS = eINSTANCE.getArchivalStatus();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.TranslationState <em>Translation State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.TranslationState
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTranslationState()
		 * @generated
		 */
		EEnum TRANSLATION_STATE = eINSTANCE.getTranslationState();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.ExpansionState <em>Expansion State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.ExpansionState
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getExpansionState()
		 * @generated
		 */
		EEnum EXPANSION_STATE = eINSTANCE.getExpansionState();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.SignupSourceType <em>Signup Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.SignupSourceType
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getSignupSourceType()
		 * @generated
		 */
		EEnum SIGNUP_SOURCE_TYPE = eINSTANCE.getSignupSourceType();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.TenantSource <em>Tenant Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.TenantSource
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTenantSource()
		 * @generated
		 */
		EEnum TENANT_SOURCE = eINSTANCE.getTenantSource();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.GenericStatus <em>Generic Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.GenericStatus
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getGenericStatus()
		 * @generated
		 */
		EEnum GENERIC_STATUS = eINSTANCE.getGenericStatus();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.CustomerRoleStatus <em>Customer Role Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.CustomerRoleStatus
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getCustomerRoleStatus()
		 * @generated
		 */
		EEnum CUSTOMER_ROLE_STATUS = eINSTANCE.getCustomerRoleStatus();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.EntityKind <em>Entity Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.EntityKind
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEntityKind()
		 * @generated
		 */
		EEnum ENTITY_KIND = eINSTANCE.getEntityKind();

		/**
		 * The meta object literal for the '<em>Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.joda.time.DateTime
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getDateTime()
		 * @generated
		 */
		EDataType DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em>Currency Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.money.CurrencyUnit
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getCurrencyUnit()
		 * @generated
		 */
		EDataType CURRENCY_UNIT = eINSTANCE.getCurrencyUnit();

		/**
		 * The meta object literal for the '<em>Quantity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.quantity.Quantity
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getQuantity()
		 * @generated
		 */
		EDataType QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em>Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.unit.Unit
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getUnit()
		 * @generated
		 */
		EDataType UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em>Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Set
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getSet()
		 * @generated
		 */
		EDataType SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em>Collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getCollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em>Multimap</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.common.collect.Multimap
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getMultimap()
		 * @generated
		 */
		EDataType MULTIMAP = eINSTANCE.getMultimap();

		/**
		 * The meta object literal for the '<em>Navigable Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.NavigableMap
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getNavigableMap()
		 * @generated
		 */
		EDataType NAVIGABLE_MAP = eINSTANCE.getNavigableMap();

		/**
		 * The meta object literal for the '<em>Queue</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Queue
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getQueue()
		 * @generated
		 */
		EDataType QUEUE = eINSTANCE.getQueue();

		/**
		 * The meta object literal for the '<em>Multiset</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.common.collect.Multiset
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getMultiset()
		 * @generated
		 */
		EDataType MULTISET = eINSTANCE.getMultiset();

		/**
		 * The meta object literal for the '<em>Serializable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.Serializable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getSerializable()
		 * @generated
		 */
		EDataType SERIALIZABLE = eINSTANCE.getSerializable();

		/**
		 * The meta object literal for the '<em>Bundle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osgi.framework.Bundle
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getBundle()
		 * @generated
		 */
		EDataType BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '<em>Money</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.javamoney.moneta.Money
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getMoney()
		 * @generated
		 */
		EDataType MONEY = eINSTANCE.getMoney();

		/**
		 * The meta object literal for the '<em>Measurable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.Measurable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getMeasurable()
		 * @generated
		 */
		EDataType MEASURABLE = eINSTANCE.getMeasurable();

		/**
		 * The meta object literal for the '<em>Date Time Zone</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.joda.time.DateTimeZone
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getDateTimeZone()
		 * @generated
		 */
		EDataType DATE_TIME_ZONE = eINSTANCE.getDateTimeZone();

		/**
		 * The meta object literal for the '<em>Locale</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Locale
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getLocale()
		 * @generated
		 */
		EDataType LOCALE = eINSTANCE.getLocale();

		/**
		 * The meta object literal for the '<em>File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getFile()
		 * @generated
		 */
		EDataType FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em>Listenable Future</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.common.util.concurrent.ListenableFuture
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getListenableFuture()
		 * @generated
		 */
		EDataType LISTENABLE_FUTURE = eINSTANCE.getListenableFuture();

		/**
		 * The meta object literal for the '<em>Listening Executor Service</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.common.util.concurrent.ListeningExecutorService
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getListeningExecutorService()
		 * @generated
		 */
		EDataType LISTENING_EXECUTOR_SERVICE = eINSTANCE.getListeningExecutorService();

		/**
		 * The meta object literal for the '<em>Class Loader</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.ClassLoader
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getClassLoader()
		 * @generated
		 */
		EDataType CLASS_LOADER = eINSTANCE.getClassLoader();

		/**
		 * The meta object literal for the '<em>URL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getURL()
		 * @generated
		 */
		EDataType URL = eINSTANCE.getURL();

		/**
		 * The meta object literal for the '<em>Event Bus</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.common.eventbus.EventBus
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEventBus()
		 * @generated
		 */
		EDataType EVENT_BUS = eINSTANCE.getEventBus();

		/**
		 * The meta object literal for the '<em>Local Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.joda.time.LocalDate
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getLocalDate()
		 * @generated
		 */
		EDataType LOCAL_DATE = eINSTANCE.getLocalDate();

		/**
		 * The meta object literal for the '<em>No Such Element Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.NoSuchElementException
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getNoSuchElementException()
		 * @generated
		 */
		EDataType NO_SUCH_ELEMENT_EXCEPTION = eINSTANCE.getNoSuchElementException();

		/**
		 * The meta object literal for the '<em>Deque</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Deque
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getDeque()
		 * @generated
		 */
		EDataType DEQUE = eINSTANCE.getDeque();

		/**
		 * The meta object literal for the '<em>Temperature</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.quantity.Temperature
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTemperature()
		 * @generated
		 */
		EDataType TEMPERATURE = eINSTANCE.getTemperature();

		/**
		 * The meta object literal for the '<em>Local Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.joda.time.LocalTime
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getLocalTime()
		 * @generated
		 */
		EDataType LOCAL_TIME = eINSTANCE.getLocalTime();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>EFactory</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.EFactory
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getEFactory()
		 * @generated
		 */
		EDataType EFACTORY = eINSTANCE.getEFactory();

		/**
		 * The meta object literal for the '<em>Mass</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.quantity.Mass
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getMass()
		 * @generated
		 */
		EDataType MASS = eINSTANCE.getMass();

		/**
		 * The meta object literal for the '<em>Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.quantity.Length
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getLength()
		 * @generated
		 */
		EDataType LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '<em>List Multimap</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.common.collect.ListMultimap
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getListMultimap()
		 * @generated
		 */
		EDataType LIST_MULTIMAP = eINSTANCE.getListMultimap();

		/**
		 * The meta object literal for the '<em>UUID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.UUID
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getUUID()
		 * @generated
		 */
		EDataType UUID = eINSTANCE.getUUID();

		/**
		 * The meta object literal for the '<em>Period</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.joda.time.Period
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPeriod()
		 * @generated
		 */
		EDataType PERIOD = eINSTANCE.getPeriod();

	}

} //CommonsPackage
