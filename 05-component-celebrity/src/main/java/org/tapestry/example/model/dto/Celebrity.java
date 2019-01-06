package org.tapestry.example.model.dto;

import java.util.Date;

public class Celebrity {
	

	

	
	private long id;
	private String firstName;
	private String lastName;
	private Occupation occupation;
	private Date dateOfBirth;
	private String biography;
	private boolean birthDateVerified;
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Occupation getOccupation() {
		return occupation;
	}
	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}
	
	@Override
	public String toString() {
		return "Celebrity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", occupation="
				+ occupation + ", dateOfBirth=" + dateOfBirth + "]";
	}
	/*public Celebrity(String firstName, String lastName, Occupation occupation, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.occupation = occupation;
		this.dateOfBirth = dateOfBirth;
	}*/
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public boolean isBirthDateVerified() {
		return birthDateVerified;
	}
	public void setBirthDateVerified(boolean birthDateVerified) {
		this.birthDateVerified = birthDateVerified;
	}
	

	

	


	
}
