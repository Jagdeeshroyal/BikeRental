package com.example.bikerental.service.impl;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bikerental.entity.Station;
import com.example.bikerental.repository.StationRepository;
import com.example.bikerental.service.StationService;

@Service
public class StationServiceImpl implements StationService{
	
	@Autowired
	private StationRepository stationRepo ;
	@Override
	public String addStation(Station station) {
		stationRepo.save(station);
		return station.getName()+ " Added";
	}
	@Override
	public Set<String> getCities() {
		List<Station> allStations =stationRepo.findAll();
		
		return allStations.stream().map(m->m.getCity()).collect(Collectors.toSet() );
	}
	@Override
	public List<Station> getStationsByCity(String city) {
		List<Station> stations = stationRepo.findAll();
		
		return stations.stream().filter(m-> m.getCity().equals(city)).toList();
	}

	
}
