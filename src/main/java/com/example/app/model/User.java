package com.example.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User
{

	@Id
	private Integer userId ;
	
	private String userName ;
	
	private String userPassword ;
	
	private String authority ;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public User(Integer userId, String userName, String userPassword, String authority) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.authority = authority;
	}
	
	
	
	
}
