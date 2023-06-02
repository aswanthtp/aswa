package com.ust.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ust.user.model.User;
import com.ust.user.service.userService;

public class UserController {
	@Autowired
	userService userServ;
	
	@GetMapping("/getuser")
	public ResponseEntity<?> getRole(){
		List<User> user=userServ.getUsers();
		return new ResponseEntity<List<User>>(user,HttpStatus.OK);
	}
	@PostMapping("/adduser")
	public ResponseEntity<?> addPayment(@RequestBody User user){
		userServ.addUser(user);
		return null;
	 }
}
