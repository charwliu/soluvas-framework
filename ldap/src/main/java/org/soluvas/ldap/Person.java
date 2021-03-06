package org.soluvas.ldap;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;

import org.picketlink.idm.api.User;
import org.soluvas.json.JsonUtils;

import com.google.common.collect.ImmutableSet;

/**
 * A basic LDAP <tt>objectClass=person</tt> with proper mappings that can be subclassed.
 * @author ceefour
 */
@SuppressWarnings("serial")
@LdapEntry(objectClasses={"inetOrgPerson", "uidObject", "extensibleObject"})
public class Person implements Serializable, User {

	@LdapRdn @LdapAttribute("uid") @NotNull private String id;
	@LdapAttribute("uniqueIdentifier") private String slug;
	@LdapAttribute({"gn", "givenName"}) private String firstName;
	@LdapAttribute("sn") @NotNull private String lastName;
	@LdapAttribute("cn") @NotNull private String name;
	@LdapAttribute("userPassword") private String password;
	@LdapAttribute("mail") private Set<String> emails;
	@LdapAttribute("mobile") private String mobile;
	@LdapAttribute("telephoneNumber") private String phone;
	@LdapAttribute("street") private String streetAddress;
	@LdapAttribute("postalCode") private String postalCode;
	@LdapAttribute("l") private String city;
	@LdapAttribute("st") private String state;
	@LdapAttribute("c") private String country;
	@LdapAttribute("co") private String countryName;
	
	@LdapAttribute("description") private String description;
	
	public Person() {
	}
	
	public Person(String id, String slug, String firstName, String lastName) {
		super();
		this.id = id;
		this.slug = slug;
		this.firstName = firstName;
		this.lastName = lastName;
		this.name = (firstName + " " + lastName).trim();
	}

	public Person(String id, String slug, String firstName, String lastName, String email) {
		this(id, slug, firstName, lastName);
		this.emails = email != null ? ImmutableSet.of(email) : new HashSet<String>();
	}

	/**
	 * @return the id
	 */
	@Override
	public String getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the emails
	 */
	public Set<String> getEmails() {
		return emails;
	}
	
	/**
	 * @param emails the emails to set
	 */
	public void setEmails(Set<String> emails) {
		this.emails = emails;
	}

	/**
	 * @return the slug
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * @param slug the slug to set
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}

	/**
	 * @return the password, may be encoded e.g. <code>{SSHA}BacKnhFVjpSunHYgivCVPAzcavAZZe9QFtd51A==<code> 
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set, may be encoded e.g. <code>{SSHA}BacKnhFVjpSunHYgivCVPAzcavAZZe9QFtd51A==<code>
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Country code.
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * RFC1274: friendly country name
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * RFC1274: friendly country name
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return JsonUtils.asJson(this);
	}

	/**
	 * Implements PicketLink IDM API {@link User}.
	 */
	@Override
	public String getKey() {
		return getId();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
