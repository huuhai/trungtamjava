package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Course;

public class CourseDAOImpl implements CourseDAO {

	@Override
	public void add(Course c) throws SQLException {
//		String sql = "insert into course(id, name) value ("+c.getId()+", "+c.getName()+")";
//		Connection conn = JDBCConnection.getConn();
//		Statement statement =conn.createStatement(sql);

		String sql = "insert into course(id, name) value (?, ?)";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, c.getId());
		ps.setString(2, c.getName());

		ps.executeUpdate();
	}

	@Override
	public void update(Course c) throws SQLException {
		String sql = "update course set name=? where id=?";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, c.getName());
		ps.setInt(2, c.getId());

		ps.executeUpdate();

	}

	@Override
	public void delete(int id) throws SQLException {
		String sql = "delete from course where id=?";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, id);

		ps.executeUpdate();

	}

	@Override
	public List<Course> selectAll() throws SQLException {
		String sql = "select id, name from course";

		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		List<Course> courseList = new ArrayList<Course>();

		while (rs.next()) {
			Course c = new Course();

			c.setId(rs.getInt("id"));
			c.setName(rs.getString("name"));

			courseList.add(c);
		}
		return courseList;
	}

}
