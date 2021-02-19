package com.freddy.store.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.freddy.store.rating.domain.Rating;
import com.freddy.store.rating.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@Autowired
	private RatingService ratingService;

	@PostMapping
	@ResponseBody
	public void add(@RequestBody Rating rating) {
		ratingService.add(rating);
	}
	
	@GetMapping("/{stars}")
	@ResponseBody
	public List<Rating> getByStars(@PathVariable(required = true) Integer stars) {
		return ratingService.getRatings(stars);
	}
}