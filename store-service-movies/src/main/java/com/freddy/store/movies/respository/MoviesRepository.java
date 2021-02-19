package com.freddy.store.movies.respository;

import com.freddy.store.movies.domain.Movie;

public interface MoviesRepository {

	Movie getMovie(String code);
}
