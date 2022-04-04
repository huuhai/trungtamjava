package service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.Class_StudentDAO;
import dao.Class_StudentDAOImpl;
import model.Class_Student;

public class Class_Student_ServiceImpl implements Class_Student_Service {

	@Override
	public void input(Class_Student class_Student) {
		while (true) {
			try {
				System.out.println("Class id: ");
				class_Student.setClass_id(new Scanner(System.in).nextInt());
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Nhap sai. Nhap lai so");
			}
		}

		while (true) {
			try {
				System.out.println("Student id: ");
				class_Student.setStudent_id(new Scanner(System.in).nextInt());
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Nhap sai. Nhap lai so");
			}
		}

	}

	@Override
	public void info(Class_Student class_Student) {
		System.out.println("Class id: " + class_Student.getClass_id());
		System.out.println("Student id: " + class_Student.getStudent_id());

	}

	private Class_StudentDAO class_StudentDAOImpl = new Class_StudentDAOImpl();

	@Override
	public void insert(Class_Student class_Student) {
		try {
			class_StudentDAOImpl.insert(class_Student);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Loi");
		}
	}

	@Override
	public void update(Class_Student class_Student) {
		try {
			class_StudentDAOImpl.update(class_Student);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Loi");
		}

	}

	@Override
	public void delete(int id) {
		try {
			class_StudentDAOImpl.delete(id);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Loi");
		}

	}

	@Override
	public List<Class_Student> selectAll() {
		try {
			return class_StudentDAOImpl.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Loi");
		}
		return null;
	}

}
