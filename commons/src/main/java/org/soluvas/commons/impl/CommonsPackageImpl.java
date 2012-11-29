/**
 */
package org.soluvas.commons.impl;

import javax.measure.unit.Unit;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.joda.money.CurrencyUnit;
import org.joda.time.DateTime;
import org.soluvas.commons.AppManifest;
import org.soluvas.commons.CommonsFactory;
import org.soluvas.commons.CommonsPackage;
import org.soluvas.commons.Gender;
import org.soluvas.commons.PersonInfo;
import org.soluvas.commons.ResourceAware;
import org.soluvas.commons.ResourceType;
import org.soluvas.commons.Positionable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonsPackageImpl extends EPackageImpl implements CommonsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceAwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appManifestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType currencyUnitEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.soluvas.commons.CommonsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonsPackageImpl() {
		super(eNS_URI, CommonsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CommonsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonsPackage init() {
		if (isInited) return (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);

		// Obtain or create and register package
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCommonsPackage.createPackageContents();

		// Initialize created meta-data
		theCommonsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonsPackage.eNS_URI, theCommonsPackage);
		return theCommonsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceAware() {
		return resourceAwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAware_ResourceUri() {
		return (EAttribute)resourceAwareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAware_ResourceName() {
		return (EAttribute)resourceAwareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionable() {
		return positionableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionable_Positioner() {
		return (EAttribute)positionableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAware_ResourceType() {
		return (EAttribute)resourceAwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppManifest() {
		return appManifestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppManifest_Title() {
		return (EAttribute)appManifestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppManifest_Description() {
		return (EAttribute)appManifestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppManifest_BrandingBundleName() {
		return (EAttribute)appManifestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppManifest_FaviconPath() {
		return (EAttribute)appManifestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonInfo() {
		return personInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonInfo_Id() {
		return (EAttribute)personInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonInfo_Slug() {
		return (EAttribute)personInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonInfo_Name() {
		return (EAttribute)personInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonInfo_PhotoId() {
		return (EAttribute)personInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonInfo_Gender() {
		return (EAttribute)personInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceType() {
		return resourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGender() {
		return genderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateTime() {
		return dateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCurrencyUnit() {
		return currencyUnitEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnit() {
		return unitEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonsFactory getCommonsFactory() {
		return (CommonsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resourceAwareEClass = createEClass(RESOURCE_AWARE);
		createEAttribute(resourceAwareEClass, RESOURCE_AWARE__RESOURCE_TYPE);
		createEAttribute(resourceAwareEClass, RESOURCE_AWARE__RESOURCE_URI);
		createEAttribute(resourceAwareEClass, RESOURCE_AWARE__RESOURCE_NAME);

		positionableEClass = createEClass(POSITIONABLE);
		createEAttribute(positionableEClass, POSITIONABLE__POSITIONER);

		appManifestEClass = createEClass(APP_MANIFEST);
		createEAttribute(appManifestEClass, APP_MANIFEST__TITLE);
		createEAttribute(appManifestEClass, APP_MANIFEST__DESCRIPTION);
		createEAttribute(appManifestEClass, APP_MANIFEST__BRANDING_BUNDLE_NAME);
		createEAttribute(appManifestEClass, APP_MANIFEST__FAVICON_PATH);

		personInfoEClass = createEClass(PERSON_INFO);
		createEAttribute(personInfoEClass, PERSON_INFO__ID);
		createEAttribute(personInfoEClass, PERSON_INFO__SLUG);
		createEAttribute(personInfoEClass, PERSON_INFO__NAME);
		createEAttribute(personInfoEClass, PERSON_INFO__PHOTO_ID);
		createEAttribute(personInfoEClass, PERSON_INFO__GENDER);

		// Create enums
		resourceTypeEEnum = createEEnum(RESOURCE_TYPE);
		genderEEnum = createEEnum(GENDER);

		// Create data types
		dateTimeEDataType = createEDataType(DATE_TIME);
		currencyUnitEDataType = createEDataType(CURRENCY_UNIT);
		unitEDataType = createEDataType(UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		appManifestEClass.getESuperTypes().add(this.getPositionable());
		appManifestEClass.getESuperTypes().add(this.getResourceAware());

		// Initialize classes and features; add operations and parameters
		initEClass(resourceAwareEClass, ResourceAware.class, "ResourceAware", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceAware_ResourceType(), this.getResourceType(), "resourceType", null, 0, 1, ResourceAware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceAware_ResourceUri(), ecorePackage.getEString(), "resourceUri", null, 0, 1, ResourceAware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceAware_ResourceName(), ecorePackage.getEString(), "resourceName", null, 0, 1, ResourceAware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionableEClass, Positionable.class, "Positionable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionable_Positioner(), ecorePackage.getEIntegerObject(), "positioner", "0", 0, 1, Positionable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appManifestEClass, AppManifest.class, "AppManifest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppManifest_Title(), ecorePackage.getEString(), "title", null, 0, 1, AppManifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppManifest_Description(), ecorePackage.getEString(), "description", null, 0, 1, AppManifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppManifest_BrandingBundleName(), ecorePackage.getEString(), "brandingBundleName", null, 0, 1, AppManifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppManifest_FaviconPath(), ecorePackage.getEString(), "faviconPath", null, 0, 1, AppManifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personInfoEClass, PersonInfo.class, "PersonInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonInfo_Id(), ecorePackage.getEString(), "id", null, 1, 1, PersonInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonInfo_Slug(), ecorePackage.getEString(), "slug", null, 1, 1, PersonInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonInfo_Name(), ecorePackage.getEString(), "name", null, 1, 1, PersonInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonInfo_PhotoId(), ecorePackage.getEString(), "photoId", null, 0, 1, PersonInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonInfo_Gender(), this.getGender(), "gender", null, 0, 1, PersonInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resourceTypeEEnum, ResourceType.class, "ResourceType");
		addEEnumLiteral(resourceTypeEEnum, ResourceType.BUNDLE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.FILE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DATABASE);

		initEEnum(genderEEnum, Gender.class, "Gender");
		addEEnumLiteral(genderEEnum, Gender.MALE);
		addEEnumLiteral(genderEEnum, Gender.FEMALE);

		// Initialize data types
		initEDataType(dateTimeEDataType, DateTime.class, "DateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(currencyUnitEDataType, CurrencyUnit.class, "CurrencyUnit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unitEDataType, Unit.class, "Unit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";		
		addAnnotation
		  (getResourceAware_ResourceName(), 
		   source, 
		   new String[] {
			 "documentation", "Name relative to parent resource."
		   });		
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "documentation", "The resource is from a bundle classpath."
		   });		
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "documentation", "The resource is from a file, usually in a watched folder."
		   });		
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "documentation", "The resource is from a persistence storage."
		   });		
		addAnnotation
		  (getAppManifest_BrandingBundleName(), 
		   source, 
		   new String[] {
			 "documentation", "Bundle that contains the branding resources (favicons, logos)."
		   });		
		addAnnotation
		  (getAppManifest_FaviconPath(), 
		   source, 
		   new String[] {
			 "documentation", "Relative path to 16x16 favicon.ico file in the branding bundle."
		   });
	}

} //CommonsPackageImpl
