package org.tapestry.example.pages;

import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.Retain;
import org.apache.tapestry5.beaneditor.BeanModel;
import org.apache.tapestry5.corelib.components.BeanEditForm;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.BeanModelSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tapestry.example.sources.MyBean;

public class Index {

	private static Logger logger = LoggerFactory.getLogger(Index.class);

	@Inject
	private BeanModelSource beanModelSource;

	@Inject
	private ComponentResources resources;

	//@Property(write = false)
	//private BeanModel model;
	
	@InjectComponent("personForm")
    private BeanEditForm form;

	@Property
	private MyBean bean;



}
