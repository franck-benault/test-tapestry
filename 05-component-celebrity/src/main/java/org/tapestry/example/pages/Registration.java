package org.tapestry.example.pages;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.tapestry.example.model.security.Gender;

public class Registration {
	
	@Persist
	@Property
	private String userName;
	
	@Persist
	@Property
	private String password;
	
	@Property
	private String password2;
	
	@Persist
	@Property
	private Gender gender;
	
	@Property
	private String email;
	
	@Persist
	@Property
	private boolean subscribe;
	
	@Property
	private boolean unsubscribe;
	
	
	public Gender getMale() {
		return Gender.MALE;
	}
	
	public Gender getFemale() {
		return Gender.FEMALE;
	}
	
	void onSubmitFromRegistrationForm() {
		System.out.println("The form has been submitted with gender "+gender);
		System.out.println("The form has been submitted with unsubscribe "+unsubscribe);
		
		if(unsubscribe) subscribe = false;
	}

}
