/**
 */
package org.soluvas.image.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.soluvas.image.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageFactoryImpl extends EFactoryImpl implements ImageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImageFactory init() {
		try {
			ImageFactory theImageFactory = (ImageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.soluvas.org/schema/image/1.0"); 
			if (theImageFactory != null) {
				return theImageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ImagePackage.IMAGE_CONFIG: return (EObject)createImageConfig();
			case ImagePackage.S3_CONNECTOR: return (EObject)createS3Connector();
			case ImagePackage.BLITLINE_TRANSFORMER: return (EObject)createBlitlineTransformer();
			case ImagePackage.WEB_DAV_CONNECTOR: return (EObject)createWebDavConnector();
			case ImagePackage.THUMBNAILATOR_TRANSFORMER: return (EObject)createThumbnailatorTransformer();
			case ImagePackage.UPLOADED_IMAGE: return (EObject)createUploadedImage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageConfig createImageConfig() {
		ImageConfigImpl imageConfig = new ImageConfigImpl();
		return imageConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S3Connector createS3Connector() {
		S3ConnectorImpl s3Connector = new S3ConnectorImpl();
		return s3Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlitlineTransformer createBlitlineTransformer() {
		BlitlineTransformerImpl blitlineTransformer = new BlitlineTransformerImpl();
		return blitlineTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebDavConnector createWebDavConnector() {
		WebDavConnectorImpl webDavConnector = new WebDavConnectorImpl();
		return webDavConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThumbnailatorTransformer createThumbnailatorTransformer() {
		ThumbnailatorTransformerImpl thumbnailatorTransformer = new ThumbnailatorTransformerImpl();
		return thumbnailatorTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UploadedImage createUploadedImage() {
		UploadedImageImpl uploadedImage = new UploadedImageImpl();
		return uploadedImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagePackage getImagePackage() {
		return (ImagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImagePackage getPackage() {
		return ImagePackage.eINSTANCE;
	}

} //ImageFactoryImpl
