package com.freddy.store.rating.domain;

public class Movie {

	private String code;
	private String title;

	public Movie() {
	}

	public Movie(String code, String title) {
		this.code = code;
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
