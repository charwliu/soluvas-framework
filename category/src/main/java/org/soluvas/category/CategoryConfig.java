package org.soluvas.category;

import javax.inject.Inject;

import org.soluvas.category.util.CategoryCatalogXmiTracker;
import org.soluvas.commons.DataFolder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.google.common.eventbus.EventBus;

/**
 * @author rudi
 *
 */
@Configuration @Lazy
@ComponentScan("org.soluvas.category")
public class CategoryConfig {
	
	@Inject
	private EventBus eventBus;
	@Inject @DataFolder
	private String dataFolder;
	
	@Bean
	public CategoryCatalog categoryCatalog() {
		final CategoryCatalog categoryCatalog = CategoryFactory.eINSTANCE.createCategoryCatalog();
		final CategoryCatalogXmiTracker tracker = new CategoryCatalogXmiTracker(categoryCatalog, eventBus);
		tracker.scan(CategoryConfig.class.getClassLoader(), dataFolder);
		return categoryCatalog;
	}

}