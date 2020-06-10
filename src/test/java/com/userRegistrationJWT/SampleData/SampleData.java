package com.userRegistrationJWT.SampleData;

import com.userRegistrationJWT.model.TextStatus;
import com.userRegistrationJWT.model.User;

public class SampleData {
	public static User getUserDetails() {
		User user = new User();
		user.setUserId("1");
		user.setUserFirstName("Besta");
		user.setUserLastName("Shashidhar");
		user.setUserName("B Shashidhar");
		user.setUserEmail("shashi@gmail.com");
		user.setUserPassword("123456789");
		user.setProfilePicture("google.com");
		user.isActive();
		return user;
	}
	
	public static User getUpdatedUserDetails() {
		User user = new User();
		user.setUserId("1");
		user.setUserFirstName("Besta");
		user.setUserLastName("Shashidhar");
		user.setUserName("B Shashidhar");
		user.setUserEmail("shashi@gmail.com");
		user.setUserPassword("123456789");
		user.setProfilePicture("google.com");
		user.isActive();
		return user;
	}

	public static TextStatus getTextDetails() {
		TextStatus msg = new TextStatus();
		msg.setUserId("1");
		msg.setTextStatus("Hello world...");
		return msg;
	}

}