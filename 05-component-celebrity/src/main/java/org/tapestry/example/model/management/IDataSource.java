package org.tapestry.example.model.management;

import java.util.List;

import org.tapestry.example.model.dto.Celebrity;

public interface IDataSource {
	
	List<Celebrity> getAllCelebrities();
	Celebrity getCelebrityById(long id);
	void addCelebrity(Celebrity c);
	List<Celebrity> getRange(int startIndex, int endIndex); 

}
