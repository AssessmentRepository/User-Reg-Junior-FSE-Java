package com.userRegistrationJWT.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.userRegistrationJWT.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	User findByUserEmail(String userEmail);
}
