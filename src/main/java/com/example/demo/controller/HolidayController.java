package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HolidayEntity;
import com.example.demo.service.HolidayService;

@RestController
public class HolidayController {

private HolidayService service;
	
@GetMapping
public HolidayEntity setHoliday (HolidayEntity holiday) {
	return service.createLocation(holiday);
}

}
