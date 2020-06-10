package com.userRegistrationJWT.service;

import java.util.List;
import java.util.Optional;

import com.userRegistrationJWT.dto.UserDTO;
import com.userRegistrationJWT.model.User;

public interface UserService {
	Boolean createUser(User user);
	List<User> listAllUsers();
	Optional<User> getByUsername(String userName);
	Boolean saveOrUpdateUserById(UserDTO userDTO);
	Boolean deleteUserById(String userId);
}
