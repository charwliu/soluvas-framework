/**
 */
package org.soluvas.image;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blitline Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Processes using Blitline. The source image must be publicly hosted, for example using S3.
 * Blitline will use source to get the origin URI, but processing will be done by Blitline itself.
 * 
 * The destination image is directly written into an S3 bucket.
 * 
 * You must have an S3 account and have permissions to change the policy on your bucket
 * For these instructions, you must use the Amazon AWS Console
 * See: http://www.blitline.com/docs/s3_permissions
 * 
 * Make sure to set the Canonical ID, see http://blog.blitline.com/post/32296310740/canonical-id-s3-permissions
 * 
 * WARNING: BlitlineTransformer currently does not support ResizeToFit especially with dynamic width/height (because need to either calculate dimensions or read the resulting image sizes via callback). Use ImageMagickTransformer instead if you need it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.soluvas.image.BlitlineTransformer#getApplicationId <em>Application Id</em>}</li>
 *   <li>{@link org.soluvas.image.BlitlineTransformer#getBucket <em>Bucket</em>}</li>
 *   <li>{@link org.soluvas.image.BlitlineTransformer#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link org.soluvas.image.BlitlineTransformer#getTenantEnv <em>Tenant Env</em>}</li>
 *   <li>{@link org.soluvas.image.BlitlineTransformer#getCdnAlias <em>Cdn Alias</em>}</li>
 *   <li>{@link org.soluvas.image.BlitlineTransformer#getKeyTemplate <em>Key Template</em>}</li>
 *   <li>{@link org.soluvas.image.BlitlineTransformer#getUriTemplate <em>Uri Template</em>}</li>
 *   <li>{@link org.soluvas.image.BlitlineTransformer#getOriginUriTemplate <em>Origin Uri Template</em>}</li>
 * </ul>
 *
 * @see org.soluvas.image.ImagePackage#getBlitlineTransformer()
 * @model
 * @generated
 */
public interface BlitlineTransformer extends ImageTransformer {

	/*
	 * { "application_id": "1dI-CHEUwvAeTZtGh1HODCg",
	 * "src" : "http://www.google.com/logos/2011/yokoyama11-hp.jpg",
	 * "functions" : [ {"name": "blur", "params" : {"radius" : 0.0, "sigma" : 2.0}, "save" : { "image_identifier" : "MY_CLIENT_ID" }} ]}'	
	 */
		
	@JsonInclude(Include.NON_NULL)
	public static class JobS3Destination {
		public String bucket;
		public String key;
		public Map<String, String> headers;
		
		/**
		 * @param bucket
		 * @param key
		 * @param headers
		 */
		public JobS3Destination(String bucket, String key,
				Map<String, String> headers) {
			super();
			this.bucket = bucket;
			this.key = key;
			this.headers = headers;
		}

		/**
		 * @param bucket
		 * @param key
		 */
		public JobS3Destination(String bucket, String key) {
			super();
			this.bucket = bucket;
			this.key = key;
		}
		
	}
	
	@JsonInclude(Include.NON_NULL)
	public static class JobSave {
		@JsonProperty("image_identifier")
		public String imageIdentifier;
		@JsonProperty("s3_destination")
		public JobS3Destination s3Destination;
		public Integer quality;
		
		/**
		 * @param imageIdentifier
		 * @param s3Destination
		 * @param quality
		 */
		public JobSave(String imageIdentifier, JobS3Destination s3Destination,
				Integer quality) {
			super();
			this.imageIdentifier = imageIdentifier;
			this.s3Destination = s3Destination;
			this.quality = quality;
		}

		/**
		 * @param imageIdentifier
		 * @param s3Destination
		 */
		public JobSave(String imageIdentifier, JobS3Destination s3Destination) {
			super();
			this.imageIdentifier = imageIdentifier;
			this.s3Destination = s3Destination;
		}
		
	}
	
	@JsonInclude(Include.NON_NULL)
	public static class JobFunction {
		public String name;
		public Map<String, Object> params;
		public JobSave save;
		public List<JobFunction> functions;
		
		/**
		 * @param name
		 * @param params
		 * @param save
		 * @param functions
		 */
		public JobFunction(String name, Map<String, Object> params, JobSave save,
				List<JobFunction> functions) {
			super();
			this.name = name;
			this.params = params;
			this.save = save;
			this.functions = functions;
		}

		/**
		 * @param name
		 * @param params
		 * @param save
		 */
		public JobFunction(String name, Map<String, Object> params, JobSave save) {
			super();
			this.name = name;
			this.params = params;
			this.save = save;
		}
		
	}
	
	@JsonInclude(Include.NON_NULL)
	public static class Job {
		@JsonProperty("application_id")
		public String applicationId;
		public String src;
		public List<JobFunction> functions;
		
		/**
		 * @param applicationId
		 * @param src
		 * @param functions
		 */
		public Job(String applicationId, String src, List<JobFunction> functions) {
			super();
			this.applicationId = applicationId;
			this.src = src;
			this.functions = functions;
		}
		/**
		 * @param applicationId
		 * @param src
		 * @param functions
		 */
		public Job(String applicationId, String src, JobFunction function) {
			super();
			this.applicationId = applicationId;
			this.src = src;
			this.functions = ImmutableList.of(function);
		}
		
	}
		
	/**
	 * Returns the value of the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Id</em>' attribute.
	 * @see org.soluvas.image.ImagePackage#getBlitlineTransformer_ApplicationId()
	 * @model changeable="false"
	 * @generated
	 */
	String getApplicationId();

	/**
	 * Returns the value of the '<em><b>Bucket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket</em>' attribute.
	 * @see org.soluvas.image.ImagePackage#getBlitlineTransformer_Bucket()
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
	 * @see org.soluvas.image.ImagePackage#getBlitlineTransformer_TenantId()
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
	 * @see org.soluvas.image.ImagePackage#getBlitlineTransformer_TenantEnv()
	 * @model changeable="false"
	 * @generated
	 */
	String getTenantEnv();

	/**
	 * Returns the value of the '<em><b>Cdn Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDN alias (if available), e.g. pic.stg.berbatik.com.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cdn Alias</em>' attribute.
	 * @see org.soluvas.image.ImagePackage#getBlitlineTransformer_CdnAlias()
	 * @model changeable="false"
	 * @generated
	 */
	String getCdnAlias();

	/**
	 * Returns the value of the '<em><b>Key Template</b></em>' attribute.
	 * The default value is <code>"{tenantId}_{tenantEnv}/{namespace}/{styleCode}/{imageId}_{styleVariant}.{extension}"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * key template in URI template format.
	 * 
	 * Variables are: tenantId, tenantEnv,
	 * namespace, styleCode, imageId, styleVariant, extension.
	 * 
	 * Default is: "{tenantId}_{tenantEnv}/{namespace}/{styleCode}/{imageId}_{styleVariant}.{extension}";
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Template</em>' attribute.
	 * @see org.soluvas.image.ImagePackage#getBlitlineTransformer_KeyTemplate()
	 * @model default="{tenantId}_{tenantEnv}/{namespace}/{styleCode}/{imageId}_{styleVariant}.{extension}" changeable="false"
	 * @generated
	 */
	String getKeyTemplate();

	/**
	 * Returns the value of the '<em><b>Uri Template</b></em>' attribute.
	 * The default value is <code>"http://{+alias}/{tenantId}_{tenantEnv}/{namespace}/{styleCode}/{imageId}_{styleVariant}.{extension}"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI template for 'lo' (derived) images, optionally with CDN. This template will be used on 3 areas: server-side, email templating, and client-side JavaScript.
	 * 
	 * Variables are: namespace, styleCode, imageId, styleVariant, ext.
	 * 
	 * Default is: http://{+alias}/{tenantId}_{tenantEnv}/{namespace}/{styleCode}/{imageId}_{styleVariant}.{extension}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri Template</em>' attribute.
	 * @see org.soluvas.image.ImagePackage#getBlitlineTransformer_UriTemplate()
	 * @model default="http://{+alias}/{tenantId}_{tenantEnv}/{namespace}/{styleCode}/{imageId}_{styleVariant}.{extension}" changeable="false"
	 * @generated
	 */
	String getUriTemplate();

	/**
	 * Returns the value of the '<em><b>Origin Uri Template</b></em>' attribute.
	 * The default value is <code>"http://{+alias}/{tenantId}_{tenantEnv}/{namespace}/{styleCode}/{imageId}_{styleVariant}.{extension}"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI template for 'lo' (derived) images, without CDN. This template will be used on 3 areas: server-side, email templating, and client-side JavaScript.
	 * 
	 * Variables are: namespace, styleCode, imageId, styleVariant, ext.
	 * 
	 * Default is: http://{+alias}/{tenantId}_{tenantEnv}/{namespace}/{styleCode}/{imageId}_{styleVariant}.{extension}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin Uri Template</em>' attribute.
	 * @see org.soluvas.image.ImagePackage#getBlitlineTransformer_OriginUriTemplate()
	 * @model default="http://{+alias}/{tenantId}_{tenantEnv}/{namespace}/{styleCode}/{imageId}_{styleVariant}.{extension}" changeable="false"
	 * @generated
	 */
	String getOriginUriTemplate();
} // BlitlineTransformer
