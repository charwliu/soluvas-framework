/**
 */
package org.soluvas.image.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.Gender;
import org.soluvas.commons.ProgressMonitor;
import org.soluvas.commons.ProgressStatus;
import org.soluvas.commons.impl.ProgressMonitorImpl;
import org.soluvas.image.FileExport;
import org.soluvas.image.ImageCatalog;
import org.soluvas.image.ImageException;
import org.soluvas.image.ImageFactory;
import org.soluvas.image.ImageManager;
import org.soluvas.image.ImagePackage;
import org.soluvas.image.store.Image;
import org.soluvas.image.store.ImageRepository;
import org.soluvas.image.util.ImageUtils;

import com.google.common.collect.ImmutableMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImageManagerImpl extends EObjectImpl implements ImageManager {
	
	private static final Logger log = LoggerFactory
			.getLogger(ImageManagerImpl.class);
	private String maleDefaultPhotoId;
	private String femaleDefaultPhotoId;
	private String unknownDefaultPhotoId;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImagePackage.Literals.IMAGE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getDefaultPhotoId(Gender gender) {
		log.debug("Current User Gender {}", gender);
		switch (gender) {
		case MALE:
			return maleDefaultPhotoId;
		case FEMALE:
			return femaleDefaultPhotoId;
		default:
			return unknownDefaultPhotoId;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public long export(ImageRepository imageRepo, boolean metadata, FileExport files, File destFolder, ProgressMonitor monitor) {
		final ProgressMonitor submon = ProgressMonitorImpl.convert(monitor, 2);
		submon.beginTask("Finding all " + imageRepo.getNamespace() + " images", 1);
		final List<Image> images = imageRepo.findAll();
		submon.worked(1);
		submon.done(); // TODO: shouldn't be done in proper implementation
		
		final File imageParentFolder = new File(destFolder, "image_" + imageRepo.getNamespace());
		final File originalImageFolder = new File(imageParentFolder, imageRepo.ORIGINAL_CODE);
		final File imageParentRelFolder = new File("image_" + imageRepo.getNamespace());
		final File originalImageRelFolder = new File(imageParentRelFolder, imageRepo.ORIGINAL_CODE);
		
		final File file = new File(destFolder, imageRepo.getNamespace() + ".ImageCatalog.xmi");
		log.info("Exporting {} image metadatas to {}", images.size(), file);
		submon.beginTask("Exporting " + images.size() + " image metadas to " + file, images.size());
		
		final ResourceSet rsi = new ResourceSetImpl();
		rsi.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		final Resource rs = rsi.createResource(URI.createFileURI(file.getPath()));
		final ImageCatalog catalog = ImageFactory.eINSTANCE.createImageCatalog();
		for (final Image image : images) {
			final org.soluvas.image.Image exportedImage = ImageFactory.eINSTANCE.createImage();
			// TODO: when everything has been migrated, get extension from Image object
			final String extension = ImageUtils.getExtensionOrJpg(image.getFileName());
			exportedImage.setId(image.getId());
			exportedImage.setContentType(image.getContentType());
			exportedImage.setCreated(new DateTime());
			exportedImage.setCreationTime(image.getCreated());
			exportedImage.setModificationTime(image.getCreated());
			exportedImage.setExtension(extension);
			exportedImage.setFileName(image.getFileName());
			//exportedImage.setWidth()
			//exportedImage.setHeight()
			exportedImage.setLinkedFile(new File(originalImageRelFolder, image.getId() + "_" + imageRepo.ORIGINAL_CODE + "." + extension).getPath());
			exportedImage.setName(image.getName()); // was null, should not be null
			//exportedImage.setOriginalFile(image.getOriginalFile()); // always null
			exportedImage.setOriginUri(image.getOriginUri());
			exportedImage.setSize(image.getSize());
			exportedImage.setUri(image.getUri().toString());
			catalog.getImages().add(exportedImage);
		}
		rs.getContents().add(catalog);
		try {
			rs.save(ImmutableMap.of(XMIResource.OPTION_LINE_WIDTH, 80));
		} catch (IOException e) {
			throw new ImageException(e, "Cannot save %d image metadatas to %s",
					images.size(), file);
		}
		log.info("Exported {} image metadatas to {}", images.size(), file);
		submon.done(); // TODO: shouldn't be done in proper implementation
		
		log.info("Exporting {} original images", images.size());
		submon.beginTask("Exporting " + images.size() + " original images", images.size());
		ProgressStatus exportOriginalStatus = ProgressStatus.OK;
		for (final Image image : images) {
			// TODO: when everything has been migrated, get extension from Image object
			final String extension = ImageUtils.getExtensionOrJpg(image.getFileName());
			final File exportedFile = new File(originalImageFolder,
					image.getId() + "_" + imageRepo.ORIGINAL_CODE + "." + extension);
			try {
//				submon.beginTask("Fetching " + image.getId() + " from " + image.getUri() + " to " + tempFile, 1);
				log.info("Downloading {} from {} to {}", image.getId(), image.getUri(), exportedFile);
				final boolean downloaded = imageRepo.getConnector().download(
						imageRepo.getNamespace(), image.getId(), ImageRepository.ORIGINAL_CODE, ImageRepository.ORIGINAL_CODE,
						extension, exportedFile);
				if (!downloaded) {
					log.error("Cannot download {} because connector {} returned false",
							image.getId(), imageRepo.getConnector().getClass().getName());
					exportOriginalStatus = ProgressStatus.WARNING;
				}
				submon.worked(1);
			} catch (Exception e) {
				// log, but continue
				log.error("Cannot download image " + image.getId() + " to " + exportedFile, e);
				submon.worked(1, ProgressStatus.ERROR);
				exportOriginalStatus = ProgressStatus.ERROR;
			}
		}
		submon.done(exportOriginalStatus); // TODO: shouldn't be done in proper implementation
		
		return images.size();
	}

} //ImageManagerImpl