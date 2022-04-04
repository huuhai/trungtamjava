package dao;

import java.sql.SQLException;
import java.util.List;

import model.Person;

public interface PersonDAO {

	// them du lieu vao bang person
	public void insert(Person person) throws SQLException;

	// update du lieu vao bang person
	public void update(Person person) throws SQLException;

	// delete du lieu trong bang person
	public void delete(int id) throws SQLException;

	// tra ve toan bo danh sach cua bang person
	public List<Person> selectAll() throws SQLException;

	// ham tim kiem theo ten
	public List<Person> searchByName(String name) throws SQLException;

	// tim kiem theo birthdate
	public List<Person> searchByBirthdate(int fromYear, int toYear) throws SQLException;
}
