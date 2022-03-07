package com.trungtamjava.model.bai1;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private String job;
	private House[] houses;
	private Car[] cars;

	// constructor
	public Person() {

	}

	public void input() {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Nhap ten ");
		this.setName(scan1.nextLine());

		Scanner scan2 = new Scanner(System.in);
		System.out.println("Nhap tuoi ");
		this.setAge(scan2.nextInt());

		Scanner scan3 = new Scanner(System.in);
		System.out.println("Nhap cong viec ");
		this.setJob(scan3.nextLine());
	}

	public void info() {
		System.out.println(this.getName());
		System.out.println(this.age);
		System.out.println(this.job);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public House[] getHouses() {
		return houses;
	}

	public void setHouses(House[] houses) {
		this.houses = houses;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

}
