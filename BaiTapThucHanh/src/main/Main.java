package main;

import java.util.Scanner;

public class Main {

	public static void listMenuMain() {
		System.out.println("------MENU MAIN------");
		System.out.println("1. Menu Course");
		System.out.println("2. Menu Person");
		System.out.println("3. Menu Student");
		System.out.println("4. Menu Teacher");
		System.out.println("5. Menu Class");
		System.out.println("6. Menu Class_Student");
		System.out.println("7. Exit");
		System.out.println("Vui long chon: ");
	}

	public static void main(String[] args) {
		while (true) {
			listMenuMain();
			int choice = new Scanner(System.in).nextInt();

			if (choice == 1) {
				MenuCourse.menuCourse();
			} else if (choice == 2) {
				MenuPerson.menuPerson();
			} else if (choice == 3) {
				MenuStudent.menuStudent();
			} else if (choice == 4) {
				MenuTeacher.menuTeacher();
			} else if (choice == 5) {
				MenuClass.menuClass();
			} else if (choice == 6) {
				MenuClass_Student.menuClassStudent();
			} else if (choice == 7) {
				System.out.println("Da thoat !!!");
				break;
			} else {
				System.out.println("Vui long chon lai !!!");
			}
		}
	}
}
