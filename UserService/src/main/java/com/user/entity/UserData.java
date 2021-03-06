package com.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Tbl")
public class UserData {

	@Id
	private int id;
	private String userName;
	private String password;
	private String actorType;
	private String firstName;
	private String middleName;
	private String lastName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getActorType() {
		return actorType;
	}
	public void setActorType(String actorType) {
		this.actorType = actorType;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "UserData [id=" + id + ", userName=" + userName + ", password=" + password + ", actorType=" + actorType
				+ ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}
}
