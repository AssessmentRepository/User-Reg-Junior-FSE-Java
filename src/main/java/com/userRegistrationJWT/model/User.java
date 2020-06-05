package com.userRegistrationJWT.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Document(value = "User")
@Data
public class User {
	
	@Id
	private String userId;

	private String userFirstName;

	private String userLastName;

	private String userName;
	
	private String userEmail;
	
	private String userPassword;

	private String profilePicture;
	
	private List<UserRole> roles;

	private boolean active = true;
	
	private String textStatus;

	public User() {
		
	}

	public User(String userId, String userName, String userPassword, List<UserRole> roles) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.roles = roles;
	}
	
}