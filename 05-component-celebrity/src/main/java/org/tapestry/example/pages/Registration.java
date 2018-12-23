package org.tapestry.example.pages;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.tapestry.example.model.security.Gender;

public class Registration {
	
	@Property
	private String userName;
	
	@Property
	private String password;
	
	@Property
	private String password2;
	
	@Property
	private Gender gender;
	
	@Property
	private String email;
	
	@Persist
	@Property
	private boolean subscribe;
	
	public Gender getMale() {
		return Gender.MALE;
	}
	
	public Gender getFemale() {
		return Gender.FEMALE;
	}
	
	void onSubmitFromRegistrationForm() {
		System.out.println("The form has been submitted with gender "+gender);
	}

}
