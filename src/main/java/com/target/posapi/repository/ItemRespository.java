package com.target.posapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.target.posapi.models.Item;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ItemRespository extends MongoRepository<Item, String> {
    //  public List<Item> searchByName(String name);
    List<Item> findByNameRegex(String name);
}
