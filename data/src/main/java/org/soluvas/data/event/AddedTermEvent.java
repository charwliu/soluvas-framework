package org.soluvas.data.event;

import org.soluvas.data.Term;
import org.soluvas.push.TenantEvent;

/**
 * @author rudi
 *
 */
public class AddedTermEvent extends TenantEvent {
	
	private static final long serialVersionUID = 1L;
	
	private final Term term;

	public AddedTermEvent(Term term, String tenantId, String trackingId) {
		super(tenantId, trackingId);
		this.term = term;
	}

	public Term getTerm() {
		return term;
	}

}
