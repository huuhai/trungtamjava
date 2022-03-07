package com.trungtamjava.main;

import com.trungtamjava.model.bai2.Category;
import com.trungtamjava.model.bai2.Product;

public class CategoryMain {

	public static void main(String[] args) {
		Category category = new Category();
		category.input();

		Product[] products = new Product[2];

		for (int i = 0; i < products.length; i++) {
			products[i] = new Product();
			products[i].input();
			products[i].setCategory(category);
		}

		for (Product product : products) {
			product.info();
			product.getCategory().info();
		}

	}

}