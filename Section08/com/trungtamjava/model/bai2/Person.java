package com.trungtamjava.model.bai2;

import java.util.Scanner;

public class Person {
	private String ten;
	private National quocTich;

	// constructor
	public Person() {

	}

	public Person(String ten, National quocTich) {
		this.ten = ten;
		this.quocTich = quocTich;
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap ten");
		this.setTen(scan.nextLine());

	}

	public void info() {
		System.out.println(ten);
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public National getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(National quocTich) {
		this.quocTich = quocTich;
	}

}
