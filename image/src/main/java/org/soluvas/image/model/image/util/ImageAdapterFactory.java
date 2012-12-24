/**
 */
package org.soluvas.image.model.image.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.soluvas.image.model.image.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.soluvas.image.model.image.ImagePackage
 * @generated
 */
public class ImageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ImagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageSwitch<Adapter> modelSwitch =
		new ImageSwitch<Adapter>() {
			@Override
			public Adapter caseImageConfig(ImageConfig object) {
				return createImageConfigAdapter();
			}
			@Override
			public Adapter caseImageConnector(ImageConnector object) {
				return createImageConnectorAdapter();
			}
			@Override
			public Adapter caseS3Connector(S3Connector object) {
				return createS3ConnectorAdapter();
			}
			@Override
			public Adapter caseBlitlineConnector(BlitlineConnector object) {
				return createBlitlineConnectorAdapter();
			}
			@Override
			public Adapter caseCloudinaryConnector(CloudinaryConnector object) {
				return createCloudinaryConnectorAdapter();
			}
			@Override
			public Adapter caseWebDavConnector(WebDavConnector object) {
				return createWebDavConnectorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.soluvas.image.model.image.ImageConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.soluvas.image.model.image.ImageConfig
	 * @generated
	 */
	public Adapter createImageConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.soluvas.image.model.image.ImageConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.soluvas.image.model.image.ImageConnector
	 * @generated
	 */
	public Adapter createImageConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.soluvas.image.model.image.S3Connector <em>S3 Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.soluvas.image.model.image.S3Connector
	 * @generated
	 */
	public Adapter createS3ConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.soluvas.image.model.image.BlitlineConnector <em>Blitline Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.soluvas.image.model.image.BlitlineConnector
	 * @generated
	 */
	public Adapter createBlitlineConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.soluvas.image.model.image.CloudinaryConnector <em>Cloudinary Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.soluvas.image.model.image.CloudinaryConnector
	 * @generated
	 */
	public Adapter createCloudinaryConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.soluvas.image.model.image.WebDavConnector <em>Web Dav Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.soluvas.image.model.image.WebDavConnector
	 * @generated
	 */
	public Adapter createWebDavConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ImageAdapterFactory
