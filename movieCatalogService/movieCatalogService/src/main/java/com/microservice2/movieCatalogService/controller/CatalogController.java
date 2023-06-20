package com.microservice2.movieCatalogService.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice2.movieCatalogService.entity.Catalog;
import com.microservice2.movieCatalogService.entity.Movie;
import com.microservice2.movieCatalogService.entity.Rating;

@RestController
public class CatalogController {

	@GetMapping("/catalog/{userId}")
	public List <Catalog> getcatlog(@PathVariable String userId){
		
		//return Collections.singletonList(new Catalog("KGF","coal mining",4));
		
		
		List<Rating> ratingsList = Arrays.asList(new Rating("444",4),new Rating("44",5));
		 
		RestTemplate rt = new RestTemplate();
		Movie	m = rt.getForObject("http://localhost:8080/movie/1234", Movie.class);
		return ratingsList.stream().map(rating ->{
			return new  Catalog("VIP","vengence",rating.getRating());
		}).collect(Collectors.toList());

}

  

}
