package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

import com.example.demo.model.LocationEntity;

public interface TravelAgencyRepository extends ListCrudRepository<LocationEntity, Long> {

//	List<LocationEntity> saveAll();
}
