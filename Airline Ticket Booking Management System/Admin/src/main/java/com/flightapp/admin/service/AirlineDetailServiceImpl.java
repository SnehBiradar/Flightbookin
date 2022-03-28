package com.flightapp.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.admin.entity.AirlineDetails;
import com.flightapp.admin.repository.AirlineDetailRepository;

@Service
public class AirlineDetailServiceImpl implements AirlineDetailService {
	@Autowired
	AirlineDetailRepository airlineDetailRepository;

	@Override
	public Integer saveAirlineDetails(AirlineDetails airlineDetails) {
		airlineDetails= airlineDetailRepository.save(airlineDetails);
		//AirlineDetails ad = airlineDetails.save();
		return airlineDetails.getAirlineId();
		
	}
	
	

}
