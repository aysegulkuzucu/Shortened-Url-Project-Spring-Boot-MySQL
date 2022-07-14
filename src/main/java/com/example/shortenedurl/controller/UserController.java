package com.example.shortenedurl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shortenedurl.model.User;
import com.example.shortenedurl.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {


	private UserService urlService;

	public UserController(UserService urlService) {
		this.urlService = urlService;
	}

	// User - Create User
	@PostMapping("/user/signup")
	public void createUser(@RequestBody User user) {
		urlService.createUser(user);
	}

	// User - Read User List
	@GetMapping("/user/list")
	public List<User> listAllUser() {
		return urlService.listAllUser();
	}


}
