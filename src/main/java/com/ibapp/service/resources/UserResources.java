package com.ibapp.service.resources;

import com.ibapp.domain.model.User;
import com.ibapp.service.services.InMemoryUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResources {

    private InMemoryUserService inMemoryUserService;

    public UserResources(){

    };

    @Autowired
    public UserResources(InMemoryUserService inMemoryUserService) {

        this.inMemoryUserService = inMemoryUserService;

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long CreateUser(@RequestBody User user){

        return inMemoryUserService.create(user);

    }


}
