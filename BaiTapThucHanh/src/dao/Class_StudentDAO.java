package dao;

import java.sql.SQLException;
import java.util.List;

import model.Class;
import model.Class_Student;

public interface Class_StudentDAO {

	public void insert(Class_Student class_Student) throws SQLException;

	public void update(Class_Student class_Student) throws SQLException;

	public void delete(int id) throws SQLException;

	public List<Class_Student> selectAll() throws SQLException;

}
