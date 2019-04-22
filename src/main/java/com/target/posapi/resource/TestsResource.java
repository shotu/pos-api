package com.target.posapi.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.target.posapi.document.Test;
import com.target.posapi.repository.TestRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pos/api/tests")
public class TestsResource {
    private TestRepository testRespository;

    @PostMapping
    @JsonCreator
    public void insert(@RequestBody Test test){
        this.testRespository.insert(test);
    }
}
