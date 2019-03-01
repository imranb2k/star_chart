package com.ibapp.service.services;

import com.ibapp.domain.model.User;
import com.ibapp.service.persistance.UserDAO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class InMemoryUserService implements UserDAO {

    private static List<User> userStore = new ArrayList();

    @Override
    public Long create(User user) {

        userStore.add(user);

        return user.getId();

    }

    @Override
    public Optional<User> find(Long id) {

       return userStore.stream()
               .filter(user -> user.getId().equals(id))
               .findFirst();

      /*for (User user: userStore) {

          if(user.getId() == id) {
              return user;
          }
*/
      }

    @Override
    public List<User> getALL() {
        return userStore;
    }

    @Override
    public Boolean deleteAll() {
        userStore.clear();

        return true;
    };


    @Override
    public void update(User user) {

    }

    @Override
    public void remove(User user) {

    }
}
