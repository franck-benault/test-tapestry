package org.tapestry.example.pages;

import java.text.Format;
import java.text.SimpleDateFormat;

import org.apache.tapestry5.annotations.Persist;
import org.tapestry.example.model.dto.Celebrity;

public class Details {

	@Persist
	private Celebrity celebrity;

	public Celebrity getCelebrity() {
		return celebrity;
	}

	public void setCelebrity(Celebrity celebrity) {
		this.celebrity = celebrity;
	}
	
	public Format getDateFormat() {
		return new SimpleDateFormat("yyyy-MM-dd");
	}
}
