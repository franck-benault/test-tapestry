package org.tapestry.example.pages;


import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.corelib.components.PageLink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Index {
	
	
	@Component(parameters= {"page=ShowAll"})
	private PageLink linkToShowAll;
	

	private static Logger logger = LoggerFactory.getLogger(Index.class);
	

	


}
