package com.verizontraining.springcidemo;

public class Club {
	private String name;
	private Player player;

	public Club(String name, Player player) {
		super();
		this.name = name;
		this.player = player;
	}

	@Override
	public String toString() {
		return "Club [name=" + name + ", player=" + player + "]";
	}

}
