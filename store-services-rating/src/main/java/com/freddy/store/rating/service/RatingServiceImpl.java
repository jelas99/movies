package com.freddy.store.rating.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.freddy.store.rating.domain.Rating;
import com.freddy.store.rating.repository.RatingRepository;

@Component
public class RatingServiceImpl implements RatingService {

	private final RatingRepository ratingRepository;

	public RatingServiceImpl(RatingRepository ratingRepository) {
		this.ratingRepository = ratingRepository;
	}

	public void add(Rating rating) {
		ratingRepository.add(rating);
	}

	@Override
	public List<Rating> getRatings(int stars) {
		return ratingRepository.getRatings(stars);
	}
}
