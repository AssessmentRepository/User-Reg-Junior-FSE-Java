package com.userRegistrationJWT.TestException;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.userRegistrationJWT.exception.UserAlreadyExistException;
import com.userRegistrationJWT.exception.UserDoesNotExistException;
import com.userRegistrationJWT.model.User;
import com.userRegistrationJWT.service.LoginServiceImpl;

public class TestException {

	static {
		File file = new File("output_exception_revised.txt");
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_exception_revised.txt"));
			} catch (IOException e) {
				// e.printStackTrace();
			}
		}
	}

	@InjectMocks
	private LoginServiceImpl loginServiceImpl;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test(expected = UserAlreadyExistException.class)
	public void testForUserSignUp() throws Exception {
		try {
			User user = new User();
			user.setUserId("1");
			user.setUserFirstName("Besta");
			user.setUserLastName("Shashidhar");
			user.setUserName("B Shashidhar");
			user.setUserEmail("shashi.2346@gmail.com");
			user.setUserPassword("1234567890");
			user.setProfilePicture("www.google.com");
			user.setActive(true);
			loginServiceImpl.register(user);
		} catch (UserAlreadyExistException e) {
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "\ntestForUserSignUp=true", true);
			throw e;
		} catch (Exception e) {
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "\ntestForUserSignUp=false", true);
			throw e;
		}
		File file = new File("output_exception_revised.txt");
		FileUtils.write(file, "\ntestForUserSignUp=false", true);
	}

	@Test(expected = UserDoesNotExistException.class)
	public void testForUserLogin() throws Exception {
		try {
			User user = new User();
			user.setUserName("admin");
			user.setUserPassword("james");
			loginServiceImpl.login(user.getUserName(), user.getUserPassword());
		} catch (UserDoesNotExistException e) {
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "\ntestForUserLogin=true", true);
			throw e;
		} catch (Exception e) {
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "\ntestForUserLogin=false", true);
			throw e;
		}
		File file = new File("output_exception_revised.txt");
		FileUtils.write(file, "\ntestForUserLogin=false", true);

	}
}
