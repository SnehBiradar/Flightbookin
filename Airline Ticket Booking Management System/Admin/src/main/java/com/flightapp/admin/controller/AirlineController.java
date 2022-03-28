package com.flightapp.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.flightapp.admin.entity.Admin;
import com.flightapp.admin.entity.AirlineDetails;
import com.flightapp.admin.service.AirlineDetailService;


public class AirlineController {
	
	@Autowired 
	private AirlineDetailService airlineService;
	
	@PostMapping
	public String getAdmin(@RequestBody AirlineDetails airlineDetails)
	{
		airlineService.saveAirlineDetails(airlineDetails);
		return "Admin"; 
	}
	

}
