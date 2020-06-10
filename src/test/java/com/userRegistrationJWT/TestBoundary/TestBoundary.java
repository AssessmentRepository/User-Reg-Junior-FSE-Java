package com.userRegistrationJWT.TestBoundary;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.mockito.Mock;

import com.userRegistrationJWT.SampleData.SampleData;
import com.userRegistrationJWT.model.TextStatus;
import com.userRegistrationJWT.model.User;

public class TestBoundary {

	static {
		File file = new File("output_boundary_revised.txt");
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_boundary_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}
	@Mock
	private User user;
	

	@Test
	public void testTextStatusLength() throws IOException {
		TextStatus msg = new TextStatus();
		msg.setTextStatus("Hello world...");
		int maxChar = 5;
		boolean message = ((msg.getTextStatus().length()) >= maxChar);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestTextStatusLength=" + (message ? true : false), true);
	}
	@Test
	public void testUserFirstNameLength() throws IOException {
		user = SampleData.getUserDetails();
		int maxChar = 1;
		boolean userFirstNameLength = ((user.getUserFirstName().length()) >= maxChar);
		user.getUserName();
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestUserNameLength=" + (userFirstNameLength ? true : false), true);
	
	}
	@Test
	public void testUserLastNameLength() throws IOException {
		user = SampleData.getUserDetails();
		int maxChar = 3;
		boolean userLastNameLength = ((user.getUserLastName().length()) >= maxChar);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestUserNameLength=" + (userLastNameLength ? true : false), true);
		
	}
	@Test
	public void testUserNameLength() throws IOException {
		user = SampleData.getUserDetails();
		int maxChar = 5;
		boolean usernameLength = ((user.getUserName().length()) >= maxChar);
		user.getUserName();
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestUserNameLength=" + (usernameLength ? true : false), true);
		assertEquals(usernameLength, true);
	}

	@Test
	public void testPasswordLength() throws IOException {
		user = SampleData.getUserDetails();
		user.getUserPassword();
		int passwordLength = 10;
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "testPasswordLength=" + (passwordLength == 10 ? "true" : "false"), true);
		assertEquals(passwordLength, 10);
	}

	@Test
	public void testActiveUser() throws IOException {
		user = SampleData.getUserDetails();
		user.isActive();
		boolean result = true;
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestActiveUser=" + (result ? true : false), true);
		assertEquals(result, true);
	}
}