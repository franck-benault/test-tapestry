package org.tapestry.example.pages;

import org.apache.tapestry5.annotations.Property;

public class Registration {
	
	@Property
	private String userName;
	
	@Property
	private String password;
	
	@Property
	private String password2;
	
	@Property
	private String gender;
	
	void onSubmitFromRegistrationForm() {
		System.out.println("The form has been submitted with gender "+gender);
	}

}
