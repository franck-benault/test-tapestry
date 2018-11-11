package org.tapestry.example.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Index {
	
	private static Logger logger = LoggerFactory.getLogger(Index.class);
	
	public String getUsername() {
		logger.debug("getUsername called");
		return "foo";
	}

}
