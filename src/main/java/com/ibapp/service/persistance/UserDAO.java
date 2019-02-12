package com.ibapp.service.persistance;

import com.ibapp.domain.model.User;

import java.util.List;

public interface UserDAO {

    Long create(User user);

    User findBy(Long id);

    List<User> findALL();

    void update(User user);

    void remove(User user);


}
