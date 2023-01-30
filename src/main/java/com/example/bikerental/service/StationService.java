package com.example.bikerental.service;

import java.util.List;
import java.util.Set;

import com.example.bikerental.entity.Station;

public interface StationService {

	String addStation(Station station);

	Set<String> getCities();

	List<Station> getStationsByCity(String city);

}
