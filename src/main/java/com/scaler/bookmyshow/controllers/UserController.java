package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    @PostMapping("/signup")
    public signup(){

    }

}
