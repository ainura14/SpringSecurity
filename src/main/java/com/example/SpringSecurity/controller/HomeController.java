package com.example.SpringSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";  // Убедитесь, что у вас есть представление "index"
    }

//    @GetMapping("/register")
//    public String register() {
//        return "register";  // Убедитесь, что у вас есть представление "register"
//    }
//
//    @GetMapping("/login")
//    public String login() {
//        return "login";  // Убедитесь, что у вас есть представление "login"
//    }
}

