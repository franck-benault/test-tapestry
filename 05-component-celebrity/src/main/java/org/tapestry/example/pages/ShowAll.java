package org.tapestry.example.pages;

import java.util.List;

import org.apache.tapestry5.annotations.SessionState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tapestry.example.model.dto.Celebrity;
import org.tapestry.example.model.management.IDataSource;
import org.tapestry.example.model.management.impl.MockDataSource;
import org.tapestry.example.model.security.User;

public class ShowAll {
	
	private static Logger logger = LoggerFactory.getLogger(ShowAll.class);
	
	@SessionState(create=false)
	private User user;
	private Celebrity celebrity;
	
	public Celebrity getCelebrity() {
		return celebrity;
	}

	public void setCelebrity(Celebrity celebrity) {
		this.celebrity = celebrity;
	}

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
		IDataSource dataSource = new MockDataSource();
		return dataSource.getAllCelebries();
	}

}
