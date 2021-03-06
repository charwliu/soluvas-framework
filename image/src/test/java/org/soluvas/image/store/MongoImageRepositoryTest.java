package org.soluvas.image.store;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MongoImageRepositoryTest {

	private MongoImageRepository imageRepo;

	@Before
	public void setUp() throws Exception {
//		Properties props = new Properties();
//		props.load(MongoImageRepositoryTest.class.getResourceAsStream("/soluvas-image-store.properties"));
//		
//		final String namespace = props.getProperty("person.image.namespace");
//		final String personImageDavUri = props.getProperty("person.image.dav.uri");
//		final String personImagePublicUri = props.getProperty("person.image.public.uri");
//		final String personImageMongoUri = props.getProperty("person.image.mongo.uri");
//		final List<ImageStyle> styles = ImmutableList.of(
//			new ImageStyle("thumbnail", "t", 50, 50),
//			new ImageStyle("small", "s", 125, 125),
//			new ImageStyle("normal", "n", 240, 320));
//		final DavConnector connector = new DavConnectorImpl(personImageDavUri, personImagePublicUri);
//		final ImageMagickTransformer transformer = new ImageMagickTransformerImpl(connector);
//		imageRepo = new MongoImageRepository(namespace, personImageMongoUri, connector, transformer, styles);
	}

	@After
	public void tearDown() throws Exception {
//		imageRepo.destroy();
	}

	@Test
	public void shouldCreateSuccessfully() throws FileNotFoundException, IOException {
		final File file = new File("/together/project/AksiMata/sample/Shaun-udah-mau-makan.jpg");
//		String imageId = imageRepo.create(file.getName(), new FileInputStream(file), "image/jpeg", file.length(), "Shaun udah mau makan");
		final String imageId = imageRepo.add(new Image(file, "image/jpeg", "Shaun udah mau makan")).getId();
		System.out.println("Created image " + imageId);
		assertNotNull(imageId);
	}
	
}
