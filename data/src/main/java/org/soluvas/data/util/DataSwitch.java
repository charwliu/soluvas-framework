/**
 */
package org.soluvas.data.util;

import javax.measure.quantity.Quantity;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.soluvas.commons.BundleAware;
import org.soluvas.commons.Describable;
import org.soluvas.commons.Identifiable;
import org.soluvas.commons.NameContainer;
import org.soluvas.commons.Nameable;
import org.soluvas.commons.NsPrefixable;
import org.soluvas.commons.ResourceAware;

import org.soluvas.commons.Sluggable;
import org.soluvas.data.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.soluvas.data.DataPackage
 * @generated
 */
public class DataSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSwitch() {
		if (modelPackage == null) {
			modelPackage = DataPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DataPackage.ATTRIBUTE_TYPE: {
				AttributeType attributeType = (AttributeType)theEObject;
				T1 result = caseAttributeType(attributeType);
				if (result == null) result = caseNsPrefixable(attributeType);
				if (result == null) result = caseNameContainer(attributeType);
				if (result == null) result = caseResourceAware(attributeType);
				if (result == null) result = caseBundleAware(attributeType);
				if (result == null) result = caseNameable(attributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.VALUE: {
				Value<?> value = (Value<?>)theEObject;
				T1 result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T1 result = caseStringValue(stringValue);
				if (result == null) result = caseValue(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.MEASURE_VALUE: {
				MeasureValue measureValue = (MeasureValue)theEObject;
				T1 result = caseMeasureValue(measureValue);
				if (result == null) result = caseValue(measureValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.CURRENCY_VALUE: {
				CurrencyValue currencyValue = (CurrencyValue)theEObject;
				T1 result = caseCurrencyValue(currencyValue);
				if (result == null) result = caseValue(currencyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.MIXIN: {
				Mixin mixin = (Mixin)theEObject;
				T1 result = caseMixin(mixin);
				if (result == null) result = caseNameContainer(mixin);
				if (result == null) result = caseResourceAware(mixin);
				if (result == null) result = caseBundleAware(mixin);
				if (result == null) result = caseNsPrefixable(mixin);
				if (result == null) result = caseDescribable(mixin);
				if (result == null) result = caseNameable(mixin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.RANGE_VALUE: {
				RangeValue<?> rangeValue = (RangeValue<?>)theEObject;
				T1 result = caseRangeValue(rangeValue);
				if (result == null) result = caseValue(rangeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.TERM_VALUE: {
				TermValue termValue = (TermValue)theEObject;
				T1 result = caseTermValue(termValue);
				if (result == null) result = caseValue(termValue);
				if (result == null) result = caseIdentifiable(termValue);
				if (result == null) result = caseSluggable(termValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.VOCAB: {
				Vocab vocab = (Vocab)theEObject;
				T1 result = caseVocab(vocab);
				if (result == null) result = caseTermContainer(vocab);
				if (result == null) result = caseBundleAware(vocab);
				if (result == null) result = caseResourceAware(vocab);
				if (result == null) result = caseNsPrefixable(vocab);
				if (result == null) result = caseDescribable(vocab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.TERM: {
				Term term = (Term)theEObject;
				T1 result = caseTerm(term);
				if (result == null) result = caseTermContainer(term);
				if (result == null) result = caseBundleAware(term);
				if (result == null) result = caseNameContainer(term);
				if (result == null) result = caseResourceAware(term);
				if (result == null) result = caseNameable(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.LIST_VOCAB: {
				ListVocab listVocab = (ListVocab)theEObject;
				T1 result = caseListVocab(listVocab);
				if (result == null) result = caseVocab(listVocab);
				if (result == null) result = caseTermContainer(listVocab);
				if (result == null) result = caseBundleAware(listVocab);
				if (result == null) result = caseResourceAware(listVocab);
				if (result == null) result = caseNsPrefixable(listVocab);
				if (result == null) result = caseDescribable(listVocab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.TREE_VOCAB: {
				TreeVocab treeVocab = (TreeVocab)theEObject;
				T1 result = caseTreeVocab(treeVocab);
				if (result == null) result = caseVocab(treeVocab);
				if (result == null) result = caseTermContainer(treeVocab);
				if (result == null) result = caseBundleAware(treeVocab);
				if (result == null) result = caseResourceAware(treeVocab);
				if (result == null) result = caseNsPrefixable(treeVocab);
				if (result == null) result = caseDescribable(treeVocab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.FREE_VOCAB: {
				FreeVocab freeVocab = (FreeVocab)theEObject;
				T1 result = caseFreeVocab(freeVocab);
				if (result == null) result = caseVocab(freeVocab);
				if (result == null) result = caseTermContainer(freeVocab);
				if (result == null) result = caseBundleAware(freeVocab);
				if (result == null) result = caseResourceAware(freeVocab);
				if (result == null) result = caseNsPrefixable(freeVocab);
				if (result == null) result = caseDescribable(freeVocab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.TERM_CONTAINER: {
				TermContainer termContainer = (TermContainer)theEObject;
				T1 result = caseTermContainer(termContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_CATALOG: {
				DataCatalog dataCatalog = (DataCatalog)theEObject;
				T1 result = caseDataCatalog(dataCatalog);
				if (result == null) result = caseBundleAware(dataCatalog);
				if (result == null) result = caseResourceAware(dataCatalog);
				if (result == null) result = caseNameContainer(dataCatalog);
				if (result == null) result = caseNameable(dataCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAttributeType(AttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseValue(Value<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMeasureValue(MeasureValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCurrencyValue(CurrencyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMixin(Mixin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseRangeValue(RangeValue<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTermValue(TermValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vocab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vocab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVocab(Vocab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Vocab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Vocab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseListVocab(ListVocab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Vocab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Vocab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTreeVocab(TreeVocab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Free Vocab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Free Vocab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFreeVocab(FreeVocab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTermContainer(TermContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataCatalog(DataCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ns Prefixable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ns Prefixable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNsPrefixable(NsPrefixable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNameable(Nameable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNameContainer(NameContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Aware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Aware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResourceAware(ResourceAware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Aware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Aware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBundleAware(BundleAware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Describable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Describable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDescribable(Describable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sluggable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sluggable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSluggable(Sluggable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //DataSwitch
