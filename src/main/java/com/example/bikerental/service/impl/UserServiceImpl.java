package com.example.bikerental.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bikerental.entity.User;
import com.example.bikerental.repository.UserRepository;
import com.example.bikerental.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepo;

	@Override
	public String registerUser(User user) {
		userRepo.save(user);
		return user.getName()+" Added";
	}

	@Override
	public List<User> getAllUsers() {
		
		return userRepo.findAll();
	}

	@Override
	public User updateUser(User user) {
		User foundUser = null;
		Optional<User> optUser = userRepo.findById(user.getId());
		if(optUser.isPresent()) {
			foundUser = optUser.get();
		}
		foundUser.setMobile(user.getMobile());
		foundUser.setName(user.getName());
		foundUser = userRepo.save(foundUser);
		return foundUser;
	}

	@Override
	public User deleteUser(User user) {
		userRepo.delete(user);
		return user;
	}

	
}
