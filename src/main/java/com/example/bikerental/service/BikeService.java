package com.example.bikerental.service;

import com.example.bikerental.entity.Bike;

public interface BikeService {

	String addBike(Bike bike);

	Bike updateBookingStatus(Bike bike);

}
