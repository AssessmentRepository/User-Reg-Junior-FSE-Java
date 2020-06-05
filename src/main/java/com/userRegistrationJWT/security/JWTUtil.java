package com.userRegistrationJWT.security;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.userRegistrationJWT.model.Role;
import com.userRegistrationJWT.model.User;
import com.userRegistrationJWT.model.UserRole;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;


@Configuration
public class JWTUtil {
	
	@Value("${demo.security.jwt.tokenSigningKey}")
    private String secret;


	 public User parseToken(String token) {
	        try {
	              String str = StringUtils.replace(token, "Bearer:", "");
	            Claims body = Jwts.parser()
	                    .setSigningKey(secret)
	                    .parseClaimsJws(str)
	                    .getBody();

	            User u = new User();
	            u.setUserName(body.getSubject());
	            @SuppressWarnings("unchecked")
				List<String> roles = (List<String>) body.get("scopes");
	            String str1 = StringUtils.replace(roles.get(0), "ROLE_", ""); 
	            List<UserRole> rolesList = new ArrayList<>();
	            UserRole role = new  UserRole();
	            role.setRole(Role.valueOf(str1));
	            rolesList.add(role);
	            u.setRoles(rolesList);

	            return u;

	        } catch (JwtException | ClassCastException e) {
	            return null;
	        }
}


}