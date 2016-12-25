package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Register driver.
		Class.forName("com.mysql.jdbc.Driver");

		// 2. Create Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ncitdb", "root", "");

		// 3. Create Statement
		Statement stat = conn.createStatement();

		stat.executeUpdate("INSERT INTO `user` (`username`, `password`) VALUES ('ncit', 'ncit@ktm')");

		System.out.println("Data Inserted.: ");

		conn.close();

	}
}
