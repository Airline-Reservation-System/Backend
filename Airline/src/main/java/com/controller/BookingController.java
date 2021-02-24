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

import com.bean.Booking;

import com.service.BookingService;

@RestController
@RequestMapping(value="booking")
public class BookingController {
@Autowired
BookingService bookingService;

@GetMapping(value="user",produces=MediaType.APPLICATION_JSON_VALUE)
public List<Booking> getUser()
{
	return bookingService.getAllUserData();
}
@PostMapping(value = "addUser", consumes = MediaType.APPLICATION_JSON_VALUE)
public String addUser(@RequestBody Booking b) {
	return bookingService.addUserData(b);
}

@PutMapping(value = "updatePassword",consumes = MediaType.APPLICATION_JSON_VALUE)
public String updatePassword(@RequestBody Booking b) {
		return bookingService.updateDateData(b);
}
@DeleteMapping(value = "deleteUser/{id}")
public String deleteUser(@PathVariable("id")  int id) {
		return bookingService.deleteUserData(id);
}
}
