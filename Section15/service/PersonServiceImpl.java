package jmaster.io.service;

import java.util.Scanner;

import jmaster.io.model.Person;

public class PersonServiceImpl implements PersonService {

	@Override
	public void input(Person p) {
		System.out.println("Vui long nhap thong tin Person");

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Vui long nhap ID: ");
		p.setId(scan1.nextInt());

		Scanner scan2 = new Scanner(System.in);
		System.out.println("Vui long nhap Name: ");
		p.setName(scan2.next());

		Scanner scan3 = new Scanner(System.in);
		System.out.println("Vui long nhap Age: ");
		p.setAge(scan3.nextInt());
	}

	@Override
	public void info(Person p) {
		System.out.println("ID: " + p.getId());
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());
	}

}
