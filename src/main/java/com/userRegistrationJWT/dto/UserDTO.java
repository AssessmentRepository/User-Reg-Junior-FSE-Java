package com.userRegistrationJWT.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value = "User")
public class UserDTO {
	@Id
	private int userId;

	private String userFirstName;

	private String userLastName;

	private String userName;
	
	private String userEmail;

	private String userPassword;

	private String profilePicture;

	private boolean active = true;
}