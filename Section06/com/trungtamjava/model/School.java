package com.trungtamjava.model;

import java.util.Scanner;

public class School {
	private int id;
	private String name;
	private String address;

	public void input() {
		System.out.print("enter id: ");
		id = new Scanner(System.in).nextInt();
		System.out.print("enter name: ");
		name = new Scanner(System.in).nextLine();
		System.out.print("enter address: ");
		address = new Scanner(System.in).nextLine();
	}

	public void info() {
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("address: " + address);
		System.out.println("=====================");
	}	

	public School() {

	}

	public School(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
