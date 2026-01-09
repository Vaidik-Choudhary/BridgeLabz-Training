package com.foodloop;

public abstract class FoodItem {
	
	protected String name;
	protected String category;
	protected double price;
	private int stock;

	public FoodItem (String name, String category, double price, int stock){
	
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
	}
	
	public int getStock() {
		return stock;
	}
	
	protected boolean isAvailable() {
		return stock > 0;
	}
	
	protected void reduceStock() {
		stock--;
	}
		
}
