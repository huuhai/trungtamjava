package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	public static Connection getConn() {
		// mysql server account

		final String username = "root";
		final String password = "123456";

		final String url = "jdbc:mysql://localhost:3306/hello";

		try {
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("loi ket noi db");
		}

		return null;
	}

}
