package com.target.posapi.resource;


import com.target.posapi.repository.UserRespository;
import org.springframework.web.bind.annotation.*;
import com.target.posapi.models.User;
import java.util.List;

@RestController
@RequestMapping("/pos/api/users")
public class UsersResources {

    private UserRespository userRespository;

    public UsersResources(UserRespository userRespository){
        this.userRespository = userRespository;
    }

    @GetMapping("/all")
    public List<User> getAll(){
        return userRespository.findAll();
    }

    @DeleteMapping
    public void delete(@PathVariable("id") Integer id){
        this.delete(id);
    }

}
