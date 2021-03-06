package org.soluvas.image.shell; 

import static org.fusesource.jansi.Ansi.ansi;

import java.util.Map;

import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.apache.felix.gogo.commands.Option;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.shell.ExtCommandSupport;
import org.soluvas.image.store.ImageRepository;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

/**
 * For each image, redownloads the original file from WebDAV repository, reprocesses each image style, and re-uploads the processed images to WebDAV repository.
 *
 * <p>On OVH server, reprocessing 433 Berbatik product images took 7m41s, including
 * downloading the original images from S3 then reuploading the transformed images.
 * 
 * @author ceefour
 */
@Service @Scope("prototype")
@Command(scope="image", name="reprocess", description="For each image, redownloads the original file from WebDAV repository, reprocesses each image style, and re-uploads the processed images to WebDAV repository.")
public class ImageReprocessCommand extends ExtCommandSupport {

	private static final Logger log = LoggerFactory.getLogger(ImageReprocessCommand.class);

	@Option(name="-n", aliases={"--ns", "--namespace"},
			description="Namespace, e.g. person, shop, product.")
	private transient String namespace = "person";

	@Option(name="-a", aliases={"--all"}, description="Apply this action on all Image entities.")
	private transient boolean all = false;

	@Argument(index=0, name="id ...", required=false, multiValued=true,
			description="Image ID(s).")
	private String[] ids;
	
	@Override
	protected Object doExecute() throws Exception {
		final Map<String, ImageRepository> imageRepos = getBeans(ImageRepository.class);
		final ImageRepository imageRepo = Iterables.find(imageRepos.values(), new Predicate<ImageRepository>() {
			@Override
			public boolean apply(ImageRepository input) {
				return namespace.equals(input.getNamespace());
			}
		});
		
		System.err.println(ansi().render("Reprocessing @|bold %s|@ images using @|bold %s|@", namespace, imageRepo));
		if (all) {
			imageRepo.reprocessAll(monitor);
		} else {
			if (ids != null && ids.length > 0) {
				imageRepo.reprocess(ImmutableList.copyOf(ids), monitor);
			} else {
				System.err.println("At least one Image ID must be specified.");
			}
		}
		return null;
	}

}
