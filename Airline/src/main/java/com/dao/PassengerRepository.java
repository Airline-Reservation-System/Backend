package com.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Passenger;
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}


