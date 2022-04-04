package service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.ClassDAO;
import dao.ClassDAOImpl;
import model.Class;
import model.Course;

public class ClassServiceImpl implements ClassService {

	@Override
	public void input(Class class1) {
		while (true) {
			try {
				System.out.println("Class id: ");
				class1.setId(new Scanner(System.in).nextInt());
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Nhap sai. Nhap lai so");
			}
		}
		System.out.println("class name: ");
		class1.setName(new Scanner(System.in).nextLine());

		while (true) {
			try {
				System.out.println("Course id: ");

				Course course = new Course();
				course.setId(new Scanner(System.in).nextInt());
				class1.setCourse(course);
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Nhap sai. Nhap lai so");
			}
		}

	}

	@Override
	public void info(Class class1) {
		System.out.println("Class id: " + class1.getId());
		System.out.println("Class name: " + class1.getName());

		if (class1.getCourse() != null) {
			System.out.println("Course");
			CourseService courseService = new CourseServiceImpl();
			courseService.info(class1.getCourse());
		}
	}

	ClassDAO classDAOImpl = new ClassDAOImpl();

	@Override
	public void insert(Class class1) {
		try {
			classDAOImpl.insert(class1);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Loi !!!");
		}

	}

	@Override
	public void update(Class class1) {
		try {
			classDAOImpl.update(class1);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Loi !!!");
		}

	}

	@Override
	public void delete(int id) {
		try {
			classDAOImpl.delete(id);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Loi !!!");
		}

	}

	@Override
	public List<Class> selectAll() {
		try {
			return classDAOImpl.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Loi !!!");
		}
		return null;
	}

	@Override
	public List<Class> searchByCourseName(String courseName) {
		try {
			return classDAOImpl.searchByCourseName(courseName);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Loi !!!");
		}
		return null;
	}

}
