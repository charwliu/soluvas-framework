package org.soluvas.eventbus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSubscriber {

	private static final Logger log = LoggerFactory
			.getLogger(TestSubscriber.class);
	
	public TestSubscriber() {
		log.info("Bikin subscriber test");
	}
	
//	@Subscribe
	public void handleAnything(Object event) {
		log.info("Waw ada {}", event);
	}
}
