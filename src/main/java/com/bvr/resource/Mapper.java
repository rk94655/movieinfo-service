package com.bvr.resource;

import com.bvr.models.Movie;
import com.bvr.models.MovieSummary;

public class Mapper {

	public Mapper() {
		// TODO Auto-generated constructor stub
	}
	
	public Movie map(MovieSummary movieSummary) {
		return new Movie(movieSummary.getId(),
				movieSummary.getTitle(), 
				movieSummary.getOverview()); 
		
	}

}
