package com.microservice3.RatingDataService.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice3.RatingDataService.entity.Rating;
import com.microservice3.RatingDataService.entity.UserRating;

@RestController
public class Ratingcontroller {

	@GetMapping("/ratingdata/{userId}")
	public Rating getRating(@PathVariable String userId) {
		return new Rating("M111",5);
	}
	@GetMapping("/ratingdata/users/{userId}")
	public UserRating getUserRating(@PathVariable String userId) {
		List<Rating> ratingsList = Arrays.asList(new Rating("1234",4),new Rating("2345",5));
		
	UserRating ur =new UserRating();
     ur.setUserRating(ratingsList);
	return ur;

}
}