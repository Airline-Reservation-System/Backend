package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Flight;
import com.dao.FlightSearchDao;

@Service
public class FlightSearchService {
	@Autowired
	FlightSearchDao fs;
	public List<Flight> getAll(String fromloc)
	{
		
		return fs.searchFlight(fromloc);
	
	
	}
}
