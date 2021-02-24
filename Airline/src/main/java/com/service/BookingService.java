package com.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Booking;
import com.bean.Flight;
import com.dao.BookingRepository;

@Service
public class BookingService {
	@Autowired
	BookingRepository bookingRepository;
	 public List<Booking> getAllUserData()
	 {
		 return bookingRepository.findAll();
	 }
	 public String addUserData(Booking b) {
			Optional<Booking> op = bookingRepository.findById(b.getBid());
			if(op.isPresent()) {
				return "Record already present";
			}else {
				Booking log= bookingRepository.save(b);			// save the records 
				if(log!=null) {
					return "Record stored successfully";
				}else {
					return "Record didn't store";
				}
			}
	}
	 public String updateDateData(Booking b)
	 {
		 Optional<Booking> obj =bookingRepository.findById(b.getBid());
		 if(obj.isPresent())
		 {
			 Booking log=obj.get();
			 LocalDateTime dateofbooking=LocalDateTime.now();
			 log.setDateofbooking(b.getDateofbooking());
			
			 bookingRepository.saveAndFlush(log);
			 return "Record updated successfully";
		 }
		 else
		 {
			 return "Record not present";
		 }
	 }
	 public String deleteUserData(int bid)
	 {
	 	if(bookingRepository.existsById(bid))
	 	{
	 		bookingRepository.deleteById(bid);
	 		return "Record deleted successfully";
	 	}
	 	else
	 	{
	 		return"Record not present";
	 	}
	 }
	 	
}
