package com.usecase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.usecase.entity.User;
import com.usecase.repository.UserRepository;
import com.usecase.util.Utility;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repository;
	
	@Override
	public User registerUser(User user) {
		user.setPassword(String.valueOf(Utility.generatePassword()));
		return repository.save(user);
	}

}
