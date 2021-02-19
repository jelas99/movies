package com.freddy.store.rating.repository;

import java.util.List;

import com.freddy.store.rating.domain.Rating;

public interface RatingRepository {

	void add(Rating rating);
	List<Rating> getRatings(int stars);
}
