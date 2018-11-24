package org.tapestry.example.pages;


import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.corelib.components.PageLink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tapestry.example.util.User;
import org.apache.tapestry5.annotations.SessionState;

public class Index {
	
	@SessionState
	private User user;
	
	@Component(parameters= {"page=user/Form1"})
	private PageLink linkToForm1;
	
	public User getUser() {
		if(user==null) {
			user = new User();
		}
		logger.info("user={}", user);
		return user;
	}

	private static Logger logger = LoggerFactory.getLogger(Index.class);
	

	


}
