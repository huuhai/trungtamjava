package com.trungtamjava.main;

import com.trungtamjava.model.bai2.Laptop;

public class MainBai2 {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		LaptopService laptopService = new LaptopServiceImpl();
		laptopService.input(laptop);
		laptopService.info(laptop);
	}

}
