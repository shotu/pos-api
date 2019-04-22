package com.target.posapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.target.posapi.models.Test;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends MongoRepository <Test, String >{

}

