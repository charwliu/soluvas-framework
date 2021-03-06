/**
 */
package org.soluvas.image.impl;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

import javax.annotation.Nullable;

import org.apache.commons.io.IOUtils;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.eclipse.emf.ecore.EClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.image.BlitlineTransformer;
import org.soluvas.image.ImageConnector;
import org.soluvas.image.ImageException;
import org.soluvas.image.ImageFactory;
import org.soluvas.image.ImagePackage;
import org.soluvas.image.ImageTransform;
import org.soluvas.image.ImageVariant;
import org.soluvas.image.ResizeToFill;
import org.soluvas.image.TransformGravity;
import org.soluvas.image.UploadedImage;
import org.soluvas.json.JsonUtils;

import com.damnhandy.uri.template.UriTemplate;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.util.concurrent.ListenableFuture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blitline Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.soluvas.image.impl.BlitlineTransformerImpl#getApplicationId <em>Application Id</em>}</li>
 *   <li>{@link org.soluvas.image.impl.BlitlineTransformerImpl#getBucket <em>Bucket</em>}</li>
 *   <li>{@link org.soluvas.image.impl.BlitlineTransformerImpl#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link org.soluvas.image.impl.BlitlineTransformerImpl#getTenantEnv <em>Tenant Env</em>}</li>
 *   <li>{@link org.soluvas.image.impl.BlitlineTransformerImpl#getCdnAlias <em>Cdn Alias</em>}</li>
 *   <li>{@link org.soluvas.image.impl.BlitlineTransformerImpl#getKeyTemplate <em>Key Template</em>}</li>
 *   <li>{@link org.soluvas.image.impl.BlitlineTransformerImpl#getUriTemplate <em>Uri Template</em>}</li>
 *   <li>{@link org.soluvas.image.impl.BlitlineTransformerImpl#getOriginUriTemplate <em>Origin Uri Template</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("serial")
public class BlitlineTransformerImpl extends ImageTransformerImpl implements BlitlineTransformer {
	
	public static class ToGravity implements Function<TransformGravity, String> {
		@Override @Nullable
		public String apply(@Nullable TransformGravity input) {
			if (input == null)
				return null;
			switch (input) {
			case CENTER:
				return "CenterGravity";
			case TOP_CENTER:
				return "NorthGravity";
			case TOP_LEFT:
				return "NorthEastGravity";
			case TOP_RIGHT:
				return "NorthWestGravity";
			case BOTTOM_CENTER:
				return "SouthGravity";
			case BOTTOM_LEFT:
				return "SouthEastGravity";
			case BOTTOM_RIGHT:
				return "SouthWestGravity";
			default:
				throw new ImageException("Unsupported gravity: " + input);
			}
		}
	}

	private static final Logger log = LoggerFactory
			.getLogger(BlitlineTransformerImpl.class);
	private final CloseableHttpClient client = HttpClients.createDefault();
	
	/**
	 * The default value of the '{@link #getApplicationId() <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationId()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getApplicationId() <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationId()
	 * @generated
	 * @ordered
	 */
	protected String applicationId = APPLICATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBucket() <em>Bucket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucket()
	 * @generated
	 * @ordered
	 */
	protected static final String BUCKET_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBucket() <em>Bucket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucket()
	 * @generated
	 * @ordered
	 */
	protected String bucket = BUCKET_EDEFAULT;
	/**
	 * The default value of the '{@link #getTenantId() <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantId()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTenantId() <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantId()
	 * @generated
	 * @ordered
	 */
	protected String tenantId = TENANT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getTenantEnv() <em>Tenant Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantEnv()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_ENV_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTenantEnv() <em>Tenant Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantEnv()
	 * @generated
	 * @ordered
	 */
	protected String tenantEnv = TENANT_ENV_EDEFAULT;
	/**
	 * The default value of the '{@link #getCdnAlias() <em>Cdn Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdnAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String CDN_ALIAS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCdnAlias() <em>Cdn Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdnAlias()
	 * @generated
	 * @ordered
	 */
	protected String cdnAlias = CDN_ALIAS_EDEFAULT;
	/**
	 * The default value of the '{@link #getKeyTemplate() <em>Key Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_TEMPLATE_EDEFAULT = "{tenantId}_{tenantEnv}/{namespace}/{styleCode}/{imageId}_{styleVariant}.{extension}";
	/**
	 * The cached value of the '{@link #getKeyTemplate() <em>Key Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyTemplate()
	 * @generated
	 * @ordered
	 */
	protected String keyTemplate = KEY_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUriTemplate() <em>Uri Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_TEMPLATE_EDEFAULT = "http://{+alias}/{tenantId}_{tenantEnv}/{namespace}/{styleCode}/{imageId}_{styleVariant}.{extension}";
	/**
	 * The cached value of the '{@link #getUriTemplate() <em>Uri Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriTemplate()
	 * @generated
	 * @ordered
	 */
	protected String uriTemplate = URI_TEMPLATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getOriginUriTemplate() <em>Origin Uri Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginUriTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_URI_TEMPLATE_EDEFAULT = "http://{+alias}/{tenantId}_{tenantEnv}/{namespace}/{styleCode}/{imageId}_{styleVariant}.{extension}";
	/**
	 * The cached value of the '{@link #getOriginUriTemplate() <em>Origin Uri Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginUriTemplate()
	 * @generated
	 * @ordered
	 */
	protected String originUriTemplate = ORIGIN_URI_TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected BlitlineTransformerImpl() {
		throw new UnsupportedOperationException();
	}
	
	public BlitlineTransformerImpl(String applicationId, String bucket, String tenantId, String tenantEnv,
			String cdnAlias) {
		super();
		this.applicationId = applicationId;
		this.bucket = bucket;
		this.tenantId = tenantId;
		this.tenantEnv = tenantEnv;
		this.cdnAlias = cdnAlias;
	}
	
	public void destroy() {
		client.getConnectionManager().shutdown();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImagePackage.Literals.BLITLINE_TRANSFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBucket() {
		return bucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenantId() {
		return tenantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenantEnv() {
		return tenantEnv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCdnAlias() {
		return cdnAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyTemplate() {
		return keyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUriTemplate() {
		return uriTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginUriTemplate() {
		return originUriTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public ListenableFuture<List<UploadedImage>> transform(final ImageConnector source, final File sourceFile,
			final String namespace, final String imageId, final ImageVariant sourceVariant, 
			final Map<ImageTransform, ImageVariant> transforms) {
		return getExecutor().submit(new Callable<List<UploadedImage>>() {
			@Override
			public List<UploadedImage> call() throws Exception {
				final UriTemplate originUriExpander = UriTemplate.fromTemplate(getOriginUriTemplate());
				final UriTemplate uriExpander = UriTemplate.fromTemplate(getUriTemplate());
				
				final String sourceUri = source.getOriginUri(namespace, imageId,
						sourceVariant.getStyleCode(), sourceVariant.getStyleVariant(), sourceVariant.getExtension());
				final ImmutableList.Builder<UploadedImage> uploadsBuilder = ImmutableList.builder();
				final ImmutableList.Builder<JobFunction> jobFuncsBuilder = ImmutableList.builder();
				for (final Entry<ImageTransform, ImageVariant> entry : transforms.entrySet()) {
					final ImageTransform transform = entry.getKey();
					final ImageVariant dest = entry.getValue();
					if (transform instanceof ResizeToFill) {
						final ResizeToFill fx = (ResizeToFill) transform;
						final Map<String, Object> params = new HashMap<String, Object>();
						if (fx.getWidth() != null)
							params.put("width", fx.getWidth());
						if (fx.getHeight() != null)
							params.put("height", fx.getHeight());
						params.put("gravity", new ToGravity().apply(fx.getGravity()));
						final String funcId = String.format("%s/%s/%s_%s.%s",
								namespace, dest.getStyleCode(), imageId,
								dest.getStyleVariant(), dest.getExtension());
						// namespace, styleCode, imageId, styleVariant, extension
						final Map<String, Object> uriVars = Maps.newHashMap();
						uriVars.put("tenantId", tenantId);
						uriVars.put("tenantEnv", tenantEnv);
						uriVars.put("namespace", namespace);
						uriVars.put("styleCode", dest.getStyleCode());
						uriVars.put("imageId", imageId);
						uriVars.put("styleVariant", dest.getStyleVariant());
						uriVars.put("extension", dest.getExtension());
						final String key = UriTemplate.fromTemplate(keyTemplate).expand(uriVars);
						final JobS3Destination s3dest = new JobS3Destination(bucket, key,
								ImmutableMap.of("x-amz-storage-class", "REDUCED_REDUNDANCY"));
						final JobFunction jobFunc = new JobFunction("resize_to_fill", params, new JobSave(funcId, s3dest));
						jobFuncsBuilder.add(jobFunc);
						
						// predict what will be returned
						final String originAlias = bucket + ".s3.amazonaws.com";
						
						final Map<String, Object> originVars = Maps.newHashMap(uriVars);
						originVars.put("alias", originAlias);
						final String originUri = originUriExpander.expand(originVars);
						
						final Map<String, Object> cdnVars = Maps.newHashMap(uriVars);
						cdnVars.put("alias", Optional.fromNullable(cdnAlias).or(originAlias));
						final String cdnUri = uriExpander.expand(cdnVars);
						
						final UploadedImage uploadedImage = ImageFactory.eINSTANCE.createUploadedImage();
						uploadedImage.setStyleCode(dest.getStyleCode());
						uploadedImage.setStyleVariant(dest.getStyleVariant());
						uploadedImage.setExtension(dest.getExtension());
						uploadedImage.setOriginUri(originUri);
						uploadedImage.setUri(cdnUri);
						uploadedImage.setWidth(fx.getWidth());
						uploadedImage.setHeight(fx.getHeight());
						uploadedImage.setSize(null); // TODO: update size when Blitline gives us a postback
						uploadsBuilder.add(uploadedImage);
					} else {
						throw new UnsupportedOperationException("Transform not supported: " + transform);
					}
				}
				
				final List<JobFunction> jobFuncs = jobFuncsBuilder.build();
				final Job job = new Job(applicationId, sourceUri, jobFuncs);
				final String jobJson = JsonUtils.asJson(job);
				log.debug("Sending job with {} functions: {}", jobFuncs.size(), jobJson);
				try {
					final HttpPost postReq = new HttpPost("http://api.blitline.com/job");
					postReq.setEntity(new UrlEncodedFormEntity(ImmutableList.of(new BasicNameValuePair("json", jobJson))));
					try (final CloseableHttpResponse response = client.execute(postReq)) {
						final StatusLine responseStatus = response.getStatusLine();
						final String responseBody;
						if (response.getEntity() != null)
							responseBody = IOUtils.toString(response.getEntity().getContent());
						else
							responseBody = null;
						if (responseStatus.getStatusCode() >= 200 && responseStatus.getStatusCode() < 300) {
							log.info("Job returned {}: {}", responseStatus, responseBody);
						} else
							log.error("Job returned {}: {}", responseStatus, responseBody);
					}
				} catch (Exception e) {
					log.error("Error transforming " + sourceVariant + " with " + jobFuncs.size() + " functions: " + jobJson, e);
				}
				
				return uploadsBuilder.build();
			}
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImagePackage.BLITLINE_TRANSFORMER__APPLICATION_ID:
				return getApplicationId();
			case ImagePackage.BLITLINE_TRANSFORMER__BUCKET:
				return getBucket();
			case ImagePackage.BLITLINE_TRANSFORMER__TENANT_ID:
				return getTenantId();
			case ImagePackage.BLITLINE_TRANSFORMER__TENANT_ENV:
				return getTenantEnv();
			case ImagePackage.BLITLINE_TRANSFORMER__CDN_ALIAS:
				return getCdnAlias();
			case ImagePackage.BLITLINE_TRANSFORMER__KEY_TEMPLATE:
				return getKeyTemplate();
			case ImagePackage.BLITLINE_TRANSFORMER__URI_TEMPLATE:
				return getUriTemplate();
			case ImagePackage.BLITLINE_TRANSFORMER__ORIGIN_URI_TEMPLATE:
				return getOriginUriTemplate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImagePackage.BLITLINE_TRANSFORMER__APPLICATION_ID:
				return APPLICATION_ID_EDEFAULT == null ? applicationId != null : !APPLICATION_ID_EDEFAULT.equals(applicationId);
			case ImagePackage.BLITLINE_TRANSFORMER__BUCKET:
				return BUCKET_EDEFAULT == null ? bucket != null : !BUCKET_EDEFAULT.equals(bucket);
			case ImagePackage.BLITLINE_TRANSFORMER__TENANT_ID:
				return TENANT_ID_EDEFAULT == null ? tenantId != null : !TENANT_ID_EDEFAULT.equals(tenantId);
			case ImagePackage.BLITLINE_TRANSFORMER__TENANT_ENV:
				return TENANT_ENV_EDEFAULT == null ? tenantEnv != null : !TENANT_ENV_EDEFAULT.equals(tenantEnv);
			case ImagePackage.BLITLINE_TRANSFORMER__CDN_ALIAS:
				return CDN_ALIAS_EDEFAULT == null ? cdnAlias != null : !CDN_ALIAS_EDEFAULT.equals(cdnAlias);
			case ImagePackage.BLITLINE_TRANSFORMER__KEY_TEMPLATE:
				return KEY_TEMPLATE_EDEFAULT == null ? keyTemplate != null : !KEY_TEMPLATE_EDEFAULT.equals(keyTemplate);
			case ImagePackage.BLITLINE_TRANSFORMER__URI_TEMPLATE:
				return URI_TEMPLATE_EDEFAULT == null ? uriTemplate != null : !URI_TEMPLATE_EDEFAULT.equals(uriTemplate);
			case ImagePackage.BLITLINE_TRANSFORMER__ORIGIN_URI_TEMPLATE:
				return ORIGIN_URI_TEMPLATE_EDEFAULT == null ? originUriTemplate != null : !ORIGIN_URI_TEMPLATE_EDEFAULT.equals(originUriTemplate);
		}
		return super.eIsSet(featureID);
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
		result.append(" (applicationId: ");
		result.append(applicationId);
		result.append(", bucket: ");
		result.append(bucket);
		result.append(", tenantId: ");
		result.append(tenantId);
		result.append(", tenantEnv: ");
		result.append(tenantEnv);
		result.append(", cdnAlias: ");
		result.append(cdnAlias);
		result.append(", keyTemplate: ");
		result.append(keyTemplate);
		result.append(", uriTemplate: ");
		result.append(uriTemplate);
		result.append(", originUriTemplate: ");
		result.append(originUriTemplate);
		result.append(')');
		return result.toString();
	}

} //BlitlineTransformerImpl
