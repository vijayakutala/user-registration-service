package com.usecase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.entity.User;
import com.usecase.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@PostMapping("/addUser")
	public User registerUser(@RequestBody User user) {
		return service.registerUser(user);
	}
}
