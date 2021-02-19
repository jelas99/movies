package com.freddy.store.movies.respository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.freddy.store.movies.domain.Movie;

@Component
public class MoviesRepositoryInMemoryImpl implements MoviesRepository {

	private static final Map<String, Movie> DATABASE = new HashMap<String, Movie>();
	static {
		DATABASE.put("CODE_1", new Movie("CODE_1", "Chen the gnu of kappa and gamma"));
		DATABASE.put("CODE_2", new Movie("CODE_2", "Chen Chorao"));
		DATABASE.put("CODE_3", new Movie("CODE_3", "Chen junior"));
	}
	
	@Override
	public Movie getMovie(String code) {
		return DATABASE.get(code);
	}
}
