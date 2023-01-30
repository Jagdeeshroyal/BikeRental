package com.example.bikerental.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bikerental.entity.Station;
import com.example.bikerental.service.StationService;

@RestController
public class StationController {
	
	@Autowired
	private StationService stationService;
	
	
	@PostMapping("/addstation")
	public String addStation(@RequestBody Station station) {
		return stationService.addStation(station);
	}
	
	@PostMapping("/getcities")
	public Set<String> getCities(){
		return stationService.getCities();
	}
	
	@PostMapping("/getstations/{city}")
	public List<Station> getStationsByCity(@PathVariable("city") String city){
		return stationService.getStationsByCity(city);
	}

}
