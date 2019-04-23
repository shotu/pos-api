package com.target.posapi.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.target.posapi.models.Test;
import com.target.posapi.repository.TestRepository;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/pos/api/tests")
public class TestsResources {
    private TestRepository testRespository;

    @PostMapping
    @JsonCreator
    public void insert(@RequestBody Test test){
        this.testRespository.insert(test);
    }
}
