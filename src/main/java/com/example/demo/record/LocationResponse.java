package com.example.demo.record;

public record LocationResponse(
		Long id,
		String street,
		Integer streetNumber,
		String city,
		String country) {

}
