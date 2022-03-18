package jmaster.io.main;

import java.util.List;

import jmaster.io.model.Person;
import jmaster.io.service.ListExam;
import jmaster.io.service.ListExamImpl;

public class MainExamList {

	public static void main(String[] args) {

		ListExam listImpl = new ListExamImpl();
		List<Person> list = listImpl.input();

		listImpl.info(list);
		System.out.println("-----------");

		listImpl.filter(list);
		System.out.println("-----------");

		listImpl.sortPerson(list);

		listImpl.delete(list);
	}

}
