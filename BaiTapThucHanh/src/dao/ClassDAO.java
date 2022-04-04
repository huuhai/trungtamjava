package dao;

import java.sql.SQLException;
import java.util.List;

import model.Class;

public interface ClassDAO {

	public void insert(Class class1) throws SQLException;

	public void update(Class class1) throws SQLException;

	public void delete(int id) throws SQLException;

	public List<Class> selectAll() throws SQLException;
	
	public List<Class> searchByCourseName(String courseName) throws SQLException;

}
