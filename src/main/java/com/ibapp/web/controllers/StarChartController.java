package com.ibapp.web.controllers;

import com.ibapp.domain.model.User;
import com.ibapp.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StarChartController {

    @Autowired
    private UserService userService;


    @GetMapping("/star")
    public String home(){
        return "Stat Chart";

    }

    @GetMapping("/users")
    public List<User> users() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @PutMapping("/users/{id}")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
