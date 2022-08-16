package com.example.replication.service;

import com.example.replication.entity.User;
import com.example.replication.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public long findUserById(long id) {
        return userRepository.findUserById(id).getId();
    }

    @Transactional
    public void insertUsers() {
        for (int i = 1; i <= 10; i++) {
            userRepository.save(new User( "hello world" + i));
        }
    }
}
