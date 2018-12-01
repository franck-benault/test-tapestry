package org.tapestry.example.pages;


import org.apache.tapestry5.annotations.SessionState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tapestry.example.model.security.Security;
import org.tapestry.example.model.security.User;

public class Index {
	

	private static Logger logger = LoggerFactory.getLogger(Index.class);
	
	private String userName;
	private String password;
	
	@SessionState
	private User user;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	Object onSubmitFromLoginForm() {
		Class nextPage =null;
		
		User authenticatedUser = Security.authenticate(userName, password);
		logger.info("authenticatedUser={}", authenticatedUser);
		
		if(authenticatedUser!=null) {
			user = authenticatedUser;
			nextPage = ShowAll.class;
		} else {
			nextPage = Registration.class;
		}
				
				
		return nextPage;
	}

	


}
