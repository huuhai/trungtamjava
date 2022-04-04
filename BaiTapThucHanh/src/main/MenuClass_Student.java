package main;

import java.util.List;
import java.util.Scanner;

import model.Class;
import model.Class_Student;
import service.ClassService;
import service.ClassServiceImpl;
import service.Class_Student_Service;
import service.Class_Student_ServiceImpl;

public class MenuClass_Student {

	private static void listMenuClassStudent() {
		System.out.println("------CLASS-STUDENT MENU------");
		System.out.println("1. Add Class-student");
		System.out.println("2. Update Class-student");
		System.out.println("3. Delete Class-student");
		System.out.println("4. Read All Class-student");
		System.out.println("5. Exit");
		System.out.println("Vui long chon: ");
	}

	public static void menuClassStudent() {
		while (true) {
			listMenuClassStudent();
			int c = new Scanner(System.in).nextInt();
			if (c == 1) {
				insert();
			} else if (c == 2) {
				update();
			} else if (c == 3) {
				delete();
			} else if (c == 4) {
				selectAll();
			} else if (c == 5) {
				System.out.println("Da thoat !!!");
				break;
			} else {
				System.out.println("Vui long chon lai !!!");
			}
		}
	}

	private static void insert() {

		Class_Student_Service class_Student_ServiceImpl = new Class_Student_ServiceImpl();

		System.out.println("Them du lieu");

		while (true) {

			Class_Student class_Student = new Class_Student();

			class_Student_ServiceImpl.input(class_Student);
			class_Student_ServiceImpl.insert(class_Student);

			System.out.println("Nhap them Y/N");
			String str = new Scanner(System.in).nextLine();

			if (str.equalsIgnoreCase("N") || str.equalsIgnoreCase("n")) {
				break;
			}
		}
	}

	private static void update() {

		Class_Student_Service class_Student_ServiceImpl = new Class_Student_ServiceImpl();

		System.out.println("Cap nhat");

		Class_Student class_Student = new Class_Student();

		class_Student_ServiceImpl.input(class_Student);
		class_Student_ServiceImpl.update(class_Student);
	}

	private static void delete() {

		Class_Student_Service class_Student_ServiceImpl = new Class_Student_ServiceImpl();

		System.out.println("Nhap id can xoa: ");
		int id = new Scanner(System.in).nextInt();

		class_Student_ServiceImpl.delete(id);
	}

	private static void selectAll() {

		Class_Student_Service class_Student_ServiceImpl = new Class_Student_ServiceImpl();

		System.out.println("Doc ra");

		List<Class_Student> listClass_Students = class_Student_ServiceImpl.selectAll();

		for (Class_Student class_Student : listClass_Students) {
			class_Student_ServiceImpl.info(class_Student);
		}

	}

}
