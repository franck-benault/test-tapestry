package org.tapestry.example.model.management;

import java.util.List;

import org.tapestry.example.model.dto.Celebrity;

public interface IDataSource {
	
	public List<Celebrity> getAllCelebries();
	public Celebrity getCelebrityById(long id);
	public void addCelebrity(Celebrity c);

}
