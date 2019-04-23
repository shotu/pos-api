package com.target.posapi.config;

import com.target.posapi.repository.UserRepository;
import com.target.posapi.models.User;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig{
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){

        return strings -> {
            userRepository.save(new User(1,"Manish", "manish@gmail.com", "mypass","ADMIN"));
            userRepository.save(new User(2,"Manish", "manish@gmail.com", "mypass","MANAGER"));
        };

    };
}
