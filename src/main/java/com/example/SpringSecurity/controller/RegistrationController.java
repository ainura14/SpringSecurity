package com.example.SpringSecurity.controller;

import ch.qos.logback.core.model.Model;
import com.example.SpringSecurity.config.SecurityConfig;
import com.example.SpringSecurity.entity.User;
import com.example.SpringSecurity.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    private final UserRepository userRepository;

    private final SecurityConfig securityConfig;

    public RegistrationController(UserRepository userRepository, SecurityConfig securityConfig) {
        this.userRepository = userRepository;
        this.securityConfig = securityConfig;
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password, Model model) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(securityConfig.passwordEncoder().encode(password));
        userRepository.save(user);
        return "redirect:/login";
    }
}
