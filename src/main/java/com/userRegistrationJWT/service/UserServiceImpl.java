package com.userRegistrationJWT.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userRegistrationJWT.model.User;
import com.userRegistrationJWT.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired(required = true)
	private UserRepository userRepository;

	@Override
	public Boolean createUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean saveOrUpdateUserById(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean deleteUserById(String userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<User> getByUsername(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
