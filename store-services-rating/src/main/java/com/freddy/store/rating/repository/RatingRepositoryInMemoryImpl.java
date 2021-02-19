package com.freddy.store.rating.repository;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

import com.freddy.store.rating.domain.Movie;
import com.freddy.store.rating.domain.Rating;
import com.freddy.store.rating.movie.MovieClient;

@Component
public class RatingRepositoryInMemoryImpl implements RatingRepository {

	private final static Map<String, List<Rating>> DATABASES_BY_MOVIE = new HashMap<>();
	private final static Map<Integer, List<Rating>> DATABASES_BY_RATING = new HashMap<>();
	
	private final MovieClient movieRestClient;
	
	public RatingRepositoryInMemoryImpl(MovieClient movieRestClient) {
		this.movieRestClient = movieRestClient;
	}

	@Override
	public void add(Rating rating) {
		
		Movie movie = movieRestClient.getMovie(rating.getMovieCode());
		if(movie == null) {
			throw new RestClientException("No Movie");
		}
		
		DATABASES_BY_MOVIE.merge(rating.getMovieCode(), Collections.singletonList(rating), (oldList, newList) -> {oldList.addAll(newList); return oldList;});		
		DATABASES_BY_RATING.merge(rating.getStart(), Collections.singletonList(rating), (oldList, newList) -> {oldList.addAll(newList); return oldList;});
	}
	
	@Override
	public List<Rating> getRatings(int stars) {
		return DATABASES_BY_RATING.get(stars);
	}
}
