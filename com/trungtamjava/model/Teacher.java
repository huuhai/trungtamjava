package com.trungtamjava.model;

import java.util.Scanner;

public class Teacher {

	int id;
	String name;
	String address;
	String facility;
	
	public void input() {
		Scanner scID = new Scanner(System.in);
		System.out.println("enter id:");
		setId(scID.nextInt());
		Scanner scName = new Scanner(System.in);
		System.out.println("enter name:");
		setName(scName.nextLine());
		Scanner scAddress = new Scanner(System.in);
		System.out.println("enter Address:");
		setAddress(scAddress.nextLine());
		Scanner scfacility = new Scanner(System.in);
		System.out.println("enter facility:");
		setFacility(scfacility.nextLine());
	}
	
	public void info() {
		System.out.println(getId());
		System.out.println(getName());
		System.out.println(getAddress());
		System.out.println(getFacility());
	}
	
	public Teacher() {
		
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

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}
	
	
}
