package com.example.replication.controller;

import com.example.replication.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/insert")
    public ResponseEntity<Long> insertUser() {
        userService.insertUsers();
        return ResponseEntity.ok(200L);
    }
}
