package org.soluvas.geo;

import java.io.Serializable;

/**
 * Download from <a href="http://download.geonames.org/export/dump/countryInfo.txt">http://download.geonames.org/export/dump/countryInfo.txt</a>.
 * @author rudi
 */
public class Country implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private final String iso;
	private final String name;
	
	public Country(String iso, String name) {
		super();
		this.iso = iso;
		this.name = name;
	}

	/**
	 * 2-letter ISO code.
	 * @return
	 */
	public String getIso() {
		return iso;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((iso == null) ? 0 : iso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Country))
			return false;
		Country other = (Country) obj;
		if (iso == null) {
			if (other.iso != null)
				return false;
		} else if (!iso.equals(other.iso))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Country [" + (iso != null ? "iso=" + iso + ", " : "")
				+ (name != null ? "name=" + name : "") + "]";
	}
	
}
