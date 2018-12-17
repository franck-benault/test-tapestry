package org.tapestry.example.pages;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SetupRender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tapestry.example.sources.MyBean;
import org.tapestry.example.sources.Sex;

public class Index {

	private static Logger logger = LoggerFactory.getLogger(Index.class);


	@Property
	List<MyBean> list;
	
	
	@SetupRender
	public void setupRender() {
		
		list = new ArrayList<MyBean>();
		list.add(new MyBean("Alex", "Snow", new Date(), 25, Sex.MALE));
		list.add(new MyBean("Alice", "Snow", new Date(), 35, Sex.FEMALE));
		list.add(new MyBean("Bob", "Croww", new Date(), 45, Sex.MALE));
		
	}



}
