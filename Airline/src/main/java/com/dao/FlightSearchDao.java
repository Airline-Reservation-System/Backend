package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Flight;

@Repository
public class FlightSearchDao {
	@Autowired
	EntityManagerFactory emf;
	
	public List<Flight> searchFlight(String fromloc)
	{
		EntityManager  manager=emf.createEntityManager();
		Query qry =manager.createNativeQuery("select  a.fromloc,a.toloc from flight a where a.fromloc=?");
		qry.setParameter(1, fromloc);
		List<Flight> list=qry.getResultList();
		System.out.println(list);
		return list;
	}
/*
 * public List<T> findMovie(String keyword) {
    Query q = getEntityManager().createQuery("SELECT movieId, title, genres FROM movies where title like ?1", entityClass);
    q.setParameter(1, keyword); //etc
    return q.getResultList();
}*/

}
