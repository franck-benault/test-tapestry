package org.tapestry.example.model.management.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.tapestry.example.model.dto.Celebrity;
import org.tapestry.example.model.dto.Occupation;
import org.tapestry.example.model.management.IDataSource;

public class MockDataSource implements IDataSource {
	
	private List<Celebrity> celebrities = new ArrayList<>();
	
	public MockDataSource() {
		addCelebrity(new Celebrity("John", "Snow", Occupation.ACTOR, new Date()));
		addCelebrity(new Celebrity("John", "Lenon", Occupation.SINGER, new Date()));
		addCelebrity(new Celebrity("Patty", "Smith", Occupation.SINGER, new Date()));
		addCelebrity(new Celebrity("Pattou", "Smouth", Occupation.ACTIST, new Date()));
		addCelebrity(new Celebrity("Pattoune", "Smouthy", Occupation.ACTIST, new Date()));
	}

	@Override
	public List<Celebrity> getAllCelebries() {
		return celebrities;
	}

	@Override
	public Celebrity getCelebrityById(long id) {
		
		for(Celebrity c : celebrities) {
			if(c.getId()==id)
				return c;
		}
		return null;
	}

	@Override
	public void addCelebrity(Celebrity c) {

		long newId = celebrities.size();
		c.setId(newId);
		celebrities.add(c);
		
	}

}
