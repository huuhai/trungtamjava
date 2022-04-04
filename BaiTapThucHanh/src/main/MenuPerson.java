package main;

import java.util.List;
import java.util.Scanner;

import model.Person;
import service.PersonService;
import service.PersonServiceImpl;

public class MenuPerson {

	private static void listMenuPerson() {
		System.out.println("------PERSON MENU------");
		System.out.println("1. Add Person");
		System.out.println("2. Update Person");
		System.out.println("3. Delete Person");
		System.out.println("4. Read All Person");
		System.out.println("5. Search by Name");
		System.out.println("6. Search by Birthdate");
		System.out.println("7. Exit");
		System.out.println("Vui long chon: ");
	}

	public static void menuPerson() {
		while (true) {
			listMenuPerson();
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
				searchByBirthdate();
			} else if (c == 7) {
				System.out.println("Da thoat !!!");
				break;
			} else {
				System.out.println("Vui long chon lai !!!");
			}
		}
	}

	private static void searchByBirthdate() {
		PersonService personServiceImpl = new PersonServiceImpl();

		System.out.println("Nhap vao from year: ");
		int fromYear = new Scanner(System.in).nextInt();
		System.out.println("Nhap vao to year: ");
		int toYear = new Scanner(System.in).nextInt();

		List<Person> listPerson = personServiceImpl.searchByBirthdate(fromYear, toYear);

		for (Person person : listPerson) {
			personServiceImpl.info(person);
		}

	}

	private static void searchByName() {
		PersonService personServiceImpl = new PersonServiceImpl();

		System.out.println("Nhap vao ten can tim: ");
		String str = new Scanner(System.in).nextLine();

		List<Person> listPerson = personServiceImpl.searchByName(str);

		for (Person person : listPerson) {
			personServiceImpl.info(person);
		}
	}

	private static void insert() {

		PersonService personServiceImpl = new PersonServiceImpl();

		System.out.println("Them du lieu");

		while (true) {

			Person person = new Person();

			personServiceImpl.input(person);
			personServiceImpl.insert(person);

			System.out.println("Nhap them Y/N");
			String str = new Scanner(System.in).nextLine();

			if (str.equalsIgnoreCase("N") || str.equalsIgnoreCase("n")) {
				break;
			}
		}
	}

	private static void update() {

		PersonService personServiceImpl = new PersonServiceImpl();

		System.out.println("Cap nhat");

		Person person = new Person();

		personServiceImpl.input(person);
		personServiceImpl.update(person);
	}

	private static void delete() {

		PersonService personServiceImpl = new PersonServiceImpl();

		System.out.println("Nhap id can xoa");
		int id = new Scanner(System.in).nextInt();

		personServiceImpl.delete(id);
	}

	private static void selectAll() {
		PersonService personServiceImpl = new PersonServiceImpl();

		System.out.println("Doc ra");

		List<Person> listPerson = personServiceImpl.selectAll();
		for (Person person : listPerson) {
			personServiceImpl.info(person);
		}

	}

}
