package com.ibapp.service.persistance;

import com.ibapp.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDAO {

    Long create(User user);

    Optional<User> find(Long id);

    List<User> getALL();

    void update(User user);

    void remove(User user);

    Boolean deleteAll();


}
