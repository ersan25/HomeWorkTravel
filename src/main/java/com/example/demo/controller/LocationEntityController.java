package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LocationEntity;
import com.example.demo.repository.TravelAgencyRepository;
import com.example.demo.service.TravelAgencyService;

@RestController

public class LocationEntityController {
	
	
	private  TravelAgencyService tAService;
	
	@GetMapping("/locations")
	public LocationEntity setLocation(LocationEntity entity){
		return tAService.createLocation(entity);
		
	}
}
