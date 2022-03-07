package com.trungtamjava.model.bai2;

import java.util.Scanner;

public class National {
	private String ten;
	private String khuVuc;

	// constructor
	public National() {

	}

	public National(String ten, String khuVuc) {
		this.ten = ten;
		this.khuVuc = khuVuc;
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ten quoc gia");
		ten = scan.nextLine();

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Nhap ten khu vuc");
		khuVuc = scan1.nextLine();
	}

	public void info() {
		System.out.println("Ten quoc gia: " + this.getTen() + " " + "Khu vuc: " + this.getKhuVuc());
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getKhuVuc() {
		return khuVuc;
	}

	public void setKhuVuc(String khuVuc) {
		this.khuVuc = khuVuc;
	}

}
