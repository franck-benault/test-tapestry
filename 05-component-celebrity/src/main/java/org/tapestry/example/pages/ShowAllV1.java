package org.tapestry.example.pages;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.Service;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tapestry.example.model.dto.Celebrity;
import org.tapestry.example.model.management.IDataSource;
import org.tapestry.example.model.management.impl.MockDataSource;
import org.tapestry.example.model.security.User;

public class ShowAllV1 {
	
	private static Logger logger = LoggerFactory.getLogger(ShowAllV1.class);
	
	@SessionState(create=false)
	private User user;
	
	@InjectPage
	private Details detailPage;
	
	//property create getter and setter
	@Property
	private Celebrity celebrity;
	
	
	@Inject
	IDataSource dataSource;

	public User getUser() {
		return user;
	}

	Object onActivate() {
		if(user==null) {
			return Index.class;
		}
		logger.info("user ={}", user);
		return null;
	}
	
	public List<Celebrity> getAllCelebrities() {
		return dataSource.getAllCelebrities();
	}
	
	public Format getDateFormat() {
		return new SimpleDateFormat("yyyy-MM-dd");
	}
	
	@OnEvent(component="detailsLink")
	Object onShowDetails(long id) {
		logger.info("onShowDetails with id {}", id);
		IDataSource dataSource = new MockDataSource();
		Celebrity celebrity = dataSource.getCelebrityById(id);
		detailPage.setCelebrity(celebrity);
		
		return detailPage;
	}

}
