package org.tapestry.example.model.dto;

public class Celebrity {
	
	private long id;
	private String firstName;
	private String lastName;
	private Occupation occupation;
	
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
				+ occupation + "]";
	}
	public Celebrity(String firstName, String lastName, Occupation occupation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.occupation = occupation;
	}
	


	
}
