package com.userRegistrationJWT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.userRegistrationJWT.dto.Role;
import com.userRegistrationJWT.dto.UserDTO;
import com.userRegistrationJWT.model.User;
import com.userRegistrationJWT.service.UserService;
import com.userRegistrationJWT.utility.TokenDetails;

@RestController("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TokenDetails tokenDetails;

	@GetMapping("/hello")
	public String HelloWorld() {
		return "User Controller...";
	}
	
	@PostMapping(value="/signUp")
	public ResponseEntity<String> saveUserDetails(@RequestBody User user) {
		return new ResponseEntity<>("success",HttpStatus.OK);
	}

	@GetMapping("/getUser")
	public ResponseEntity<String> getUserById(@RequestHeader("Authorization") String token,
			@RequestParam String userName) {
		tokenDetails.validateUser(token, Role.User.toString());
		return new ResponseEntity<>("success", HttpStatus.OK);
	}

	@PutMapping("/updateUser")
	public ResponseEntity<String> updateUserById(@RequestHeader("Authorization") String token,
			@RequestParam UserDTO userDTO) {
		tokenDetails.validateUser(token, Role.User.toString());
		userService.saveOrUpdateUserById(userDTO);
		return new ResponseEntity<>("successfully added", HttpStatus.OK);
	}
}
