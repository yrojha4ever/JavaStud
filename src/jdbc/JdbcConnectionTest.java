package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnectionTest {
	public static void main( String[] args ) {
		
		try {
			Class.forName( "com.mysql.jdbc.Driver" );

			Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/testdb", "root", "" );
			// here studentdb is database name, root is username and password

			Statement stmt = con.createStatement( );

			ResultSet rs = stmt.executeQuery( "select * from student" );

			while ( rs.next( ) ) {// Loop Each Row
				// Fetch columns
				System.out.println( rs.getInt( 1 ) + "  " + rs.getString( 2 ) );
			}

			con.close( );

		} catch ( Exception e ) {
			System.out.println( e );
		}

	}

}
