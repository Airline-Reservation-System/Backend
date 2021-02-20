package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Passenger;
import com.dao.PassengerRepository;

@Service
public class PassengerService {
	@Autowired
	PassengerRepository passengerRepository;
	public List<Passenger> getAllPassengerData() {
		return passengerRepository.findAll();
}
	
	public String addPassengerData(Passenger l) {
		Optional<Passenger> op = passengerRepository.findById(l.getPid());
		if(op.isPresent()) {
			return "Record already present";
		}else {
			Passenger log= passengerRepository.save(l);			// save the records 
			if(log!=null) {
				return "Record stored successfully";
			}else {
				return "Record didn't store";
			}
		}
}
	public String updatePhonenumberData(Passenger l) {
		Optional<Passenger> obj	 = passengerRepository.findById(l.getPid());
		if(obj.isPresent()) {
			Passenger log	 = obj.get();
		log.setPhno(l.getPhno());;
		passengerRepository.saveAndFlush(log);
		return "Record updated successfully";
}else {
	return "Record not present";
}
}
	public String deletePassengerData(int id) {
		if(passengerRepository.existsById(id)) {
			passengerRepository.deleteById(id);
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
}
	

}
