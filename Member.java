package com.yash.stringdemo.labassignments;

public class Member {

	public String firstName;
	public String lastName;
	public String email;
	public String password;
	public String role;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	String fullName = firstName.concat(" "+lastName);
	
	public String showMemberDetail()
	{
		String member = "{name: "+fullName+", email: "+email+", password: "+password+", role: "+role+"}";
		return member;
	}
	
	
}
