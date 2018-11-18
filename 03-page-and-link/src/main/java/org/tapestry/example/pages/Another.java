package org.tapestry.example.pages;

import org.apache.tapestry5.annotations.Persist;

public class Another {
	
	@Persist
	private String passedMessage;

	public String getPassedMessage() {
		return passedMessage;
	}

	public void setPassedMessage(String passedMessage) {
		this.passedMessage = passedMessage;
	}

	
}
