package org.tapestry.example.pages;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Index {
	
	private static Logger logger = LoggerFactory.getLogger(Index.class);
	
	public String getMessage() {
		logger.debug("getMessage called started");
		Date date = new Date();
		return date+"; Tapestry is (maybe) great !";
	}

}
