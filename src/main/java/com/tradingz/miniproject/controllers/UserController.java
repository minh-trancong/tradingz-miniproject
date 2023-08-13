package com.tradingz.miniproject.controllers;

import com.tradingz.miniproject.repositories.UserRepository;

public class UserController {
    private final UserRepository userRepository;
    public UserController(final UserRepository userRepository){
        this.userRepository = userRepository;
    }
}
