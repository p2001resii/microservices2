package com.microservice3.RatingDataService.entity;

public class Rating {
	
	private String movieid;
	private int rating;
	
	
	
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rating(String movieid, int rating) {
		super();
		this.movieid = movieid;
		this.rating = rating;
	}

	public String getMovieid() {
		return movieid;
	}

	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
	

}
