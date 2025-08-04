package com.example.gemini13.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gemini13.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
}
