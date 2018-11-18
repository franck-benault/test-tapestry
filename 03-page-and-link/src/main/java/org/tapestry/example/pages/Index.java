package org.tapestry.example.pages;


import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.OnEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Index {
	
	@InjectPage
	private Another another;
	
	private String message = "initial value";
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private static Logger logger = LoggerFactory.getLogger(Index.class);
	
	@OnEvent(value="Submit", component="userInputForm")
	public Object onFormSubmit() {
		logger.info("onSubmit with message = {}", message);
		another.setPassedMessage(message);
		return another;
	}
	


}
