package com.verizontraining.springcidemo;

import java.util.List;

public class Country {

	private String name;
	private List<String> languages;

	public Country(String name, List<String> languages) {
		super();
		this.name = name;
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", languages=" + languages + "]";
	}

}
