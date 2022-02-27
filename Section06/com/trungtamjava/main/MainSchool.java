package com.trungtamjava.main;

import java.util.Scanner;

import com.trungtamjava.model.School;

public class MainSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		String searchName;
		System.out.println("enter amount: ");
		amount = new Scanner(System.in).nextInt();

		School[] school = new School[amount];

		for (int i = 0; i < school.length; i++) {
			school[i] = new School();
			school[i].input();
		}

		for (int i = 0; i < school.length; i++) {
			school[i].info();
		}

		System.out.println("Enter the name want to search: ");
		searchName = new Scanner(System.in).nextLine();
		for (int i = 0; i < school.length; i++) {
			if (school[i].getName().toLowerCase().contains(searchName)) {
				school[i].info();
			}
		}
	}

}
