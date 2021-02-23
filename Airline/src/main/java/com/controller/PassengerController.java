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

import com.bean.Passenger;
import com.service.PassengerService;


@RestController
@RequestMapping(value = "passenger")
public class PassengerController {

	
	@Autowired
	PassengerService passengerservice;
	
	@GetMapping(value = "list", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Passenger> getAllPassenger() {
		return passengerservice.getAllPassengerData();
	}
	@PostMapping(value = "addPassenger", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addPassenger(@RequestBody Passenger l) {
		return passengerservice.addPassengerData(l);
	}

	@PutMapping(value = "updatePhno",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updatePhno(@RequestBody Passenger l) {
			return passengerservice.updatePhonenumberData(l);
	}
	@DeleteMapping(value = "deleteUser/{pid}")
	public String deleteUser(@PathVariable("pid")  int pid) {
			return passengerservice.deletePassengerData(pid);
	}
}
