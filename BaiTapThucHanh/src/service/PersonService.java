package service;

import java.util.List;

import model.Person;

public interface PersonService {

	void input(Person person);

	void info(Person person);

	void insert(Person person);

	void update(Person person);

	void delete(int id);

	List<Person> selectAll();

	List<Person> searchByName(String name);

	List<Person> searchByBirthdate(int fromYear, int toYear);
}
