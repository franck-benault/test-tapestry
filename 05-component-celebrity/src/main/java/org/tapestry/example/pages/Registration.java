package org.tapestry.example.pages;

import org.apache.tapestry5.EventConstants;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.tapestry.example.model.security.Gender;

public class Registration {
	
	private static final String RESET ="RESET";
	private static final String SUBMIT="SUBMIT";
			
	
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
	
	private String action;
	
	
	public Gender getMale() {
		return Gender.MALE;
	}
	
	public Gender getFemale() {
		return Gender.FEMALE;
	}
	
	@OnEvent(component = "submitButton", value = EventConstants.SELECTED)
	void submitButtonClicked() {
		System.out.println("submit button clicked...");
	    action = SUBMIT;
	}
	
	@OnEvent(component = "resetButton", value = EventConstants.SELECTED)
	void resetButtonClicked() {
		System.out.println("reset button clicked...");
	    action = RESET;
	}
	
	@OnEvent(component="registrationForm" ,value = EventConstants.SUCCESS)
	public void success() {

		System.out.println("The form has been successed with action "+action);
	}
	
	@OnEvent(component="registrationForm", value=EventConstants.SUBMIT)
	public void onSubmitButton() {
		System.out.println("The form has been submitted with action "+action);
		
		if(unsubscribe) subscribe = false;
		
		if(SUBMIT.equals(action)) {
			System.out.println("submit...");
		} else if(RESET.equals(action)) { 
			System.out.println("clear data...");
			userName = null;
			password = null;
			gender = null;
			email = null;
			
			
		} else {
			System.out.println("subscribe/ unsubscribe...");
		}
	}
	


}
