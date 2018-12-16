package org.tapestry.example.components;

import org.apache.tapestry5.annotations.Parameter;

public class MyComponent {
	
	@Parameter
	private String name;
	
	
	public String getHello() {
		return "Hello "+name+ " !";
	}

}
