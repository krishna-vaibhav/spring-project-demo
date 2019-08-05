package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Flight;

@Repository
public class FlightDaoImpl implements FlightDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public List<Flight> listFlight(Flight f) {
		String jpql="select f from Flight f where f.";
		return null;
	}

}
