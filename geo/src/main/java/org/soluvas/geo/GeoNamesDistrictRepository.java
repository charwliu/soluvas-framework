package org.soluvas.geo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Nullable;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.data.domain.Page;
import org.soluvas.data.domain.PageImpl;
import org.soluvas.data.domain.Pageable;

import au.com.bytecode.opencsv.CSVReader;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.googlecode.concurrenttrees.radix.ConcurrentRadixTree;
import com.googlecode.concurrenttrees.radix.RadixTree;
import com.googlecode.concurrenttrees.radix.node.concrete.DefaultCharArrayNodeFactory;

/**
 * How to prepare data:
 * 
 * <ol>
 * 	<li>Download GeoNames cities1000.txt from http://www.geonames.org/export/</li>
 * 	<li>Open the file using LibreOffice Calc</li>
 * 	<li>Delete the unneded columns, so that columns become: name, normalized name, country code</li>
 * 	<li>Save as {@code cities1000lite.csv}</li>
 * </ol>
 * 
 * @author rudi
 */
public class GeoNamesDistrictRepository implements DistrictRepository {
	
	private static final Logger log = LoggerFactory
			.getLogger(GeoNamesDistrictRepository.class);
	/**
	 * Tree containing segmented district names.
	 * e.g. "Other Kab. Labuhan Batu" will become 1 main entry + 3 full text search entries ({@code 123} is the RadixTree index
	 * to avoid key collision):
	 * <ol>
	 * 	<li>other kab. labuhan batu, ID -- used for exact match</li>
	 * 	<li>kab. labuhan batu 123</li>
	 * 	<li>labuhan batu 123</li>
	 * 	<li>batu 123</li>
	 * </ol> 
	 */
	final RadixTree<District> tree = new ConcurrentRadixTree<>(new DefaultCharArrayNodeFactory());
	final ImmutableMap<String, Country> countryMap;
	final ImmutableMap<String, Country> country3Map;
	private int entryCount = 0;
	private int realDistrictCount = 0;
	
	/**
	 * @param excludedCountryCodes Exclude cities from these country codes (2-letter ISO) from being loaded.
	 * @throws IOException
	 */
	public GeoNamesDistrictRepository(final Set<String> excludedCountryCodes) throws IOException {
		super();
		log.info("Initializing GeoNames district repository excluding {} countries: {}",
				excludedCountryCodes.size(), excludedCountryCodes);
		// Countries
		final ImmutableMap.Builder<String, Country> countryMab = ImmutableMap.builder();
		try (final InputStreamReader reader = new InputStreamReader(GeoNamesDistrictRepository.class.getResourceAsStream("countryinfo.csv"))) {
			try (final CSVReader csv = new CSVReader(reader, '\t', '"')) {
				while (true) {
					@Nullable
					final String[] line = csv.readNext();
					if (line == null) {
						break;
					}
					if (line[0].startsWith("#")) {
						continue;
					}
					final Country country = new Country(line[0], line[1], line[4]);
					countryMab.put(country.getIso(), country);
				}
			}
		}
		countryMap = countryMab.build();
		log.info("Read {} countries: {}", countryMap.size(), countryMap.keySet());
		country3Map = Maps.uniqueIndex(countryMap.values(), new Function<Country, String>() {
			@Override @Nullable
			public String apply(@Nullable Country input) {
				return input.getIso3();
			}
		});
		// Cities
		final List<String> skippedCities = new ArrayList<>();
		final List<String> excludedCities = new ArrayList<>();
		try (final InputStreamReader reader = new InputStreamReader(GeoNamesDistrictRepository.class.getResourceAsStream("districts_ID.csv"))) {
			try (final CSVReader csv = new CSVReader(reader, '\t', '"')) {
				while (true) {
					@Nullable
					final String[] line = csv.readNext();
					if (line == null) {
						break;
					}
					if (line[2].isEmpty()) {
						skippedCities.add(line[0]);
						continue;
					}
					if (excludedCountryCodes.contains(line[2])) {
						excludedCities.add(line[2]);
						continue;
					}
					putDistrict(line[0], line[1], line[2], null, null);
				}
			}
		}
		log.info("Skipped {} cities without country: {}", skippedCities.size(), Iterables.limit(skippedCities, 10));
		log.info("Excluded {} cities from country {}: {}", excludedCities.size(), Iterables.limit(excludedCities, 10));
		log.info("Read {} cities with countries into {} RadixTree entries", realDistrictCount, tree.size());
	}
	
	/**
	 * No excluded country codes.
	 * @throws IOException
	 */
	public GeoNamesDistrictRepository() throws IOException {
		this(ImmutableSet.<String>of());
	}
	
	@Override
	public District getDistrict(String normalizedNameAndCountryCode) throws IllegalArgumentException {
		final District district = tree.getValueForExactKey(normalizedNameAndCountryCode);
		Preconditions.checkArgument(district != null,
				"Invalid district for '%s'.", normalizedNameAndCountryCode);
		return district;
	}
	
	@Override
	public String getKeyForDistrict(District district) {
		return district.getNormalizedName().toLowerCase() + ", " + district.getCountry().getIso();
	}
	
	@Override
	public District getDistrict(String name, String countryCode) {
		return getDistrict(name.toLowerCase() + ", " + countryCode);
	}
	
	/* (non-Javadoc)
	 * @see org.soluvas.geo.DistrictRepository#getCountry(java.lang.String)
	 */
	@Override
	public Country getCountry(String iso2orIso3) throws IllegalArgumentException {
		Country country = countryMap.get(iso2orIso3);
		if (country == null) {
			country = country3Map.get(iso2orIso3);
		}
		Preconditions.checkArgument(country != null,
				"Invalid country ISO code '%s'. %s available countries are: %s.",
				iso2orIso3, countryMap.size(), countryMap.keySet());
		return country;
	}
	
	/* (non-Javadoc)
	 * @see org.soluvas.geo.DistrictRepository#searchDistrict(java.lang.String, org.soluvas.data.domain.Pageable)
	 */
	@Override
	public Page<District> searchDistrict(String term, Pageable pageable) {
		// http://stackoverflow.com/a/3322174/1343587
		final String normalizedTerm = Normalizer.normalize(term, Form.NFD).replaceAll("[^\\p{ASCII}]", "").toLowerCase();
		final Iterable<CharSequence> keys = tree.getKeysStartingWith(normalizedTerm);
		final ImmutableList<District> cities = FluentIterable.from(keys)
				.skip((int) pageable.getOffset())
				.limit((int) pageable.getPageSize())
				.transform(new Function<CharSequence, District>() {
			@Override @Nullable
			public District apply(@Nullable CharSequence key) {
				return tree.getValueForExactKey(key);
			}
		}).toList();
		final int total = Iterables.size(keys);
		final PageImpl<District> page = new PageImpl<>(cities, pageable, total);
		log.debug("Searching '{}' ({}) paged by {} returned {} (total {}) cities: {}",
				term, normalizedTerm, pageable, cities.size(), total, Iterables.limit(cities, 10));
		return page;
	}
	
	/* (non-Javadoc)
	 * @see org.soluvas.geo.DistrictRepository#putDistrict(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public District putDistrict(String name, String asciiName, String alternateName, String province, String city) {
		final Country country = countryMap.get(alternateName);
		Preconditions.checkNotNull(country, "Invalid country code '%s' for district '%s'",
				alternateName, name);
		final District district = new District(name, asciiName, province, country, new City());
		tree.put(district.getNormalizedName().toLowerCase() + ", " + district.getCountry().getIso(), district);
		entryCount++;
		// below are full text search entries, so tree entries are "duplicates", but still refer to safe District object above
		String fullTextName = district.getNormalizedName().toLowerCase();
		int spacePos = fullTextName.indexOf(' ');
		while (spacePos >= 0) {
			fullTextName = fullTextName.substring(spacePos + 1);
//			log.debug("fullTextName {} {}", spacePos, fullTextName);
			tree.put(fullTextName + " " + entryCount, district);
			entryCount++;
			spacePos = fullTextName.indexOf(' ');
		}
		realDistrictCount++;		
		return district;
	}

	@Override
	public long count() {
		return realDistrictCount;
	}
	
	public ImmutableMap<String, Country> getCountryMap() {
		return countryMap;
	}
	
	@Override
	public Page<Country> searchCountry(String term, Pageable pageable) {
		// http://stackoverflow.com/a/3322174/1343587
		final String normalizedTerm = Normalizer.normalize(term, Form.NFD).replaceAll("[^\\p{ASCII}]", "").toLowerCase();
		final FluentIterable<Country> matching = FluentIterable.from(countryMap.values())
			.filter(new Predicate<Country>() {
				@Override
				public boolean apply(@Nullable Country country) {
					return StringUtils.containsIgnoreCase(country.getIso() + " " + country.getIso3() + " " + country.getName(), normalizedTerm);
				}
			});
		final int total = Iterables.size(matching);
		final ImmutableList<Country> paged = matching
			.skip((int) pageable.getOffset())
			.limit((int) pageable.getPageSize())
			.toList();
		final PageImpl<Country> page = new PageImpl<>(paged, pageable, total);
		log.debug("Searching '{}' ({}) paged by {} returned {} (total {}) countries: {}",
				term, normalizedTerm, pageable, paged.size(), total, Iterables.limit(paged, 10));
		return page;
	}
	
}
