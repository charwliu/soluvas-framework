package org.soluvas.mongo.event;

import org.soluvas.commons.Person;
import org.soluvas.push.TrackableEvent;

/**
 * 
 * @author atang
 *
 */
@SuppressWarnings("serial")
public class PersonRegisteredEvent extends TrackableEvent {
	
	private final Person person;

	public PersonRegisteredEvent(Person person, String trackingId) {
		super(trackingId);
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	@Override
	public String toString() {
		return "PersonRegisteredEvent ["
				+ (person != null ? "person=" + person : "") + "]";
	}
	
}