package com.trungtamjava.model.bai1;

import java.util.Scanner;

public class Car {
	private String name;
	private Person owner;

	// constructor
	public Car() {

	}

	public Car(String name, Person owner) {
		this.name = name;
		this.owner = owner;
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap hang xe ");
		this.setName(scan.nextLine());
	}

	public void info() {
		System.out.println("Hang xe la " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

}
