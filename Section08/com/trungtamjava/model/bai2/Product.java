package com.trungtamjava.model.bai2;

import java.util.Scanner;

public class Product {
	private double price;
	private Category category;

	// constructor
	public Product() {

	}

	public Product(double price, Category category) {
		super();
		this.price = price;
		this.category = category;
	}

	// input
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap gia");
		this.price = scan.nextDouble();
	}

	public void info() {
		System.out.println("Gia: " + this.price);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
