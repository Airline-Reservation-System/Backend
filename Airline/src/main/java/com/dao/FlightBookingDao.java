package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FlightBookingDao {
	
	@Autowired
	EntityManagerFactory emf;

	public List<Object[]> joinBookingWithFlight()
	{
		EntityManager  manager=emf.createEntityManager();
		Query qry =manager.createNativeQuery("select f.fid,f.fromloc,f.totalseat,b.bid,b.dateofbooking from flight f,booking b where f.fid=b.bpid");
		return qry.getResultList();
	}

}
