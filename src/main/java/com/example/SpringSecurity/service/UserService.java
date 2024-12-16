package com.example.SpringSecurity.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserService {

    private final BCryptPasswordEncoder passwordEncoder;

    public UserService() {
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }
}
