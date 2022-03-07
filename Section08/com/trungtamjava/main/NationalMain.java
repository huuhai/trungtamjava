package com.trungtamjava.main;

import java.util.Scanner;

import com.trungtamjava.model.bai2.National;
import com.trungtamjava.model.bai2.Person;


public class NationalMain {

	public static void main(String[] args) {
		National vn = new National();
		vn.input();

		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap n");
		int n = scan.nextInt();

		Person[] persons = new Person[n];

		for (int i = 0; i < persons.length; i++) {
			persons[i] = new Person();
			persons[i].input();
			persons[i].setQuocTich(vn);
		}

		for (Person p : persons) {
			p.info();
			p.getQuocTich().info();
		}

	}
}
