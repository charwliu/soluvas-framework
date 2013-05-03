package org.soluvas.commons;

import java.net.URL;

import javax.annotation.Nullable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.osgi.framework.Bundle;

/**
 * Loads a predefined EMF object from an XMI file once and keeps it in memory.
 * 
 * Note: the object is supplied as-is from the {@link XMIResource}, i.e. not
 * cloned.
 * 
 * @author rudi
 */
public class StaticXmiLoader<T extends EObject> extends OnDemandXmiLoader<T> {
	
	private final T obj;
	
	public StaticXmiLoader(EPackage ePackage, Bundle bundle, String fileName) {
		super(ePackage, bundle, fileName);
		this.obj = load();
	}

	public StaticXmiLoader(EPackage ePackage, Class<?> loaderClass,
			String resourcePath) {
		super(ePackage, loaderClass, resourcePath);
		this.obj = load();
	}

	public StaticXmiLoader(EPackage ePackage, String baseDir, String fileName) {
		super(ePackage, baseDir, fileName);
		this.obj = load();
	}

	public StaticXmiLoader(EPackage ePackage, String fileName) {
		super(ePackage, fileName);
		this.obj = load();
	}

	public StaticXmiLoader(EPackage ePackage, URL resourceUrl, Bundle bundle) {
		super(ePackage, resourceUrl, bundle);
		this.obj = load();
	}

	public StaticXmiLoader(EPackage ePackage, URL resourceUrl,
			ResourceType resourceType) {
		super(ePackage, resourceUrl, resourceType);
		this.obj = load();
	}

	@Override @Nullable
	public T get() {
		if (obj == null) {
			log.warn("Returning null, probably XMI Loader has been destroyed for {} from {} [{}]",
					resourceUri, ePackageName, ePackageNsUri);
		}
		return obj;
	}

}
