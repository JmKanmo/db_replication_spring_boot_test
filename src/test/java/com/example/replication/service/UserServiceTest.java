package com.example.replication.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;

    @Autowired
    private CustomUserService customUserService;

    @Test
    void userInsertTest() {
        userService.insertUsers();
    }

    @Test
    void userFindTest() {
        for (int i = 1000; i <= 1100; i++) {
            System.out.println(userService.findUserById(i));
        }
    }

    @Test
    void customUserFindTest() {
        for (int i = 1000; i <= 1100; i++) {
            System.out.println(customUserService.findUserById((long) i));
        }
    }

    @Test
    void batchTest() {
        userService.insertBatchUsers();
    }
}