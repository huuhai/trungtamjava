package com.trungtamjava.service;

import java.util.Scanner;

import com.trungtamjava.model.bai3.Address;

public class AddressServiceImpl implements AddressService {

	@Override
	public void input(Address address) {

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Vui long nhap ID");
		address.setId(scan1.nextInt());

		Scanner scan2 = new Scanner(System.in);
		System.out.println("Vui long nhap Street");
		address.setStreet(scan2.nextLine());

		Scanner scan3 = new Scanner(System.in);
		System.out.println("Vui long nhap City");
		address.setCity(scan3.nextLine());

	}

	@Override
	public void info(Address address) {
		System.out
				.println("ID: " + address.getId() + " Street: " + address.getStreet() + " City: " + address.getCity());
	}

}
