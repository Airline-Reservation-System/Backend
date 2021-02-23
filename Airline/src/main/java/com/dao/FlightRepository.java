package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>  {

}
