package dao;

import java.sql.SQLException;
import java.util.List;

import model.Student;

public interface StudentDAO {

	public void insert(Student student) throws SQLException;

	public void update(Student student) throws SQLException;

	public void delete(int id) throws SQLException;

	// tra ve toan bo danh sach
	public List<Student> selectAll() throws SQLException;

	// ham tim kiem theo ten
	public List<Student> searchByName(String name) throws SQLException;

	// student code la unique
	public Student searchByStudentCode(String studentCode) throws SQLException;
}
