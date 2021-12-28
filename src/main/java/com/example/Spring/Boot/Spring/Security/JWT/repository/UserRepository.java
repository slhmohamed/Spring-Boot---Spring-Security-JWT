package com.example.Spring.Boot.Spring.Security.JWT.repository;

import com.example.Spring.Boot.Spring.Security.JWT.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
