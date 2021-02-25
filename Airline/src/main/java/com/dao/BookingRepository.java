package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.Booking;
import javax.persistence.EntityManagerFactory;
public interface BookingRepository extends JpaRepository<Booking,Integer>{

}
