package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Flight;
import com.bean.Login;
import com.dao.FlightRepository;
@Service
public class FlightService {
	 @Autowired
	    FlightRepository flightRepository;
	 public List<Flight> getAllUserData()
	 {
		 return flightRepository.findAll();
	 }

	 public String addUserData(Flight f) {
			Optional<Flight> op = flightRepository.findById(f.getFid());
			if(op.isPresent()) {
				return "Record already present";
			}else {
				Flight log= flightRepository.save(f);			// save the records 
				if(log!=null) {
					return "Record stored successfully";
				}else {
					return "Record didn't store";
				}
			}
	}
	 public String updatePriceData(Flight f)
	 {
		 Optional<Flight> obj =flightRepository.findById(f.getFid());
		 if(obj.isPresent())
		 {
			 Flight log=obj.get();
			 log.setPrice(f.getPrice());
			 flightRepository.saveAndFlush(log);
			 return "Record updated successfully";
		 }
		 else
		 {
			 return "Record not present";
		 }
	 }
public String deleteUserData(int fid)
{
	if(flightRepository.existsById(fid))
	{
		flightRepository.deleteById(fid);
		return "Record deleted successfully";
	}
	else
	{
		return"Record not present";
	}
}
	
}