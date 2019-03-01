package integration.com.ibapp;

import com.ibapp.domain.model.User;
import com.ibapp.service.services.InMemoryUserService;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class InMemoryUserIntegrationTest {

    private InMemoryUserService inMemoryUserService = new InMemoryUserService();


    @Test
    public void createUser(){

        ensureNoUsersExist();

        User user = new User(1L, "Tom", 10, LocalDateTime.now());


        assertThat(inMemoryUserService.create(user),is(1L));
    }

    @Test
    public void findUser(){

        ensureNoUsersExist();

        User user = new User(1L, "Tom", 10, LocalDateTime.now());

        inMemoryUserService.create(user);

        assertThat(inMemoryUserService.find(1L).get().getName(),is((user.getName())));

    }

    @Test
    public void findUsers() {

        ensureNoUsersExist();

        User user1 = new User(1L, "Tom", 10, LocalDateTime.now());
        User user2 = new User(2L, "Tom2", 11, LocalDateTime.now());


        inMemoryUserService.create(user1);
        inMemoryUserService.create(user2);

        assertThat(inMemoryUserService.getALL().size(), is(2));

    }

    public void ensureNoUsersExist(){

        inMemoryUserService.deleteAll();
    }
}
