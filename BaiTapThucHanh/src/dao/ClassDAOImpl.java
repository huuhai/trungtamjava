package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Class;
import model.Course;

public class ClassDAOImpl implements ClassDAO {

	@Override
	public void insert(Class class1) throws SQLException {
		String sql = "INSERT INTO class(class_id, class_name, course_id) VALUE (?, ?, ?)";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, class1.getId());
		ps.setString(2, class1.getName());
		ps.setInt(3, class1.getCourse().getId());

		ps.executeUpdate();
	}

	@Override
	public void update(Class class1) throws SQLException {
		String sql = "UPDATE class SET class_name=?, course_id=? WHERE class_id=?";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, class1.getName());
		ps.setInt(2, class1.getCourse().getId());
		ps.setInt(3, class1.getId());

		ps.executeUpdate();

	}

	@Override
	public void delete(int id) throws SQLException {
		String sql = "delete from class where class_id=?";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, id);

		ps.executeUpdate();

	}

	@Override
	public List<Class> selectAll() throws SQLException {
		String sql = "SELECT class_id, class_name, course_id FROM class";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		List<Class> listClass = new ArrayList<Class>();

		while (rs.next()) {
			Class class1 = new Class();

			class1.setId(rs.getInt("class_id"));
			class1.setName(rs.getString("class_name"));

			// tao doi tuong
			Course course = new Course();
			course.setId(rs.getInt("course_id"));

			class1.setCourse(course);

			listClass.add(class1);
		}
		return listClass;
	}

	public List<Class> searchByCourseName(String courseName) throws SQLException {

		String sql = "SELECT cl.class_id, cl.class_name as 'cl.name', cl.course_id, c.name "
				+ "from class cl inner join course c on cl.course_id=c.id where c.name=?;";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, courseName);

		ResultSet rs = ps.executeQuery();

		List<Class> listClass = new ArrayList<Class>();

		while (rs.next()) {
			Class class1 = new Class();

			class1.setId(rs.getInt("class_id"));
			class1.setName(rs.getString("cl.name"));

			// tao doi tuong
			Course course = new Course();

			course.setId(rs.getInt("course_id"));
			course.setName(rs.getString("name"));

			class1.setCourse(course);

			listClass.add(class1);
		}
		return listClass;
	}

}
