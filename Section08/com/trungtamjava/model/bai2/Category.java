package com.trungtamjava.model.bai2;

import java.util.Scanner;

public class Category {
	private String name;
	private int id;
	private Product[] products;

	// constructor
	public Category() {

	}

	public Category(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	// input
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap ten");
		name = scan.nextLine();

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Vui long nhap id");
		id = scan1.nextInt();
	}

	// info
	public void info() {
		System.out.println("Ten: " + this.name + " ID: " + this.id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}
}
