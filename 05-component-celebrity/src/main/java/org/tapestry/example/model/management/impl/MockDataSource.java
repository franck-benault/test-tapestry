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
		addCelebrity(createCelebrity("John", "Snow", Occupation.ACTOR, new Date()));
		addCelebrity(createCelebrity("John", "Lenon", Occupation.SINGER, new Date()));
		addCelebrity(createCelebrity("Patty", "Smith", Occupation.SINGER, new Date()));
		addCelebrity(createCelebrity("Pattou", "Smouth", Occupation.ARTIST, new Date()));
		addCelebrity(createCelebrity("Pattoune", "Smouthy", Occupation.ARTIST, new Date()));
	}
	
	private Celebrity createCelebrity(String firstName,
			String lastName, Occupation occupation, Date dateOfBirth) {
		
		Celebrity celebrity = new Celebrity();
		celebrity.setFirstName(firstName);
		celebrity.setLastName(lastName);		
		celebrity.setOccupation(occupation);
		celebrity.setDateOfBirth(dateOfBirth);
		return celebrity;
				
		
	}

	@Override
	public List<Celebrity> getAllCelebrities() {
		System.out.println("getAllCelebrities() ...");
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

	@Override
	public List<Celebrity> getRange(int startIndex, int endIndex) {
		List<Celebrity> result = new ArrayList<>();
		for(int i = startIndex; i<=endIndex; i++) {
			result.add(celebrities.get(i));
		}
		
		return result;
	}

}
