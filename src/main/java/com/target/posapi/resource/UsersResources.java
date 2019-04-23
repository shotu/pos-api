package com.target.posapi.resource;


import com.target.posapi.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import com.target.posapi.models.User;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/pos/api/users")
public class UsersResources {

    private UserRepository userRepository;

    public UsersResources(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @DeleteMapping
    public void delete(@PathVariable("id") Integer id){
        this.delete(id);
    }

}
