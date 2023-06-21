package com.microservice2.movieCatalogService.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice2.movieCatalogService.entity.Catalog;
import com.microservice2.movieCatalogService.entity.Movie;
import com.microservice2.movieCatalogService.entity.Rating;
import com.microservice2.movieCatalogService.entity.UserRating;

@RestController
public class CatalogController {
	@Autowired
	private RestTemplate rt;

	@GetMapping("/catalog/{userId}")
	public List <Catalog> getcatlog(@PathVariable String userId){
		
//		return Collections.singletonList(new Catalog("KGF","coal mining",4));
		
//		List<Rating> ratingsList = Arrays.asList(new Rating("444",4),new Rating("44",5));
		  UserRating UserRating = rt.getForObject("http://localhost:8081/ratingdata/users/"+userId,UserRating.class);
		 
		return UserRating.getUserRating().stream().map(rating ->{
		Movie	m = rt.getForObject("http://localhost:8080/movie/"+rating.getMovieid(), Movie.class);
			return new  Catalog(m.getName(),"abcds",rating.getRating());
		}).collect(Collectors.toList());

}

  

}