package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.LocationEntity;
import com.example.demo.repository.TravelAgencyRepository;

@Service
public class TravelAgencyService {
	
private final TravelAgencyRepository travelAgencyRepository;

public TravelAgencyService(TravelAgencyRepository travelAgency) {
	super();
	this.travelAgencyRepository=travelAgency;
}

public LocationEntity createLocation(LocationEntity create) {
	
	if (create.getStreet() == null) {
		return null;
	}
	
	create = travelAgencyRepository.save(create);
	
	return create;	
}

}
