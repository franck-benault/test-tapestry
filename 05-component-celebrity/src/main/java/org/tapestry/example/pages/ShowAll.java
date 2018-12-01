package org.tapestry.example.pages;

import org.apache.tapestry5.annotations.SessionState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tapestry.example.model.security.User;

public class ShowAll {
	
	private static Logger logger = LoggerFactory.getLogger(ShowAll.class);
	
	@SessionState(create=false)
	private User user;
	
	
	public User getUser() {
		return user;
	}


	Object onActivate() {
		if(user==null) {
			return Index.class;
		}
		logger.info("user ={}", user);
		return null;
	}

}
