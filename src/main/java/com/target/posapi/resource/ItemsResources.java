package com.target.posapi.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.target.posapi.models.Item;
import com.target.posapi.repository.ItemRespository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pos/api/items")
public class ItemsResources {

    private ItemRespository itemRespository;

    public ItemsResources(ItemRespository itemRespository){
        this.itemRespository = itemRespository;
    }

    @GetMapping("/all")
    public List<Item> getAll(){
        return itemRespository.findAll();
    }

    @PostMapping
    @JsonCreator
    public void insert(@RequestBody Item item){
        this.itemRespository.insert(item);

    }

    @PutMapping
    @JsonCreator
    public void update(@RequestBody Item item){
        this.itemRespository.save(item);
    }

    @DeleteMapping
    public  void delete(@PathVariable("id") String id){
        this.delete(id);
    }

}
