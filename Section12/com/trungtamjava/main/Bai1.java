package com.trungtamjava.main;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {

		while (true) {
			Scanner scan = new Scanner(System.in);
			try {

				int a = scan.nextInt();
				System.out.println("enter a:");

				int b = scan.nextInt();
				System.out.println("enter b");

				int sum = a + b;
				System.out.println("sum " + sum);

			} catch (Exception e) {
				System.out.println("please try again");
			}
		}
	}

}
