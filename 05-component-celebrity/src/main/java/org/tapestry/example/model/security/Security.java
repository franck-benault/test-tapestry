package org.tapestry.example.model.security;

public class Security {
	
	private static final String USERNAME = "user";
	private static final String PASSWORD = "secret";
	
	
	public static User authenticate(String userName, String password) {
		
		if(USERNAME.equals(userName) && PASSWORD.equals(password))
			return new User("John", "Snow");
		
		return null;
	}

}
