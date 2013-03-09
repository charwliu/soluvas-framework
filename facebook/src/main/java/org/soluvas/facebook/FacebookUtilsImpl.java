package org.soluvas.facebook;

import java.io.File;
import java.net.URI;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.inject.Inject;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.image.store.Image;
import org.soluvas.image.store.ImageRepository;
import org.soluvas.ldap.SocialPerson;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.base.Function;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Lists;

/**
 * Inspired by org.soluvas.fbcli.FriendListDownloader.
 * @author ceefour
 */
public class FacebookUtilsImpl implements FacebookUtils {
	
	private transient static Logger log = LoggerFactory.getLogger(FacebookUtilsImpl.class);
	@Inject private FriendListDownloader friendListDownloader;
	@Inject private UserListParser userListParser;
	private LoadingCache<String, List<HintPerson>> friendListCache;
	
	protected FacebookUtilsImpl() {
		super();
	}
	
	public FacebookUtilsImpl(FriendListDownloader friendListDownloader,
			UserListParser userListParser) {
		super();
		this.friendListDownloader = friendListDownloader;
		this.userListParser = userListParser;
		this.friendListCache = CacheBuilder.newBuilder().build(new CacheLoader<String, List<HintPerson>>() {
			@Override
			public List<HintPerson> load(String key) throws Exception {
				return findFriends(key);
			}
		});
	}

	/* (non-Javadoc)
	 * @see org.soluvas.facebook.FacebookUtils#findFriends(java.lang.String)
	 */
	@Override
	public List<HintPerson> findFriends(String accessToken) {
		try {
			// Get pages of friends
			URI friendsPageUri = new URIBuilder("https://graph.facebook.com/me/friends")
				.addParameter("access_token", accessToken)
				.addParameter("limit", "250")
				.build();
			Future<List<JsonNode>> pagesFuture = friendListDownloader.fetchFriendsPages(friendsPageUri);
			List<JsonNode> pages = pagesFuture.get();
//			List<JsonNode> pages = Await.result(pagesFuture, Duration.Inf());
			
			// Parse user list from JSON nodes
			List<UserRef> userList = userListParser.parseNodes(pages).get();
//			List<UserRef> userList = Await.result(userListParser.parseNodes(pages), Duration.Inf());
			log.info("Parsed {} users", userList.size());
			
			List<HintPerson> hintPeople = Lists.transform(userList, new Function<UserRef, HintPerson>() {
				@Override
				public HintPerson apply(UserRef input) {
					HintPerson hintPerson = new HintPerson(null, null, input.getName(), null,
							input.getId() + "@facebook.com", input.getId());
					return hintPerson;
				}
			});
			return hintPeople;
		} catch (Exception e) {
			log.error("Cannot find friends", e);
			throw new RuntimeException("Cannot find friends", e);
		}
	}

	/* (non-Javadoc)
	 * @see org.soluvas.facebook.FacebookUtils#findFriendsCached(java.lang.String)
	 */
	@Override
	public List<HintPerson> findFriendsCached(String accessToken) {
		try {
			return friendListCache.get(accessToken);
		} catch (ExecutionException e) {
			log.error("Cannot find friends", e);
			throw new RuntimeException("Cannot find friends", e);
		}
	}
	
	/**
	 * Fetches Facebook user photo from Facebook, uploads it to ImageRepository, but not modify any {@link SocialPerson}.
	 * @param facebookId Facebook User ID.
	 * @param personName Person name, used for the image name and for logging purposes.
	 * @return ImageID from the ImageRepository.
	 */
	public static String refreshPhotoFromFacebook(final Long facebookId, final String personName,
			ImageRepository imageRepo) {
		// Get Image
		final String photoUrl = "https://graph.facebook.com/"+ facebookId + "/picture?type=large";
		final HttpClient httpClient = new DefaultHttpClient();
		try {
			final HttpGet httpGet = new HttpGet(photoUrl);
			log.debug("Photo URL for Facebook user {} ({}) is {}", facebookId, personName, photoUrl);
			final HttpResponse response = httpClient.execute(httpGet);
			final File tmpFile = File.createTempFile("fb_", ".jpg");
			try {
				FileUtils.copyInputStreamToFile(response.getEntity().getContent(), tmpFile);
				log.debug("Photo Status Line {}",  response.getStatusLine());
				final Image newImage = new Image(tmpFile, ".jpg", personName + " Facebook " + facebookId);
				final String imageId = imageRepo.add(newImage);
				log.debug("tmp file path from Facebook user {} is {}", tmpFile);
				return imageId;
			} finally {
				tmpFile.delete();
				HttpClientUtils.closeQuietly(response);
			}
		} catch (final Exception e) {
			throw new RuntimeException("Cannot refresh Facebook user " + facebookId + " (" + personName +") from Facebook URI " + photoUrl, e);
		} finally {
			HttpClientUtils.closeQuietly(httpClient);
		}
	}
	
}