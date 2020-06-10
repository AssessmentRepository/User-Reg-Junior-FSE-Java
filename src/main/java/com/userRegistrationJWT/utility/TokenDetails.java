package com.userRegistrationJWT.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.userRegistrationJWT.exception.BadRequestException;
import com.userRegistrationJWT.model.User;
import com.userRegistrationJWT.security.JWTUtil;

@Component
public class TokenDetails {

	@Autowired
	private JWTUtil jwtUtil;

	public void validateUser(String token, String role) {
		User user = jwtUtil.parseToken(token);
		if (!user.getRoles().get(0).getRole().name().equals(role)) {
			throw new BadRequestException("Un Authorized Role to do actions");
		}
	}

	public String getUserName(String token) {
		User user = jwtUtil.parseToken(token);
		return user.getUserName();
	}
}
