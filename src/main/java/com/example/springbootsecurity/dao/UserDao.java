package com.example.springbootsecurity.dao;


import com.example.springbootsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
