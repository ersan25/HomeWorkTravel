package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.HolidayEntity;
import com.example.demo.model.LocationEntity;
import com.example.demo.repository.HolidayRepository;
import com.example.demo.repository.TravelAgencyRepository;

@Service
public class HolidayService {
	private final HolidayRepository repository;
	public HolidayService(HolidayRepository repository) {
		super();
		this.repository=repository;
	}
	
	public HolidayEntity createLocation(HolidayEntity create) {
		
		if (create.getId() == null) {
			return null;
		}
		
		create = repository.save(create);
		
		return create;	
	}
	
}
