package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Person;

public class PersonDAOImpl implements PersonDAO {

	// them du lieu vao bang person
	@Override
	public void insert(Person person) throws SQLException {

		String sql = "INSERT INTO person(id, name, birthdate) VALUE (?, ?, ?);";

		Connection conn = JDBCConnection.getConn();

		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, person.getId());
		ps.setString(2, person.getName());
		ps.setDate(3, new java.sql.Date(person.getBirthDate().getTime()));

		ps.executeUpdate();
	}

	// update du lieu vao bang person
	@Override
	public void update(Person person) throws SQLException {

		String sql = "UPDATE person SET name= ?, birthdate= ? WHERE id= ?;";

		Connection conn = JDBCConnection.getConn();

		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, person.getName());
		ps.setDate(2, new java.sql.Date(person.getBirthDate().getTime()));
		ps.setInt(3, person.getId());

		ps.executeUpdate();
	}

	// delete du lieu trong bang person
	@Override
	public void delete(int id) throws SQLException {

		String sql = "DELETE FROM person where id= ?;";

		Connection conn = JDBCConnection.getConn();

		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, id);

		ps.executeUpdate();

	}
	
	// tra ve toan bo danh sach cua bang person
	@Override
	public List<Person> selectAll() throws SQLException {

		String sql = "SELECT id, name, birthdate FROM person;";

		// ctr + shift + o
		Connection conn = JDBCConnection.getConn();

		PreparedStatement ps = conn.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		List<Person> listPerson = new ArrayList<Person>();

		while (rs.next()) { // doc tung dong trong bang person

			Person person = new Person();

			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setBirthDate(rs.getDate("birthdate"));

			listPerson.add(person);
		}

		return listPerson;

	}

	// ham tim kiem theo ten
	@Override
	public List<Person> searchByName(String name) throws SQLException {

		String sql = "SELECT id, name, birthdate FROM person WHERE name LIKE ?;";

		Connection conn = JDBCConnection.getConn();

		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, "%" + name + "%");

		ResultSet rs = ps.executeQuery();

		List<Person> listPerson = new ArrayList<Person>();

		while (rs.next()) { // doc tung dong trong bang person

			Person person = new Person();

			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setBirthDate(rs.getDate("birthdate"));

			listPerson.add(person);
		}

		return listPerson;
	}

	// tim kiem theo birthdate
	@Override
	public List<Person> searchByBirthdate(int fromYear, int toYear) throws SQLException {
		String sql = "SELECT id, name, birthdate FROM person WHERE YEAR(birthdate) >= ? AND YEAR(birthdate) <= ?;";

		// ctrl + shift + o
		Connection conn = JDBCConnection.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, fromYear);
		ps.setInt(2, toYear);
		ResultSet rs = ps.executeQuery();

		List<Person> listPerson = new ArrayList<Person>();

		while (rs.next()) { // doc tung dong trong bang
			Person person = new Person();

			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setBirthDate(rs.getDate("birthdate"));

			listPerson.add(person);
		}
		return listPerson;
	}
}
