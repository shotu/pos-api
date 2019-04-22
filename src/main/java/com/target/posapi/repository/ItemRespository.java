package com.target.posapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.target.posapi.document.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRespository extends MongoRepository<Item, String> {

}
