package com.ibapp.service.services;

import com.ibapp.domain.model.User;
import com.ibapp.service.persistance.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){

        List users = new ArrayList();

        userRepository.findAll()
                .forEach(users::add);

        return users;
    }

    public Optional<User> getUser(Long id) {

        return userRepository.findById(id);
    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    public void updateUser( User user) {

        userRepository.save(user);
    }

    public void deleteUser(Long id) {

        userRepository.deleteById(id);
    }

}
