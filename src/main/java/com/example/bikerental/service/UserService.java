package com.example.bikerental.service;

import java.util.List;

import com.example.bikerental.entity.User;


public interface UserService {

	String registerUser(User user);

	List<User> getAllUsers();

	User updateUser(User user);

	User deleteUser(User user);

	
}
