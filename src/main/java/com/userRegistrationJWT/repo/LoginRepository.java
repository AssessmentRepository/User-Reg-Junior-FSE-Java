package com.userRegistrationJWT.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.userRegistrationJWT.model.User;

public interface LoginRepository extends MongoRepository<User, String>  {
}
