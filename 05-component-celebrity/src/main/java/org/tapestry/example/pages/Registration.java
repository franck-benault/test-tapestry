package org.tapestry.example.pages;

import java.util.Date;

import org.apache.tapestry5.EventConstants;
import org.apache.tapestry5.SelectModel;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.Request;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.apache.tapestry5.util.EnumSelectModel;
import org.tapestry.example.model.dto.Country;
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
	
	@Persist
	@Property
	private Date dateOfBirth;
	
	@Persist
	@Property
	private String email;
	
	@Persist
	@Property
	private boolean subscribe;
	
	@Property
	private boolean unsubscribe;
	
	@Persist
	@Property
	private Country country;
	
	@Inject
	private Messages messages;
	
	public SelectModel getCountries() {
		
		return new EnumSelectModel(Country.class, messages);
	}
	
	
	private String action;
	
	
	public Gender getMale() {
		return Gender.MALE;
	}
	
	public Gender getFemale() {
		return Gender.FEMALE;
	}
	
	@InjectComponent
	private Zone countryModelZone;
	
	
	@OnEvent(component = "submitButton", value = EventConstants.SELECTED)
	public void submitButtonClicked() {
		System.out.println("submit button clicked...");
	    action = SUBMIT;
	}
	
	@OnEvent(component = "resetButton", value = EventConstants.SELECTED)
	public void resetButtonClicked() {
		System.out.println("reset button clicked...");
	    action = RESET;
	}
	
	
	
	@OnEvent(component="registrationForm" ,value = EventConstants.PREPARE)
	public void formPrepare() {

		System.out.println("The form has been prepared with action "+action);
	}
	
	@OnEvent(component="registrationForm" ,value = EventConstants.VALIDATE)
	public void formValidate() {

		System.out.println("The form has been validated with action "+action);
	}
	
	
	@OnEvent(component="registrationForm" ,value = EventConstants.SUCCESS)
	public void formSuccess() {

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
			country = null;
			
			
		} else {
			System.out.println("subscribe/ unsubscribe...");
		}
	}
	


}
