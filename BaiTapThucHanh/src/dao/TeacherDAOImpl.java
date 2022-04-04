package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Student;
import model.Teacher;

public class TeacherDAOImpl implements TeacherDAO {

	@Override
	public void insert(Teacher teacher) throws SQLException {
		String sql = "INSERT INTO teacher(department, person_id) VALUE (?, ?);";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, teacher.getDepartment());
		ps.setInt(2, teacher.getId());

		ps.executeUpdate();

	}

	@Override
	public void update(Teacher teacher) throws SQLException {
		String sql = "UPDATE teacher SET department=? WHERE person_id=?;";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, teacher.getDepartment());
		ps.setInt(2, teacher.getId());

		ps.executeUpdate();

	}

	@Override
	public void delete(int id) throws SQLException {
		String sql = "DELETE FROM teacher WHERE teacher.person_id=?;";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, id);

		ps.executeUpdate();

	}

	@Override
	public List<Teacher> selectAll() throws SQLException {
		String sql = "SELECT person_id, name, birthdate, department "
				+ "FROM teacher INNER JOIN person ON teacher.person_id=person.id";

		// ctr + shift + o
		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		List<Teacher> listTeacher = new ArrayList<Teacher>();

		while (rs.next()) { // doc tung dong trong bang
			Teacher teacher = new Teacher();

			teacher.setId(rs.getInt("person_id"));
			teacher.setName(rs.getString("name"));
			teacher.setBirthDate(rs.getDate("birthdate"));
			teacher.setDepartment(rs.getString("department"));

			listTeacher.add(teacher);
		}
		return listTeacher;
	}

	@Override
	public List<Teacher> searchByName(String name) throws SQLException {
		String sql = "SELECT person_id, name, birthdate, department "
				+ "FROM teacher INNER JOIN person ON teacher.person_id=person.id WHERE name LIKE ? ORDER BY name ASC";

		// ctr + shift + o
		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, "%" + name + "%");

		ResultSet rs = ps.executeQuery();

		List<Teacher> listTeacher = new ArrayList<Teacher>();

		while (rs.next()) { // doc tung dong trong bang
			Teacher teacher = new Teacher();

			teacher.setId(rs.getInt("person_id"));
			teacher.setName(rs.getString("name"));
			teacher.setBirthDate(rs.getDate("birthdate"));
			teacher.setDepartment(rs.getString("department"));

			listTeacher.add(teacher);
		}
		return listTeacher;
	}

	@Override
	public List<Teacher> searchBydepartment(String department) throws SQLException {
		String sql = "SELECT person_id, name, birthdate, department "
				+ "FROM teacher INNER JOIN person ON teacher.person_id=person.id WHERE department LIKE ? ORDER BY name ASC";

		// ctr + shift + o
		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, "%" + department + "%");

		ResultSet rs = ps.executeQuery();

		List<Teacher> listTeacher = new ArrayList<Teacher>();

		while (rs.next()) { // doc tung dong trong bang
			Teacher teacher = new Teacher();

			teacher.setId(rs.getInt("person_id"));
			teacher.setName(rs.getString("name"));
			teacher.setBirthDate(rs.getDate("birthdate"));
			teacher.setDepartment(rs.getString("department"));

			listTeacher.add(teacher);
		}
		return listTeacher;
	}

}
