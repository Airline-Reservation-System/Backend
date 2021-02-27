package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.FlightBookingService;

@RestController
@RequestMapping(value="join")
public class FightBookingController {

	@Autowired
	FlightBookingService flightbookingservice;
	@GetMapping(value="flightbooking")
	public List<Object[]> list()
	{
		return flightbookingservice.getAll();
	}
	
}
