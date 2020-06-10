package com.userRegistrationJWT.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.userRegistrationJWT.model.TextStatus;
@Repository
public interface TextStatusRepository extends MongoRepository<TextStatus, String> {

}
