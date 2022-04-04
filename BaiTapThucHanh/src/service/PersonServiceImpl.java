package service;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import dao.PersonDAO;
import dao.PersonDAOImpl;
import model.Person;

public class PersonServiceImpl implements PersonService {

	@Override
	public void input(Person person) {

		System.out.println("Person Input");

		while (true) {
			try {
				System.out.println("Person ID: ");
				person.setId(new Scanner(System.in).nextInt());
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Nhap sai. Nhap lai so !!!");
			}
		}

		System.out.println("Person name: ");
		person.setName(new Scanner(System.in).nextLine());

		while (true) {
			try {
				// dinh dang ngay thang nam
				System.out.println("BirthDate (dd/mm/yyyy): ");
				String sDate = new Scanner(System.in).nextLine();
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				person.setBirthDate(formatter.parse(sDate));
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("nhap sai. nhap lai");
			}
		}

	}

	@Override
	public void info(Person person) {

		System.out.println("Person Info");
		System.out.println("ID: " + person.getId());
		System.out.println("Name: " + person.getName());

		SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM, yyyy", new Locale("vi"));
		System.out.println("BirthDate: " + formatter.format(person.getBirthDate()));
	}

	private PersonDAO personDAO = new PersonDAOImpl();

	@Override
	public void insert(Person person) {
		try {
			personDAO.insert(person);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Khong them duoc !!!");
		}
	}

	@Override
	public void update(Person person) {
		try {
			personDAO.update(person);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Khong update duoc !!!");
		}
	}

	@Override
	public void delete(int id) {
		try {
			personDAO.delete(id);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Khong xoa duoc !!!");
		}
	}

	@Override
	public List<Person> selectAll() {
		try {
			return personDAO.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Xay ra loi !!!");
		}
		return new ArrayList<>();
	}

	@Override
	public List<Person> searchByName(String name) {
		try {
			return personDAO.searchByName(name);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Xay ra loi !!!");
		}
		return new ArrayList<>();
	}

	@Override
	public List<Person> searchByBirthdate(int fromYear, int toYear) {
		try {
			return personDAO.searchByBirthdate(fromYear, toYear);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Xay ra loi !!!");
		}
		return new ArrayList<>();
	}

}
