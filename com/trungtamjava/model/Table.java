package com.trungtamjava.model;

public class Table {

	public String color;
	float price;
	String type;
	String manufacturer;
	
	public Table() {
		
	}

	public Table(String color, float price, String type, String manufacturer) {
		super();
		this.color = color;
		this.price = price;
		this.type = type;
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
}
