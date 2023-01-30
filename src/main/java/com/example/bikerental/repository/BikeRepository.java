package com.example.bikerental.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bikerental.entity.Bike;

@Repository
public interface BikeRepository  extends JpaRepository<Bike,Long>{

	Optional<Bike> findByNumber(String number);

}
