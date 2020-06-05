package com.userRegistrationJWT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.userRegistrationJWT.model.User;
import com.userRegistrationJWT.service.UserService;

@RestController
public class AdminController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> listAllUsers() {
		return null;
	}

	@DeleteMapping("/deluser/{id}")
	public ResponseEntity<HttpStatus> deleteUserById(@PathVariable("id") int id) {
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
}