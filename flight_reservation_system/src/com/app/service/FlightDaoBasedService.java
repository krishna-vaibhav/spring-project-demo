package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Flight;

@Service
@Transactional
public class FlightDaoBasedService implements FlightService{
@Autowired
private FlightService dao;



	@Override
	public List<Flight> listFlight(Flight f) {
		System.out.println("in service list flight");
		return dao.listFlight(f);
	}

}
