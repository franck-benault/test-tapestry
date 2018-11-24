package org.tapestry.example.pages.user;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.PageLink;

public class Form1 {
	
	@Component(parameters= {"page=Index"})
	private PageLink linkToIndex;


	@Property
	private String username;
	
	
	
}
