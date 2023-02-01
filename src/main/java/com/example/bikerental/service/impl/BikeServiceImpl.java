package com.example.bikerental.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bikerental.entity.Bike;
import com.example.bikerental.repository.BikeRepository;
import com.example.bikerental.service.BikeService;

@Service
public class BikeServiceImpl implements BikeService {
	
	@Autowired
	private BikeRepository bikeRepo;

	@Override
	public String addBike(Bike bike) {

		bikeRepo.save(bike);
		return bike.getNumber()+" Added";
	}

	@Override
	public Bike updateBookingStatus(Bike bike) {
		Bike foundBike = null;
		Optional<Bike> optBike = bikeRepo.findByNumber(bike.getNumber());
		if(optBike.isPresent()){
		   foundBike = optBike.get();
		}
		foundBike.setBooked(!foundBike.isBooked());
		foundBike = bikeRepo.save(foundBike);
		return foundBike;
	}

}
