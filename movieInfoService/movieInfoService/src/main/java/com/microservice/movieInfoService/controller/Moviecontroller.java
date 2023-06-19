package com.microservice.movieInfoService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.movieInfoService.entity.Movie;

@RestController
public class Moviecontroller {
	

	@GetMapping("/movie/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId){
		return new Movie(movieId,"avenger");
	}
}




