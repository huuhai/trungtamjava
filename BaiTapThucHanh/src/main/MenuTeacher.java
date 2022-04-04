package main;

import java.util.List;
import java.util.Scanner;

import model.Teacher;
import service.TeacherService;
import service.TeacherServiceImpl;

public class MenuTeacher {

	private static void listMenuTeacher() {
		System.out.println("------TEACHER MENU------");
		System.out.println("1. Add Teacher");
		System.out.println("2. Update Teacher");
		System.out.println("3. Delete Teacher");
		System.out.println("4. Read All Teacher");
		System.out.println("5. Search by Name");
		System.out.println("6. Search by Department");
		System.out.println("7. Exit");
		System.out.println("Vui long chon: ");
	}

	public static void menuTeacher() {
		while (true) {
			listMenuTeacher();
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
				searchByDepartment();
			} else if (c == 7) {
				System.out.println("Da thoat !!!");
				break;
			} else {
				System.out.println("Vui long chon lai !!!");
			}
		}
	}

	private static void searchByDepartment() {

		TeacherService teacherServiceImpl = new TeacherServiceImpl();

		System.out.println("Nhap vao Department: ");
		String department = new Scanner(System.in).nextLine();

		List<Teacher> listTeacher = teacherServiceImpl.searchBydepartment(department);

		for (Teacher teacher : listTeacher) {
			teacherServiceImpl.info(teacher);
		}
	}

	private static void searchByName() {

		TeacherService teacherServiceImpl = new TeacherServiceImpl();

		System.out.println("Nhap vao ten can tim: ");
		String str = new Scanner(System.in).nextLine();

		List<Teacher> listTeacher = teacherServiceImpl.searchByName(str);

		for (Teacher teacher : listTeacher) {
			teacherServiceImpl.info(teacher);
		}
	}

	private static void insert() {

		TeacherService teacherServiceImpl = new TeacherServiceImpl();

		System.out.println("Them du lieu");

		while (true) {

			Teacher teacher = new Teacher();

			teacherServiceImpl.input(teacher);
			teacherServiceImpl.insert(teacher);

			System.out.println("Nhap them Y/N");
			String str = new Scanner(System.in).nextLine();

			if (str.equalsIgnoreCase("N") || str.equalsIgnoreCase("n")) {
				break;
			}
		}
	}

	private static void update() {

		TeacherService teacherServiceImpl = new TeacherServiceImpl();

		System.out.println("Cap nhat");

		Teacher teacher = new Teacher();

		teacherServiceImpl.input(teacher);
		teacherServiceImpl.update(teacher);
	}

	private static void delete() {

		TeacherService teacherServiceImpl = new TeacherServiceImpl();

		System.out.println("Nhap id can xoa: ");
		int id = new Scanner(System.in).nextInt();

		teacherServiceImpl.delete(id);
	}

	private static void selectAll() {

		TeacherService teacherServiceImpl = new TeacherServiceImpl();

		System.out.println("Doc ra");

		List<Teacher> listTeacher = teacherServiceImpl.selectAll();

		for (Teacher teacher : listTeacher) {
			teacherServiceImpl.info(teacher);
		}

	}

}
