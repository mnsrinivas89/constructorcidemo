package com.verizontraining.springcidemo;

public class Book {

	private String name;
	private String author;
	private int price;
	

	public Book(String name, String author, int price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
	}

}
