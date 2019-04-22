package com.target.posapi.config;

import com.target.posapi.repository.UserRespository;
import com.target.posapi.models.User;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRespository.class)
@Configuration
public class MongoDBConfig{
    @Bean
    CommandLineRunner commandLineRunner(UserRespository userRespository){

        return strings -> {
            userRespository.save(new User(1,"Manish", "manish@gmail.com", "mypass","ADMIN"));
                    userRespository.save(new User(2,"Manish", "manish@gmail.com", "mypass","MANAGER"));
        };

    };
}
