package com.codegym.registrationformvalidation.service.impl;

import com.codegym.registrationformvalidation.model.User;
import com.codegym.registrationformvalidation.repository.UserRepository;
import com.codegym.registrationformvalidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
