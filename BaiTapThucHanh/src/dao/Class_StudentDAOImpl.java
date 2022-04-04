package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Class_Student;

public class Class_StudentDAOImpl implements Class_StudentDAO {

	@Override
	public void insert(Class_Student class_Student) throws SQLException {
		String sql = "INSERT INTO class_student(class_id, student_id) VALUE (?, ?)";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, class_Student.getClass_id());
		ps.setInt(2, class_Student.getStudent_id());

		ps.executeUpdate();

	}

	@Override
	public void update(Class_Student class_Student) throws SQLException {
		String sql = "update class_student set student_id=? where class_id=?;";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, class_Student.getStudent_id());
		ps.setInt(2, class_Student.getClass_id());

		ps.executeUpdate();

	}

	@Override
	public void delete(int id) throws SQLException {
		String sql = "delete from class_student where student_id=?;";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, id);

		ps.executeUpdate();

	}

	@Override
	public List<Class_Student> selectAll() throws SQLException {
		String sql = "SELECT class_id, student_id FROM class_student";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		List<Class_Student> listClass_Students = new ArrayList<Class_Student>();

		while (rs.next()) {
			Class_Student class_Student = new Class_Student();

			class_Student.setClass_id(rs.getInt("class_id"));
			class_Student.setStudent_id(rs.getInt("student_id"));

			listClass_Students.add(class_Student);
		}
		return listClass_Students;
	}

}
