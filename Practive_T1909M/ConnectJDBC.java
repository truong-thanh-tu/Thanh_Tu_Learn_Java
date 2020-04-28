package Practive_T1909M;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
	public static Connection getJDBCConnection() {
		final String DB_JDBC = "jdbc:mysql://localhost:3306/qlsv?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
		final String UER = "root";
		final String PASS = "";

		try {
			return DriverManager.getConnection(DB_JDBC, UER, PASS);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}
}
