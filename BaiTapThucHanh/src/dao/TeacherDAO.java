package dao;

import java.sql.SQLException;
import java.util.List;

import model.Student;
import model.Teacher;

public interface TeacherDAO {

	public void insert(Teacher teacher) throws SQLException;

	public void update(Teacher teacher) throws SQLException;

	public void delete(int id) throws SQLException;

	// tra ve toan bo danh sach
	public List<Teacher> selectAll() throws SQLException;

	// ham tim kiem theo ten
	public List<Teacher> searchByName(String name) throws SQLException;

	// tim kiem theo department
	public List<Teacher> searchBydepartment(String department) throws SQLException;
}
