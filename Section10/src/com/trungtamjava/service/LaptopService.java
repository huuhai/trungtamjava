package com.trungtamjava.service;

import com.trungtamjava.model.bai2.Laptop;

public interface LaptopService {
	
	void input(Laptop lt);
	
	void info(Laptop lt);
}public class LaptopServiceImpl implements LaptopService {

	@Override
	public void input(Laptop laptop) {

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Vui long nhap ID");
		laptop.setId(scan1.nextInt());

		Scanner scan2 = new Scanner(System.in);
		System.out.println("Vui long nhap CPU");
		laptop.setCpu(scan2.nextLine());

		Scanner scan3 = new Scanner(System.in);
		System.out.println("Vui long nhap Ram");
		laptop.setRam(scan3.nextLine());

		Scanner scan4 = new Scanner(System.in);
		System.out.println("Vui long nhap VGA");
		laptop.setVga(scan4.nextLine());

	}

	@Override
	public void info(Laptop laptop) {
		System.out.println("ID: " + laptop.getId() + " CPU: " + laptop.getCpu() + " Ram: " + laptop.getRam() + " VGA: "
				+ laptop.getVga());
	}

}
