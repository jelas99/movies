package com.freddy.store.rating.service;

import java.util.List;

import com.freddy.store.rating.domain.Rating;

public interface RatingService {

	void add(Rating rating);
	List<Rating> getRatings(int stars);

}
