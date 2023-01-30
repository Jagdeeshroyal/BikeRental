package com.example.bikerental.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeRentalController {
	
	@GetMapping("/")
	public String homePage() {
		return "<h1>Welcome to bike Rental Service, Please be patient."
				+ "We haven't started our service at your location </h1>";
	}
	
	//get all unique cities

}
