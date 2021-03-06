package org.tapestry.example.pages;

import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.tapestry.example.model.dto.Celebrity;

@Import(stylesheet="context:css/style.css")
public class AddCelebrity {
	
	@Property
	@Persist
	private Celebrity celebrity;

}
