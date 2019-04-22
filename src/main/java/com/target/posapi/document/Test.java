package com.target.posapi.document;

import org.springframework.data.annotation.Id;

public class Test {

    @Id
    private String id;
    private String name;

    public Test(){
        super();
    }

    public Test(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
