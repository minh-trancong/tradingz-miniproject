package com.tradingz.miniproject.services;

import com.tradingz.miniproject.models.User;
import com.tradingz.miniproject.repositories.UserRepository;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class UserQueryResolver implements GraphQLQueryResolver{
    private UserRepository userRepository;
    public UserQueryResolver(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public Iterable<User> allUsers(){
        return userRepository.findAll();
    }

    public User userById(Integer id){
        return userRepository.findById(id).orElse(null);
    }

}
