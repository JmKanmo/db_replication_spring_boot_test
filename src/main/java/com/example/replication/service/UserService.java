package com.example.replication.service;

import com.example.replication.entity.User;
import com.example.replication.repository.UserRepository;
import com.example.replication.repository.batch.JdbcUserBatchRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    private final JdbcUserBatchRepo jdbcUserBatchRepo;

    @Transactional(readOnly = true)
    public long findUserById(long id) {
        return userRepository.findUserById(id).getId();
    }

    @Transactional
    public void insertUsers() {
        for (int i = 1; i <= 10; i++) {
            userRepository.save(new User((long) i, "hello world" + i));
        }
    }

    @Transactional
    public void insertBatchUsers() {
        final List<User> userList = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            userList.add(new User((long) i, "nebi" + i));
        }

        jdbcUserBatchRepo.saveAllUser(userList, 10000);
    }
}
