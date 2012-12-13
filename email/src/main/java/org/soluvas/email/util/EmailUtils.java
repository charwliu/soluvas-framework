package org.soluvas.email.util;

import java.util.List;
import java.util.NoSuchElementException;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.soluvas.email.EmailCatalog;
import org.soluvas.email.EmailException;
import org.soluvas.email.Layout;
import org.soluvas.email.LayoutType;
import org.soluvas.email.Page;
import org.soluvas.email.PageType;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * @author ceefour
 */
public class EmailUtils {

	/**
	 * Helper method to create a {@link Layout}.
	 * @param nsPrefix
	 * @param name
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Layout> T createLayout(@Nonnull final Class<T> targetClass) {
		final BundleContext bundleContext = FrameworkUtil.getBundle(EmailUtils.class).getBundleContext();
		final ServiceReference<EmailCatalog> emailCatalogRef = Preconditions.checkNotNull(bundleContext.getServiceReference(EmailCatalog.class),
				"Cannot get %s service reference", EmailCatalog.class.getName());
		final EmailCatalog emailCatalog = Preconditions.checkNotNull(
				bundleContext.getService(emailCatalogRef),
				"Cannot get %s service", EmailCatalog.class.getName());
		try {
			final LayoutType type = Iterables.find(emailCatalog.getLayoutTypes(),
					new Predicate<LayoutType>() {
				@Override
				public boolean apply(@Nullable final LayoutType input) {
					return targetClass.equals( input.getJavaClass() );
				}
			});
			return (T) type.create();
		} catch (final NoSuchElementException e) {
			final Function<LayoutType, String> targetTypeQName = new Function<LayoutType, String>() {
				@Override @Nullable
				public String apply(@Nullable LayoutType input) {
					return input.getJavaClass().getName();
				}
			};
			final List<String> supportedLayoutTypeQNames = Lists.transform(emailCatalog.getLayoutTypes(), targetTypeQName);
			throw new EmailException(String.format("Cannot find layout type %s, %s supported types are: %s",
					targetClass.getName(), supportedLayoutTypeQNames.size(), supportedLayoutTypeQNames), e);
		} finally {
			bundleContext.ungetService(emailCatalogRef);
		}
	}

	/**
	 * Helper method to create a {@link Page}.
	 * @param nsPrefix
	 * @param name
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Page> T createPage(@Nonnull final Class<T> targetClass, @Nonnull final Layout layout) {
		final BundleContext bundleContext = FrameworkUtil.getBundle(EmailUtils.class).getBundleContext();
		final ServiceReference<EmailCatalog> emailCatalogRef = Preconditions.checkNotNull(bundleContext.getServiceReference(EmailCatalog.class),
				"Cannot get %s service reference", EmailCatalog.class.getName());
		final EmailCatalog emailCatalog = Preconditions.checkNotNull(
				bundleContext.getService(emailCatalogRef),
				"Cannot get %s service", EmailCatalog.class.getName());
		try {
			final PageType type = Iterables.find(emailCatalog.getPageTypes(),
					new Predicate<PageType>() {
				@Override
				public boolean apply(@Nullable final PageType input) {
					return targetClass.equals( input.getJavaClass() );
				}
			});
			return (T) type.create(layout);
		} catch (final NoSuchElementException e) {
			final Function<PageType, String> targetTypeQName = new Function<PageType, String>() {
				@Override @Nullable
				public String apply(@Nullable PageType input) {
					return input.getJavaClass().getName();
				}
			};
			final List<String> supportedPageTypeQNames = Lists.transform(emailCatalog.getPageTypes(), targetTypeQName);
			throw new EmailException(String.format("Cannot find page type %s, %s supported types are: %s",
					targetClass.getName(), supportedPageTypeQNames.size(), supportedPageTypeQNames), e);
		} finally {
			bundleContext.ungetService(emailCatalogRef);
		}
	}

}