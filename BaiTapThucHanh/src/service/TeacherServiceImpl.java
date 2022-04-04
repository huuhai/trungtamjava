package service;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import dao.PersonDAO;
import dao.PersonDAOImpl;
import dao.StudentDAO;
import dao.StudentDAOImpl;
import dao.TeacherDAO;
import dao.TeacherDAOImpl;
import model.Student;
import model.Teacher;

public class TeacherServiceImpl implements TeacherService {

	// private PersonService personServiceImpl = new PersonServiceImpl();
	private PersonDAO personDAOImpl = new PersonDAOImpl();
	private TeacherDAO teacherDAOImpl = new TeacherDAOImpl();

	@Override
	public void input(Teacher Teacher) {

		System.out.println("Person Input");

		while (true) {
			try {
				System.out.println("Person ID: ");
				Teacher.setId(new Scanner(System.in).nextInt());
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Nhap sai. Nhap lai so !!!");
			}
		}

		System.out.println("Person name: ");
		Teacher.setName(new Scanner(System.in).nextLine());

		while (true) {
			try {
				// dinh dang ngay thang nam
				System.out.println("BirthDate (dd/mm/yyyy): ");
				String sDate = new Scanner(System.in).nextLine();
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				Teacher.setBirthDate(formatter.parse(sDate));
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("nhap sai. nhap lai");
			}
		}

		System.out.println("Teacher Department: ");
		Teacher.setDepartment(new Scanner(System.in).nextLine());
	}

	@Override
	public void info(Teacher Teacher) {

		System.out.println("Person Info");
		System.out.println("ID: " + Teacher.getId());
		System.out.println("Name: " + Teacher.getName());

		SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM, yyyy", new Locale("vi"));
		System.out.println("BirthDate: " + formatter.format(Teacher.getBirthDate()));

		System.out.println("Teacher Department: " + Teacher.getDepartment());
	}

	@Override
	public void insert(Teacher Teacher) {

		try {
			personDAOImpl.insert(Teacher);
			teacherDAOImpl.insert(Teacher);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Them du lieu loi !!!");
		}

	}

	@Override
	public void update(Teacher Teacher) {
		try {
			personDAOImpl.update(Teacher);
			teacherDAOImpl.update(Teacher);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Xay ra loi !!!");
		}

	}

	@Override
	public void delete(int id) {
		try {
			// xoa FK truoc
			teacherDAOImpl.delete(id);
			personDAOImpl.delete(id);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Xay ra loi !!!");
		}

	}

	@Override
	public List<Teacher> selectAll() {
		try {
			return teacherDAOImpl.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Xay ra loi !!!");
		}
		return null;
	}

	@Override
	public List<Teacher> searchByName(String name) {
		try {
			return teacherDAOImpl.searchByName(name);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Xay ra loi !!!");
		}
		return null;
	}

	@Override
	public List<Teacher> searchBydepartment(String department) {
		try {
			return teacherDAOImpl.searchBydepartment(department);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Xay ra loi !!!");
		}
		return null;
	}

}
