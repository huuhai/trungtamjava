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
import model.Student;

public class StudentServiceImpl implements StudentService {

	// private PersonService personServiceImpl = new PersonServiceImpl();
	private PersonDAO personDAOImpl = new PersonDAOImpl();
	private StudentDAO studentDAOImpl = new StudentDAOImpl();

	@Override
	public void input(Student student) {

		System.out.println("Person Input");

		while (true) {
			try {
				System.out.println("Person ID: ");
				student.setId(new Scanner(System.in).nextInt());
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Nhap sai. Nhap lai so !!!");
			}
		}

		System.out.println("Person name: ");
		student.setName(new Scanner(System.in).nextLine());

		while (true) {
			try {
				// dinh dang ngay thang nam
				System.out.println("BirthDate (dd/mm/yyyy): ");
				String sDate = new Scanner(System.in).nextLine();
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				student.setBirthDate(formatter.parse(sDate));
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("nhap sai. nhap lai");
			}
		}

		System.out.println("Student Code: ");
		student.setStudentCode(new Scanner(System.in).nextLine());
	}

	@Override
	public void info(Student student) {

		System.out.println("Person Info");
		System.out.println("ID: " + student.getId());
		System.out.println("Name: " + student.getName());

		SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM, yyyy", new Locale("vi"));
		System.out.println("BirthDate: " + formatter.format(student.getBirthDate()));

		System.out.println("student Code: " + student.getStudentCode());
	}

	@Override
	public void insert(Student student) {

		try {
			personDAOImpl.insert(student);
			studentDAOImpl.insert(student);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Them du lieu loi !!!");
		}

	}

	@Override
	public void update(Student student) {
		try {
			personDAOImpl.update(student);
			studentDAOImpl.update(student);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Xay ra loi !!!");
		}

	}

	@Override
	public void delete(int id) {
		try {
			// xoa FK truoc
			studentDAOImpl.delete(id);
			personDAOImpl.delete(id);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Xay ra loi !!!");
		}

	}

	@Override
	public List<Student> selectAll() {
		try {
			return studentDAOImpl.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Xay ra loi !!!");
		}
		return null;
	}

	@Override
	public List<Student> searchByName(String name) {
		try {
			return studentDAOImpl.searchByName(name);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Xay ra loi !!!");
		}
		return null;
	}

	@Override
	public Student searchbyStudentCode(String code) {
		try {
			return studentDAOImpl.searchByStudentCode(code);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Xay ra loi !!!");
		}
		return null;
	}

}
