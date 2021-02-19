package com.freddy.store.movies.service;

import org.springframework.stereotype.Service;

import com.freddy.store.movies.domain.Movie;
import com.freddy.store.movies.respository.MoviesRepository;

@Service
public class MovieServiceImpl implements MovieService {

	private final MoviesRepository movieRepository;

	public MovieServiceImpl(MoviesRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	@Override
	public Movie getMovie(String code) {
		return movieRepository.getMovie(code);
	}
}