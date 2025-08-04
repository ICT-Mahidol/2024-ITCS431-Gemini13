package com.example.gemini13.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gemini13.model.User;
import com.example.gemini13.repository.UserRepository;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public boolean login(String username, String password) {
        User user = (User) userRepository.findByUsernameAndPassword(username, password);
        return user != null;
    }
}
