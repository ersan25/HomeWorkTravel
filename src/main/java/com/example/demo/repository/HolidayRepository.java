package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

import com.example.demo.model.HolidayEntity;

public interface HolidayRepository extends ListCrudRepository<HolidayEntity,Long> {

}
