
package jmaster.io.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import jmaster.io.model.Person;

public class ListExamImpl implements ListExam {

	PersonService personService = new PersonServiceImpl();

	@Override
	public List<Person> input() {
		List<Person> list = new ArrayList<Person>();
		
		while (true) {
			System.out.println("Vui long nhap thong tin Person");
			Person p = new Person();
			personService.input(p);
			list.add(p);

			System.out.println("Tiep tuc khong? (K:Thoat)");

			Scanner sc = new Scanner(System.in);
			String option = sc.nextLine();
			if (option.equalsIgnoreCase("k")) {
				break;
			}
		}
		return list;
	}

	@Override
	public void info(List<Person> list) {
		System.out.println("List:");
		for (Person person : list) {
			personService.info(person);
		}

	}

	@Override
	public void filter(List<Person> list) {
		System.out.println("List nguoi co tuoi <20");
		for (Person person : list) {
			if (person.getAge() < 20) {
				personService.info(person);
			}
		}
	}

	@Override
	public void sortPerson(List<Person> list) {
		System.out.println("List tuoi tang dan");

		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return (o1.getAge() - o2.getAge());
				// am xep trc, duong xep sau
			}
		}
		);

		info(list);

		System.out.println("List tuoi giam dan");

		Collections.reverse(list);

		info(list);
	}

	@Override
	public void delete(List<Person> list) {
		//dung  interator
		info(list);
	}

}
