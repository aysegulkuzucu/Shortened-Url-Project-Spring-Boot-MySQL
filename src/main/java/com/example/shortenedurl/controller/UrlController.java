package com.example.shortenedurl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.shortenedurl.model.Url;
import com.example.shortenedurl.service.UrlService;

@RestController
@RequestMapping("/api/v1")
public class UrlController {

	private UrlService urlService;

	public UrlController(UrlService urlService) {
		this.urlService = urlService;
	}

	// Url - Create Url
	@PostMapping("/user/{userId}/{longUrl}/create")
	public void createUrl(@PathVariable int userId, @PathVariable String longUrl) {
		urlService.createUrl(userId, longUrl);
	}

	// Url - Url List
	@GetMapping("/url/list")
	public List<Url> listAllUrl() {
		return urlService.listAllUrl();
	}


	// Url - Read Long Url
	@GetMapping("/{userId}/{shortenedUrl}")
	public String getLongUrl(@PathVariable int userId, @PathVariable String shortenedUrl) {
		return urlService.getLongUrl(userId, shortenedUrl);
	}

	// Url - Read Url List By User
	@GetMapping("/user/{userId}/url/list")
	public List<String> getShortenedUrl(@PathVariable int userId) {
		return urlService.getShortenedUrl(userId);
	}

	// Url - Url Detail By User ID
	@GetMapping("/user/{userId}/url/detail/{urlId}")
	public Url getDetailUrl(@PathVariable int userId, @PathVariable int urlId) {
		return urlService.getDetailUrl(userId, urlId);
	}

	// Url - Delete Url
	@DeleteMapping("/user/{userId}/url/delete/{urlId}")
	public void deleteUrl(@PathVariable int userId, @PathVariable int urlId) {
		urlService.deleteUrl(userId, urlId);
	}

}
