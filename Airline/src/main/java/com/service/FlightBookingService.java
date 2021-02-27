package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.FlightBookingDao;

@Service
public class FlightBookingService {
	@Autowired
	 FlightBookingDao flightBookingDao;
	public List<Object[]> getAll()
	{
		return flightBookingDao.joinBookingWithFlight();
	}

}
