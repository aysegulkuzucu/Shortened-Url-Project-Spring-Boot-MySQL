package com.example.shortenedurl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shortenedurl.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
