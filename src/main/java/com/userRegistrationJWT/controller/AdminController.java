package com.userRegistrationJWT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.userRegistrationJWT.dto.Role;
import com.userRegistrationJWT.service.UserService;
import com.userRegistrationJWT.utility.TokenDetails;

@RestController("/admin")
public class AdminController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TokenDetails tokenDetails;
	
	@GetMapping("/hi")
	public String HelloWorld() {
		return "Admin Controller...";
	}
	
	@GetMapping("/users")
	public ResponseEntity<?> listAllUsers(@RequestHeader("Authorization") String token) {
		tokenDetails.validateUser(token, Role.Admin.toString());
		return new ResponseEntity<>(userService.listAllUsers(), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUser")
	public ResponseEntity<String> deleteUser(@RequestHeader("Authorization") String token,
			@RequestParam String userId) {
		tokenDetails.validateUser(token, Role.Admin.toString());
		userService.deleteUserById(userId);
		return new ResponseEntity<>("successfully deleted", HttpStatus.OK);
	}
}
