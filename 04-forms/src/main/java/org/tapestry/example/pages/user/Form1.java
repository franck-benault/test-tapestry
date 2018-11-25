package org.tapestry.example.pages.user;

import org.apache.tapestry5.EventConstants;
import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.corelib.components.PageLink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tapestry.example.util.User;

public class Form1 {
	

	private static Logger logger = LoggerFactory.getLogger(Form1.class);
	
	@SessionState
	private User user;
	
	@Component(parameters= {"page=Index"})
	private PageLink linkToIndex;


	@Property
	private String username;
	
	@OnEvent(value=EventConstants.SUBMIT, component="userInputForm")
	Object onFormSubmit() {
		logger.info("username={}", username);
		
		user = new User();
		
		String[] words = username.split(" ");
		if(words.length>0) {
			user.setFirstName(words[0]);
			if(words.length>1) {
				user.setLastName(words[1]);
			}
		}
		
		return "index";
	}
	
	
	
}
