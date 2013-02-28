/**
 */
package org.soluvas.data.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osgi.framework.Bundle;
import org.soluvas.commons.BundleAware;
import org.soluvas.commons.Colorable;
import org.soluvas.commons.CommonsPackage;
import org.soluvas.commons.Imageable;
import org.soluvas.commons.NameContainer;
import org.soluvas.commons.Nameable;
import org.soluvas.commons.NsPrefixable;
import org.soluvas.commons.Positionable;
import org.soluvas.commons.ResourceAware;
import org.soluvas.commons.ResourceType;
import org.soluvas.data.DataPackage;
import org.soluvas.data.Term;
import org.soluvas.data.Vocab;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.soluvas.data.impl.TermImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link org.soluvas.data.impl.TermImpl#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.soluvas.data.impl.TermImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.soluvas.data.impl.TermImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.soluvas.data.impl.TermImpl#getResourceUri <em>Resource Uri</em>}</li>
 *   <li>{@link org.soluvas.data.impl.TermImpl#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link org.soluvas.data.impl.TermImpl#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link org.soluvas.data.impl.TermImpl#getPositioner <em>Positioner</em>}</li>
 *   <li>{@link org.soluvas.data.impl.TermImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.soluvas.data.impl.TermImpl#getVocab <em>Vocab</em>}</li>
 *   <li>{@link org.soluvas.data.impl.TermImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.soluvas.data.impl.TermImpl#getImageId <em>Image Id</em>}</li>
 *   <li>{@link org.soluvas.data.impl.TermImpl#getAttributeTypeNsPrefix <em>Attribute Type Ns Prefix</em>}</li>
 *   <li>{@link org.soluvas.data.impl.TermImpl#getAttributeTypeName <em>Attribute Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermImpl extends EObjectImpl implements Term {
	/**
	 * The cached value of the '{@link #getTerms() <em>Terms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> terms;

	/**
	 * The default value of the '{@link #getBundle() <em>Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundle()
	 * @generated
	 * @ordered
	 */
	protected static final Bundle BUNDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBundle() <em>Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundle()
	 * @generated
	 * @ordered
	 */
	protected Bundle bundle = BUNDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceType RESOURCE_TYPE_EDEFAULT = ResourceType.BUNDLE;

	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected ResourceType resourceType = RESOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceUri() <em>Resource Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceUri()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceUri() <em>Resource Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceUri()
	 * @generated
	 * @ordered
	 */
	protected String resourceUri = RESOURCE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected String resourceName = RESOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected String nsPrefix = NS_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositioner() <em>Positioner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositioner()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POSITIONER_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getPositioner() <em>Positioner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositioner()
	 * @generated
	 * @ordered
	 */
	protected Integer positioner = POSITIONER_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVocab() <em>Vocab</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocab()
	 * @generated
	 * @ordered
	 */
	protected Vocab vocab;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId()
	 * @generated
	 * @ordered
	 */
	protected String imageId = IMAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeTypeNsPrefix() <em>Attribute Type Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeTypeNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_TYPE_NS_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeTypeNsPrefix() <em>Attribute Type Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeTypeNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected String attributeTypeNsPrefix = ATTRIBUTE_TYPE_NS_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeTypeName() <em>Attribute Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeTypeName() <em>Attribute Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeTypeName()
	 * @generated
	 * @ordered
	 */
	protected String attributeTypeName = ATTRIBUTE_TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Term> getTerms() {
		if (terms == null) {
			terms = new EObjectResolvingEList<Term>(Term.class, this, DataPackage.TERM__TERMS);
		}
		return terms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bundle getBundle() {
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBundle(Bundle newBundle) {
		Bundle oldBundle = bundle;
		bundle = newBundle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.TERM__BUNDLE, oldBundle, bundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.TERM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType getResourceType() {
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceType(ResourceType newResourceType) {
		ResourceType oldResourceType = resourceType;
		resourceType = newResourceType == null ? RESOURCE_TYPE_EDEFAULT : newResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.TERM__RESOURCE_TYPE, oldResourceType, resourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceUri() {
		return resourceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceUri(String newResourceUri) {
		String oldResourceUri = resourceUri;
		resourceUri = newResourceUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.TERM__RESOURCE_URI, oldResourceUri, resourceUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceName() {
		return resourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceName(String newResourceName) {
		String oldResourceName = resourceName;
		resourceName = newResourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.TERM__RESOURCE_NAME, oldResourceName, resourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNsPrefix() {
		return nsPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNsPrefix(String newNsPrefix) {
		String oldNsPrefix = nsPrefix;
		nsPrefix = newNsPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.TERM__NS_PREFIX, oldNsPrefix, nsPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPositioner() {
		return positioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositioner(Integer newPositioner) {
		Integer oldPositioner = positioner;
		positioner = newPositioner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.TERM__POSITIONER, oldPositioner, positioner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.TERM__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vocab getVocab() {
		if (vocab != null && ((EObject)vocab).eIsProxy()) {
			InternalEObject oldVocab = (InternalEObject)vocab;
			vocab = (Vocab)eResolveProxy(oldVocab);
			if (vocab != oldVocab) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.TERM__VOCAB, oldVocab, vocab));
			}
		}
		return vocab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vocab basicGetVocab() {
		return vocab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVocab(Vocab newVocab) {
		Vocab oldVocab = vocab;
		vocab = newVocab;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.TERM__VOCAB, oldVocab, vocab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.TERM__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageId() {
		return imageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageId(String newImageId) {
		String oldImageId = imageId;
		imageId = newImageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.TERM__IMAGE_ID, oldImageId, imageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttributeTypeNsPrefix() {
		return attributeTypeNsPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeTypeNsPrefix(String newAttributeTypeNsPrefix) {
		String oldAttributeTypeNsPrefix = attributeTypeNsPrefix;
		attributeTypeNsPrefix = newAttributeTypeNsPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.TERM__ATTRIBUTE_TYPE_NS_PREFIX, oldAttributeTypeNsPrefix, attributeTypeNsPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttributeTypeName() {
		return attributeTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeTypeName(String newAttributeTypeName) {
		String oldAttributeTypeName = attributeTypeName;
		attributeTypeName = newAttributeTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.TERM__ATTRIBUTE_TYPE_NAME, oldAttributeTypeName, attributeTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.TERM__TERMS:
				return getTerms();
			case DataPackage.TERM__BUNDLE:
				return getBundle();
			case DataPackage.TERM__NAME:
				return getName();
			case DataPackage.TERM__RESOURCE_TYPE:
				return getResourceType();
			case DataPackage.TERM__RESOURCE_URI:
				return getResourceUri();
			case DataPackage.TERM__RESOURCE_NAME:
				return getResourceName();
			case DataPackage.TERM__NS_PREFIX:
				return getNsPrefix();
			case DataPackage.TERM__POSITIONER:
				return getPositioner();
			case DataPackage.TERM__COLOR:
				return getColor();
			case DataPackage.TERM__VOCAB:
				if (resolve) return getVocab();
				return basicGetVocab();
			case DataPackage.TERM__DISPLAY_NAME:
				return getDisplayName();
			case DataPackage.TERM__IMAGE_ID:
				return getImageId();
			case DataPackage.TERM__ATTRIBUTE_TYPE_NS_PREFIX:
				return getAttributeTypeNsPrefix();
			case DataPackage.TERM__ATTRIBUTE_TYPE_NAME:
				return getAttributeTypeName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataPackage.TERM__TERMS:
				getTerms().clear();
				getTerms().addAll((Collection<? extends Term>)newValue);
				return;
			case DataPackage.TERM__BUNDLE:
				setBundle((Bundle)newValue);
				return;
			case DataPackage.TERM__NAME:
				setName((String)newValue);
				return;
			case DataPackage.TERM__RESOURCE_TYPE:
				setResourceType((ResourceType)newValue);
				return;
			case DataPackage.TERM__RESOURCE_URI:
				setResourceUri((String)newValue);
				return;
			case DataPackage.TERM__RESOURCE_NAME:
				setResourceName((String)newValue);
				return;
			case DataPackage.TERM__NS_PREFIX:
				setNsPrefix((String)newValue);
				return;
			case DataPackage.TERM__POSITIONER:
				setPositioner((Integer)newValue);
				return;
			case DataPackage.TERM__COLOR:
				setColor((String)newValue);
				return;
			case DataPackage.TERM__VOCAB:
				setVocab((Vocab)newValue);
				return;
			case DataPackage.TERM__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case DataPackage.TERM__IMAGE_ID:
				setImageId((String)newValue);
				return;
			case DataPackage.TERM__ATTRIBUTE_TYPE_NS_PREFIX:
				setAttributeTypeNsPrefix((String)newValue);
				return;
			case DataPackage.TERM__ATTRIBUTE_TYPE_NAME:
				setAttributeTypeName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataPackage.TERM__TERMS:
				getTerms().clear();
				return;
			case DataPackage.TERM__BUNDLE:
				setBundle(BUNDLE_EDEFAULT);
				return;
			case DataPackage.TERM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataPackage.TERM__RESOURCE_TYPE:
				setResourceType(RESOURCE_TYPE_EDEFAULT);
				return;
			case DataPackage.TERM__RESOURCE_URI:
				setResourceUri(RESOURCE_URI_EDEFAULT);
				return;
			case DataPackage.TERM__RESOURCE_NAME:
				setResourceName(RESOURCE_NAME_EDEFAULT);
				return;
			case DataPackage.TERM__NS_PREFIX:
				setNsPrefix(NS_PREFIX_EDEFAULT);
				return;
			case DataPackage.TERM__POSITIONER:
				setPositioner(POSITIONER_EDEFAULT);
				return;
			case DataPackage.TERM__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case DataPackage.TERM__VOCAB:
				setVocab((Vocab)null);
				return;
			case DataPackage.TERM__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case DataPackage.TERM__IMAGE_ID:
				setImageId(IMAGE_ID_EDEFAULT);
				return;
			case DataPackage.TERM__ATTRIBUTE_TYPE_NS_PREFIX:
				setAttributeTypeNsPrefix(ATTRIBUTE_TYPE_NS_PREFIX_EDEFAULT);
				return;
			case DataPackage.TERM__ATTRIBUTE_TYPE_NAME:
				setAttributeTypeName(ATTRIBUTE_TYPE_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataPackage.TERM__TERMS:
				return terms != null && !terms.isEmpty();
			case DataPackage.TERM__BUNDLE:
				return BUNDLE_EDEFAULT == null ? bundle != null : !BUNDLE_EDEFAULT.equals(bundle);
			case DataPackage.TERM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataPackage.TERM__RESOURCE_TYPE:
				return resourceType != RESOURCE_TYPE_EDEFAULT;
			case DataPackage.TERM__RESOURCE_URI:
				return RESOURCE_URI_EDEFAULT == null ? resourceUri != null : !RESOURCE_URI_EDEFAULT.equals(resourceUri);
			case DataPackage.TERM__RESOURCE_NAME:
				return RESOURCE_NAME_EDEFAULT == null ? resourceName != null : !RESOURCE_NAME_EDEFAULT.equals(resourceName);
			case DataPackage.TERM__NS_PREFIX:
				return NS_PREFIX_EDEFAULT == null ? nsPrefix != null : !NS_PREFIX_EDEFAULT.equals(nsPrefix);
			case DataPackage.TERM__POSITIONER:
				return POSITIONER_EDEFAULT == null ? positioner != null : !POSITIONER_EDEFAULT.equals(positioner);
			case DataPackage.TERM__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case DataPackage.TERM__VOCAB:
				return vocab != null;
			case DataPackage.TERM__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case DataPackage.TERM__IMAGE_ID:
				return IMAGE_ID_EDEFAULT == null ? imageId != null : !IMAGE_ID_EDEFAULT.equals(imageId);
			case DataPackage.TERM__ATTRIBUTE_TYPE_NS_PREFIX:
				return ATTRIBUTE_TYPE_NS_PREFIX_EDEFAULT == null ? attributeTypeNsPrefix != null : !ATTRIBUTE_TYPE_NS_PREFIX_EDEFAULT.equals(attributeTypeNsPrefix);
			case DataPackage.TERM__ATTRIBUTE_TYPE_NAME:
				return ATTRIBUTE_TYPE_NAME_EDEFAULT == null ? attributeTypeName != null : !ATTRIBUTE_TYPE_NAME_EDEFAULT.equals(attributeTypeName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BundleAware.class) {
			switch (derivedFeatureID) {
				case DataPackage.TERM__BUNDLE: return CommonsPackage.BUNDLE_AWARE__BUNDLE;
				default: return -1;
			}
		}
		if (baseClass == Nameable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NameContainer.class) {
			switch (derivedFeatureID) {
				case DataPackage.TERM__NAME: return CommonsPackage.NAME_CONTAINER__NAME;
				default: return -1;
			}
		}
		if (baseClass == ResourceAware.class) {
			switch (derivedFeatureID) {
				case DataPackage.TERM__RESOURCE_TYPE: return CommonsPackage.RESOURCE_AWARE__RESOURCE_TYPE;
				case DataPackage.TERM__RESOURCE_URI: return CommonsPackage.RESOURCE_AWARE__RESOURCE_URI;
				case DataPackage.TERM__RESOURCE_NAME: return CommonsPackage.RESOURCE_AWARE__RESOURCE_NAME;
				default: return -1;
			}
		}
		if (baseClass == NsPrefixable.class) {
			switch (derivedFeatureID) {
				case DataPackage.TERM__NS_PREFIX: return CommonsPackage.NS_PREFIXABLE__NS_PREFIX;
				default: return -1;
			}
		}
		if (baseClass == Imageable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Positionable.class) {
			switch (derivedFeatureID) {
				case DataPackage.TERM__POSITIONER: return CommonsPackage.POSITIONABLE__POSITIONER;
				default: return -1;
			}
		}
		if (baseClass == Colorable.class) {
			switch (derivedFeatureID) {
				case DataPackage.TERM__COLOR: return CommonsPackage.COLORABLE__COLOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BundleAware.class) {
			switch (baseFeatureID) {
				case CommonsPackage.BUNDLE_AWARE__BUNDLE: return DataPackage.TERM__BUNDLE;
				default: return -1;
			}
		}
		if (baseClass == Nameable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NameContainer.class) {
			switch (baseFeatureID) {
				case CommonsPackage.NAME_CONTAINER__NAME: return DataPackage.TERM__NAME;
				default: return -1;
			}
		}
		if (baseClass == ResourceAware.class) {
			switch (baseFeatureID) {
				case CommonsPackage.RESOURCE_AWARE__RESOURCE_TYPE: return DataPackage.TERM__RESOURCE_TYPE;
				case CommonsPackage.RESOURCE_AWARE__RESOURCE_URI: return DataPackage.TERM__RESOURCE_URI;
				case CommonsPackage.RESOURCE_AWARE__RESOURCE_NAME: return DataPackage.TERM__RESOURCE_NAME;
				default: return -1;
			}
		}
		if (baseClass == NsPrefixable.class) {
			switch (baseFeatureID) {
				case CommonsPackage.NS_PREFIXABLE__NS_PREFIX: return DataPackage.TERM__NS_PREFIX;
				default: return -1;
			}
		}
		if (baseClass == Imageable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Positionable.class) {
			switch (baseFeatureID) {
				case CommonsPackage.POSITIONABLE__POSITIONER: return DataPackage.TERM__POSITIONER;
				default: return -1;
			}
		}
		if (baseClass == Colorable.class) {
			switch (baseFeatureID) {
				case CommonsPackage.COLORABLE__COLOR: return DataPackage.TERM__COLOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bundle: ");
		result.append(bundle);
		result.append(", name: ");
		result.append(name);
		result.append(", resourceType: ");
		result.append(resourceType);
		result.append(", resourceUri: ");
		result.append(resourceUri);
		result.append(", resourceName: ");
		result.append(resourceName);
		result.append(", nsPrefix: ");
		result.append(nsPrefix);
		result.append(", positioner: ");
		result.append(positioner);
		result.append(", color: ");
		result.append(color);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", imageId: ");
		result.append(imageId);
		result.append(", attributeTypeNsPrefix: ");
		result.append(attributeTypeNsPrefix);
		result.append(", attributeTypeName: ");
		result.append(attributeTypeName);
		result.append(')');
		return result.toString();
	}

} //TermImpl
