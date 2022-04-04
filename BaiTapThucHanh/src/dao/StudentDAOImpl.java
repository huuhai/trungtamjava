package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public void insert(Student student) throws SQLException {

		String sql = "INSERT INTO student(person_id, student_code) VALUE (?, ?);";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, student.getId());
		ps.setString(2, student.getStudentCode());

		ps.executeUpdate();
	}

	@Override
	public void update(Student student) throws SQLException {

		String sql = "UPDATE student SET student_code=? WHERE person_id=?;";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, student.getStudentCode());
		ps.setInt(2, student.getId());

		ps.executeUpdate();

	}

	@Override
	public void delete(int id) throws SQLException {

		String sql = "DELETE FROM student WHERE id=?;";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, id);

		ps.executeUpdate();

	}

	// tra ve toan bo danh sach
	@Override
	public List<Student> selectAll() throws SQLException {
		String sql = "SELECT person_id, name, birthdate, student_code "
				+ "FROM student INNER JOIN person ON student.person_id=person.id";

		// ctr + shift + o
		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		List<Student> listStudent = new ArrayList<Student>();

		while (rs.next()) { // doc tung dong trong bang
			Student student = new Student();

			student.setId(rs.getInt("person_id"));
			student.setName(rs.getString("name"));
			student.setBirthDate(rs.getDate("birthdate"));
			student.setStudentCode(rs.getString("student_code"));

			listStudent.add(student);
		}
		return listStudent;
	}

	// ham tim kiem theo ten
	@Override
	public List<Student> searchByName(String name) throws SQLException {
		String sql = "SELECT person_id, name, birthdate, student_code "
				+ "FROM student INNER JOIN person ON student.person_id=person.id WHERE name LIKE ? ORDER BY name ASC";

		// ctr + shift + o
		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, "%" + name + "%");
		ResultSet rs = ps.executeQuery();

		List<Student> listStudent = new ArrayList<Student>();

		while (rs.next()) { // doc tung dong trong bang
			Student student = new Student();

			student.setId(rs.getInt("person_id"));
			student.setName(rs.getString("name"));
			student.setBirthDate(rs.getDate("birthdate"));
			student.setStudentCode(rs.getString("student_code"));

			listStudent.add(student);
		}
		return listStudent;
	}

	// student code la unique
	@Override
	public Student searchByStudentCode(String studentCode) throws SQLException {
		String sql = "SELECT person_id, name, birthdate, student_code "
				+ "FROM student INNER JOIN person ON student.person_id=person.id WHERE student_code= ?";

		// ctrl + shift + o
		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, studentCode);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) { // doc tung dong trong bang
			Student student = new Student();

			student.setId(rs.getInt("person_id"));
			student.setName(rs.getString("name"));
			student.setBirthDate(rs.getDate("birthdate"));
			student.setStudentCode(rs.getString("student_code"));

			return student;
		}
		return null;
	}
}
