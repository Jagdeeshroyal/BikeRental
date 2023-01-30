package com.example.bikerental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bikerental.entity.Bike;
import com.example.bikerental.service.BikeService;

@RestController
public class BikeController {
	
	@Autowired
	private BikeService bikeService;
	
	@PostMapping("/addbike")
	public String addBike(@RequestBody Bike bike) {
		return bikeService.addBike(bike);
	}
	
	@PostMapping("/updatebookingstatus")
	public Bike updateBookingStatus(@RequestBody Bike bike) {
		return bikeService.updateBookingStatus(bike);
	}
}
