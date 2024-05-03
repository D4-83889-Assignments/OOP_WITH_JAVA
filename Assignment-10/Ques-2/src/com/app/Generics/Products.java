package com.app.Generics;

public class Products implements Comparable<Products> {
	int id;
	String name;
	String category;
	double price;
	

	@Override
	public int compareTo(Products o) {
		// TODO Auto-generated method stub
		
		return this.category.compareTo(o.category);
	}


	public Products(int id, String name, String category, double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
}
