package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionTest {
	public static void main(String[] args) {

		Connection con = null;
		try {
			// 1. Load Driver
			Class.forName("com.mysql.jdbc.Driver");

			// 2.Connect to the Database: URL:database Path, username, password.
			// here studentdb is database name, root is username and password
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studentdb", "root", "");

			// 3. Create Statement
			Statement stmt = con.createStatement();

			// 4. Execute Query
			ResultSet rs = stmt.executeQuery("select * from student");

			// 5. Fetch the result.
			while (rs.next()) {// Loop Each Row
				// Fetch columns
				// System.out.println(rs.getInt(1) + "  " + rs.getString(2));
				System.out.println(rs.getInt("id") + "  " + rs.getString("name"));
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			// 6. Close connection.
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
