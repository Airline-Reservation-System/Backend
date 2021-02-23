package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Flight;

import com.service.FlightService;

@RestController
@RequestMapping(value = "flight")
public class FlightController {
	@Autowired
    FlightService flightservice;

    @GetMapping(value = "user", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Flight> getAllUser()
    {
    	return flightservice.getAllUserData();
    }
    @PostMapping(value = "addUser", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addUser(@RequestBody Flight f) {
		return flightservice.addUserData(f);
	}
	
	@PutMapping(value = "updatePassword",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updatePassword(@RequestBody Flight f) {
			return flightservice.updatePriceData(f);
	}
	@DeleteMapping(value = "deleteUser/{id}")
	public String deleteUser(@PathVariable("id")  int id) {
			return flightservice.deleteUserData(id);
	}
    
}
