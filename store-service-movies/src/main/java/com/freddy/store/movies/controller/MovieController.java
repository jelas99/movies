package com.freddy.store.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.freddy.store.movies.domain.Movie;
import com.freddy.store.movies.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping("/{code}")
	@ResponseBody
	public Movie getMovie(@PathVariable String code) {
		return movieService.getMovie(code);
	}
}