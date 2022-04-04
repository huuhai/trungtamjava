package main;

import java.util.List;
import java.util.Scanner;

import model.Course;
import service.CourseService;
import service.CourseServiceImpl;

public class MenuCourse {

	private static void listMenuCourse() {
		System.out.println("------COURSE MENU------");
		System.out.println("1. Add Course");
		System.out.println("2. Update Course");
		System.out.println("3. Delete Course");
		System.out.println("4. Read All Course");
		System.out.println("5. Exit");
		System.out.println("Vui long chon: ");
	}

	public static void menuCourse() {
		while (true) {
			listMenuCourse();
			int c = new Scanner(System.in).nextInt();
			if (c == 1) {
				write();
			} else if (c == 2) {
				update();
			} else if (c == 3) {
				delete();
			} else if (c == 4) {
				readAll();
			} else if (c == 5) {
				System.out.println("Da thoat !!!");
				break;
			} else {
				System.out.println("Vui long chon lai !!!");
			}
		}
	}

	private static void write() {
		CourseService courseServiceImpl = new CourseServiceImpl();

		while (true) {
			Course course = new Course();

			courseServiceImpl.input(course);
			courseServiceImpl.insert(course);

			System.out.println("Nhap them Y/N");
			String str = new Scanner(System.in).nextLine();

			if (str.equalsIgnoreCase("N") || str.equalsIgnoreCase("n")) {
				break;
			}
		}
	}

	private static void update() {
		CourseService courseServiceImpl = new CourseServiceImpl();

		System.out.println("Cap nhat");
		Course course = new Course();

		courseServiceImpl.input(course);
		courseServiceImpl.update(course);
	}

	private static void delete() {
		CourseService courseServiceImpl = new CourseServiceImpl();
		System.out.println("Nhap id can xoa");
		int id = new Scanner(System.in).nextInt();
		courseServiceImpl.delete(id);
	}

	private static void readAll() {
		CourseService courseServiceImpl = new CourseServiceImpl();

		System.out.println("Doc ra");

		List<Course> courses = courseServiceImpl.getAll();
		for (Course c : courses) {
			courseServiceImpl.info(c);
		}

	}

}
