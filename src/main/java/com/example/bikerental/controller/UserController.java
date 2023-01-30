package com.example.bikerental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bikerental.entity.User;
import com.example.bikerental.service.UserService;

@RestController
public class UserController {
	
	@Autowired 
	private UserService userService;
	
	@PostMapping("/adduser")
	public String registerUser(@RequestBody User user) {
		return userService.registerUser(user);
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PutMapping("/edituser")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	@DeleteMapping("/deleteuser")
	public User deleteUser(@RequestBody User user) {
		return userService.deleteUser(user);
	}

}
