package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Flight;
import com.service.FlightSearchService;

@RestController
@RequestMapping(value="search")
public class FlightSearchController {
	@Autowired
	FlightSearchService flightSearchservice;
	@GetMapping(value="flightsearch/{fromloc}",produces=MediaType.APPLICATION_JSON_VALUE)
	public  List<Flight> getAll(@PathVariable("fromloc") String key)
	{
		
		return flightSearchservice.getAll(key);
	
	}
}
