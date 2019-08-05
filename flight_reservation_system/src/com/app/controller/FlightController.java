package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.FlightService;

@Controller
@RequestMapping("/flight")
public class FlightController {
	
	@Autowired
	private FlightService service;
	
	public FlightController() {
		System.out.println("Inside FlightController constr"+getClass().getName());
	}
	
	@GetMapping("/search")
	public String showSearchFlight()
	{   System.out.println("in show search flight");
		return "/flight/search";
	}

	
	
}
