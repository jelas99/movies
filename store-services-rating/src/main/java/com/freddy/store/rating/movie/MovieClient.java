package com.freddy.store.rating.movie;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.freddy.store.rating.domain.Movie;

@FeignClient("MOVIE")
public interface MovieClient {

	@GetMapping("/movies/{code}")
	Movie getMovie(@PathVariable String code);
}