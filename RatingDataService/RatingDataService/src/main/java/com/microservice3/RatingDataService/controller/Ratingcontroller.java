package com.microservice3.RatingDataService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.microservice3.RatingDataService.entity.Rating;

@RequestMapping
public class Ratingcontroller {

	@GetMapping("/rating/{userId}")
	public Rating getRating(@PathVariable String userId) {
		return new Rating("M111",5);
	}

}
