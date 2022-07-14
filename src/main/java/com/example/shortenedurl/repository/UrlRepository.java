package com.example.shortenedurl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shortenedurl.model.Url;

public interface UrlRepository extends JpaRepository<Url, Integer> {

}
