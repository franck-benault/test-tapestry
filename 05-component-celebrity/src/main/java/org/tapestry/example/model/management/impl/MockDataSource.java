package org.tapestry.example.model.management.impl;

import java.util.ArrayList;
import java.util.List;

import org.tapestry.example.model.dto.Celebrity;
import org.tapestry.example.model.dto.Occupation;
import org.tapestry.example.model.management.IDataSource;

public class MockDataSource implements IDataSource {
	
	private List<Celebrity> celebrities = new ArrayList<>();
	
	public MockDataSource() {
		addCelebrity(new Celebrity("John", "Snow", Occupation.ACTOR));
		addCelebrity(new Celebrity("John", "Lenon", Occupation.SINGER));
		addCelebrity(new Celebrity("Patty", "Smith", Occupation.SINGER));
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