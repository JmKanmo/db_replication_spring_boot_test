package com.example.replication.service;

import com.example.replication.entity.User;
import com.example.replication.repository.CustomUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomUserService {
    private final CustomUserRepository customUserRepository;

    @Transactional(readOnly = true)
    public List<User> findUserById(Long id) {
        return customUserRepository.findUserById(id);
    }
}
