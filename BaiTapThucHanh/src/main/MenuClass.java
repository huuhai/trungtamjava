package main;

import java.util.List;
import java.util.Scanner;

import model.Class;
import service.ClassService;
import service.ClassServiceImpl;

public class MenuClass {

	private static void listMenuClass() {
		System.out.println("------CLASS MENU------");
		System.out.println("1. Add Class");
		System.out.println("2. Update Class");
		System.out.println("3. Delete Class");
		System.out.println("4. Read All Class");
		System.out.println("5. Search by Course Name");
		System.out.println("6. Exit");
		System.out.println("Vui long chon: ");
	}

	public static void menuClass() {
		while (true) {
			listMenuClass();
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
				searchByCourseName();
			} else if (c == 6) {
				System.out.println("Da thoat !!!");
				break;
			} else {
				System.out.println("Vui long chon lai !!!");
			}
		}
	}

	private static void searchByCourseName() {

		ClassService classServiceImpl = new ClassServiceImpl();

		System.out.println("Nhap vao ten khoa hoc can tim: ");
		String str = new Scanner(System.in).nextLine();

		List<model.Class> listClass = classServiceImpl.searchByCourseName(str);

		for (model.Class class1 : listClass) {
			classServiceImpl.info(class1);
		}
	}

	private static void insert() {

		ClassService classServiceImpl = new ClassServiceImpl();

		System.out.println("Them du lieu");

		while (true) {

			model.Class class1 = new Class();

			classServiceImpl.input(class1);
			classServiceImpl.insert(class1);

			System.out.println("Nhap them Y/N");
			String str = new Scanner(System.in).nextLine();

			if (str.equalsIgnoreCase("N") || str.equalsIgnoreCase("n")) {
				break;
			}
		}
	}

	private static void update() {

		ClassService classServiceImpl = new ClassServiceImpl();

		System.out.println("Cap nhat");

		model.Class class1 = new Class();

		classServiceImpl.input(class1);
		classServiceImpl.update(class1);
	}

	private static void delete() {

		ClassService classServiceImpl = new ClassServiceImpl();

		System.out.println("Nhap id can xoa: ");
		int id = new Scanner(System.in).nextInt();

		classServiceImpl.delete(id);
	}

	private static void selectAll() {

		ClassService classServiceImpl = new ClassServiceImpl();

		System.out.println("Doc ra");

		List<model.Class> listClass = classServiceImpl.selectAll();

		for (model.Class class1 : listClass) {
			classServiceImpl.info(class1);
		}

	}

}
