package com.trungtamjava.model.bai1;
import java.util.Scanner;

public class House {
	private double square;// dien tich
	private Person owner;

	// constructor
	public House() {

	}

	public House(double square, Person owner) {
		super();
		this.square = square;
		this.owner = owner;
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap dien tich can nha ");
		this.setSquare(scan.nextDouble());

	}

	public void info() {
		System.out.println("Dien tich can nha la " + square);
	}

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

}
