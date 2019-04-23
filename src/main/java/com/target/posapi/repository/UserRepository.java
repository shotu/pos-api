package com.target.posapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.target.posapi.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
