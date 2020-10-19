package com.verizontraining.springcidemo;

public class Player {
	private String name;
	private String country;

	public Player(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", country=" + country + "]";
	}

}
