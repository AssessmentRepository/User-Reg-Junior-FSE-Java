package com.userRegistrationJWT.TestFunctional;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.userRegistrationJWT.SampleData.SampleData;
import com.userRegistrationJWT.model.TextStatus;
import com.userRegistrationJWT.model.User;
import com.userRegistrationJWT.repo.TextStatusRepository;
import com.userRegistrationJWT.repo.UserRepository;
import com.userRegistrationJWT.service.TextStatusServiceImpl;
import com.userRegistrationJWT.service.UserServiceImpl;

import lombok.val;

public class TestFunctional {

	static {
		File file = new File("output_revised.txt");
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}
	
	@Mock
	private UserRepository userRepository;
	
	@Mock
	private User user;

	@InjectMocks
	private UserServiceImpl userServiceImpl;
	
	@Mock
	private TextStatusRepository useStatusrRepository;
	
	@Mock
	private  TextStatus textStatus;
	
	@InjectMocks
	private  TextStatusServiceImpl textStatusServiceImpl;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testSaveUsers() throws Exception {
		Boolean value = userServiceImpl.createUser(SampleData.getUserDetails());
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestSaveUsers="+(value?true:false), true); 
	}
	@Test
	public void testSaveTextStatus() throws Exception {
		Boolean value = textStatusServiceImpl.createMessage(new TextStatus("1","Hello World"));
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestSaveTextStatus="+(value?true:false), true); 
	}

	@Test
	public void testGetTextStatus() throws Exception {	
		TextStatus msg = new TextStatus();
		msg.setUserId("1");
		msg.setTextStatus("Hello World...");
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestGetTextStatus="+(msg.getTextStatus()==null?true:false), true); 
		
	}
	@Test
	public void testGetUser() throws Exception {	
		Optional<User> getval = userServiceImpl.getByUsername(SampleData.getUserDetails().getUserName());
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestGetUser="+(getval==null?true:false), true); 
	    
	}

	@Test
	public void testViewAllUsers() throws Exception {		
		List<User> list = new ArrayList<>();
		list.add(new User());
		list.add(new User());	    
		List<User> userList = userServiceImpl.listAllUsers();
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestViewAllUsers="+(userList==list?true:false), true); 
	}
	
	@Test
	public void testDeleteUserById() throws Exception {
		Boolean value = userServiceImpl.deleteUserById(SampleData.getUserDetails().getUserId());
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestDeleteUserById="+(value?true:false), true); 
	}
	@Test
	public void testDeleteTextStatus() throws Exception {
		Boolean value = textStatusServiceImpl.deleteMessageById(SampleData.getTextDetails().getUserId());
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestDeleteUserById="+(value?true:false), true); 
	}
}
