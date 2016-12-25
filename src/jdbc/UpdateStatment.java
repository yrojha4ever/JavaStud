package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//UPDATE `ncitdb`.`user` SET `password` = 'admin@123' WHERE `id` = '1'; 
public class UpdateStatment {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1. Register driver.
		Class.forName("com.mysql.jdbc.Driver");

		// 2. Create Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ncitdb", "root", "");

		// 3. Create Statement
		Statement stat = conn.createStatement();
		
		stat.executeUpdate("UPDATE `user` SET `password` = 'admin#123' WHERE `id` = '1'");
		
		System.out.println("Query updated: ");

		conn.close();

	}
}
