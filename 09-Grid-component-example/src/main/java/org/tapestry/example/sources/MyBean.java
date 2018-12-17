package org.tapestry.example.sources;

import java.util.Date;

public class MyBean {
	
	public String firstName;
	public String lastName;
	public Date birthDate;
	public long age;
	
	public Sex sex;

	public MyBean(String firstName, String lastName, Date birthDate, long age, Sex sex) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.age = age;
		this.sex = sex;
	}
	
	
}
