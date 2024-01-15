package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="locationData")
public class LocationEntity {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(length=20, nullable=false)
private String street;

@Column(length=100,nullable = false)
private Integer streetNumber;

@Column(length=50,nullable=false)
private String city;

@Column(length=50,nullable=false)
private String country;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id=id;
}

public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street=street;
}
public void setStreetNumber(Integer streetNumber) {
	this.streetNumber=streetNumber;
}
public Integer getStreetNumber() {
	return streetNumber;
}

public String getCityName() {
	return city;
}
public void setCityName(String city) {
	this.city=city;
}

public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country=country;
}

}
