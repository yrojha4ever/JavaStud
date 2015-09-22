package collection;

import java.util.ArrayList;
import java.util.List;

public class UserArrayList {
	public static void main( String[] args ) {

		List< User > userList = new ArrayList< User >( );

		userList.add( new User( 1, "User1" ) );
		userList.add( new User( 2, "User2" ) );
		userList.add( new User( 3, "User3" ) );
		userList.add( new User( 4, "User4" ) );

		userList.remove( 1 );

		for ( User user: userList ) {
			System.out.println( user );
		}
	}
}
