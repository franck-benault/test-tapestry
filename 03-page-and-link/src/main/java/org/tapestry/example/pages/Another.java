package org.tapestry.example.pages;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.corelib.components.PageLink;

public class Another {
	
	@Component(parameters= {"page=Index"})
	private PageLink linkToIndex;
	
	@Persist
	private String passedMessage;

	public String getPassedMessage() {
		return passedMessage;
	}

	public void setPassedMessage(String passedMessage) {
		this.passedMessage = passedMessage;
	}

	
}
