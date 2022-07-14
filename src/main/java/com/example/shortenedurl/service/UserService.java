package com.example.shortenedurl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shortenedurl.model.User;
import com.example.shortenedurl.repository.UserRepository;

@Service
public class UserService {

	private UserRepository urlRepository;

	public UserService(UserRepository urlRepository) {
		this.urlRepository = urlRepository;
	}

	// tüm kullanicilari listeler
	public List<User> listAllUser() {
		return urlRepository.findAll();
	}

	// yeni bir kullanici ekler
	public void createUser(User user) {
		urlRepository.save(user);
	}

}
