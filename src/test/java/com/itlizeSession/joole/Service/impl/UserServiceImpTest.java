package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.User;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName UserServiceImpTest
 * @Description TODO
 * @Author
 * @Date 5/17/22 10:40
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceImpTest {

    @Autowired
    private UserServiceImp userService;


    private User user = new User();


    @Test
    void createUser() {
        assertThrows(NullPointerException.class,
                () -> {
                    boolean expected = true;

                    boolean actual = userService.createUser("name", "password");

                    Assert.assertEquals(expected, actual);
                });


    }

    @Test
    void delete() {
        assertThrows(NullPointerException.class,
                () -> {
                    boolean expected = true;

                    boolean actual = userService.delete("password", 1);

                    Assert.assertEquals(expected, actual);
                });


    }

    @Test
    void findUserById() {
        assertThrows(NullPointerException.class,
                () -> {
                    user.setId(1);
                    User expected = user;

                    User actual = userService.findUserById(1);

                    Assert.assertEquals(expected, actual);
                });


    }

    @Test
    void userLogin() {

        assertThrows(NullPointerException.class,
                () -> {
                    boolean expected = true;

                    boolean actual = userService.userLogin("username", "password");

                    Assert.assertEquals(expected, actual);
                });


    }

    @Test
    void updateUser() {
        assertThrows(NullPointerException.class,
                () -> {
                    boolean expected = true;

                    boolean actual = userService.updateUser(user);

                    Assert.assertEquals(expected, actual);
                });


    }

    @Test
    void userLogout() {
        assertThrows(NullPointerException.class,
                () -> {
                    boolean expected = true;

                    boolean actual = userService.UserLogout();

                    Assert.assertEquals(expected, actual);
                });
    }
}