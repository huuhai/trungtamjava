package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.CourseDAO;
import dao.CourseDAOImpl;
import model.Course;

public class CourseServiceImpl implements CourseService {

	@Override
	public void input(Course course) {
		while (true) {
			try {
				System.out.println("Course id: ");
				course.setId(new Scanner(System.in).nextInt());
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Nhap sai. Nhap lai so");
			}
		}
		System.out.println("Course name: ");
		course.setName(new Scanner(System.in).nextLine());
	}

	@Override
	public void info(Course course) {
		System.out.println("Course id: " + course.getId());
		System.out.println("Course name: " + course.getName());
	}

	CourseDAO courseDAO = new CourseDAOImpl();

	@Override
	public void insert(Course course) {
		try {
			courseDAO.add(course);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Khong them duoc");
		}

	}

	@Override
	public void update(Course course) {
		try {
			courseDAO.update(course);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Khong cap nhat duoc");
		}
	}

	@Override
	public void delete(int id) {
		try {
			courseDAO.delete(id);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Khong xoa duoc");
		}
	}

	@Override
	public List<Course> getAll() {
		try {
			return courseDAO.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Xay ra loi");
		}
		return new ArrayList<>();
	}

}
