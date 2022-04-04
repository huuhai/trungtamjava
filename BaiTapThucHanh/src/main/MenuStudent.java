package main;

import java.util.List;
import java.util.Scanner;

import model.Student;
import service.StudentService;
import service.StudentServiceImpl;

public class MenuStudent {

	private static void listMenuStudent() {
		System.out.println("------STUDENT MENU------");
		System.out.println("1. Add Student");
		System.out.println("2. Update Student");
		System.out.println("3. Delete Student");
		System.out.println("4. Read All Student");
		System.out.println("5. Search by Name");
		System.out.println("6. Search by Student Code");
		System.out.println("7. Exit");
		System.out.println("Vui long chon: ");
	}

	public static void menuStudent() {
		while (true) {
			listMenuStudent();
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
				searchByName();
			} else if (c == 6) {
				searchByStudentCode();
			} else if (c == 7) {
				System.out.println("Da thoat !!!");
				break;
			} else {
				System.out.println("Vui long chon lai !!!");
			}
		}
	}

	private static void searchByStudentCode() {

		StudentService studentServiceImpl = new StudentServiceImpl();

		System.out.println("Nhap vao Student Code: ");
		String studentCode = new Scanner(System.in).nextLine();

		Student student = studentServiceImpl.searchbyStudentCode(studentCode);

		studentServiceImpl.info(student);
	}

	private static void searchByName() {

		StudentService studentServiceImpl = new StudentServiceImpl();

		System.out.println("Nhap vao ten can tim: ");
		String str = new Scanner(System.in).nextLine();

		List<Student> listStudent = studentServiceImpl.searchByName(str);

		for (Student student : listStudent) {
			studentServiceImpl.info(student);
		}
	}

	private static void insert() {

		StudentService studentServiceImpl = new StudentServiceImpl();

		System.out.println("Them du lieu");

		while (true) {

			Student student = new Student();

			studentServiceImpl.input(student);
			studentServiceImpl.insert(student);

			System.out.println("Nhap them Y/N");
			String str = new Scanner(System.in).nextLine();

			if (str.equalsIgnoreCase("N") || str.equalsIgnoreCase("n")) {
				break;
			}
		}
	}

	private static void update() {

		StudentService studentServiceImpl = new StudentServiceImpl();

		System.out.println("Cap nhat");

		Student student = new Student();

		studentServiceImpl.input(student);
		studentServiceImpl.update(student);
	}

	private static void delete() {

		StudentService studentServiceImpl = new StudentServiceImpl();

		System.out.println("Nhap id can xoa: ");
		int id = new Scanner(System.in).nextInt();

		studentServiceImpl.delete(id);
	}

	private static void selectAll() {

		StudentService studentServiceImpl = new StudentServiceImpl();

		System.out.println("Doc ra");

		List<Student> listStudent = studentServiceImpl.selectAll();
		for (Student student : listStudent) {
			studentServiceImpl.info(student);
		}

	}

}
