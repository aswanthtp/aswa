package com.ust.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ust.user.model.User;
import com.ust.user.repository.userRepository;

public class userService {
	 
	@Autowired
	userRepository userRepo;
	
	public User addUser(User user) {
		userRepo.save(user);
		return user;
	}
	public List<User> getUsers(){
		List<User> user=userRepo.findAll();
		return user;
	}
}
