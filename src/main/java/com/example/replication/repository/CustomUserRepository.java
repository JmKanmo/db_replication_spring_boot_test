package com.example.replication.repository;

import com.example.replication.entity.User;

import java.util.List;

public interface CustomUserRepository {
    List<User> findUserById(long id);
}
