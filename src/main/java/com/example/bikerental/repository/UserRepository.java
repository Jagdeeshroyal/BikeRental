package com.example.bikerental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bikerental.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
