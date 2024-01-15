package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.Currency;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="holidayData")
public class HolidayEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


//@Column(length=20, nullable=false)
@OneToOne
private LocationEntity location;

@Column(length=100, nullable=false)
private String title;

@Column(length=20, nullable=false)
private LocalDateTime date;

@Column(length=20, nullable=false)
private Currency price;
@Column(length=20, nullable=false)
private Integer freeSlots;


public Long getId() {
	return id;
}
public LocationEntity getLocation() {
	return location;
}
public void setLocation(LocationEntity location) {
	this.location=location;
}
public String getTitle() {
	return title;
}
public void setLocation(String title) {
	this.title=title;
}
public LocalDateTime getDate() {
	return date;
}
public void setDate(LocalDateTime date) {
	this.date=date;
}
public Currency getPrice() {
	return price;
}
public void setPrice(Currency price) {
	this.price=price;
}
public Integer getFreeSlots() {
	return freeSlots;
}
public void setFreeSlots(Integer slots) {
	this.freeSlots=slots;
}
}
