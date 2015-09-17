package datereflection;

import java.util.Date;

import org.joda.time.DateTime;

public class JodaTimeExample {
	public static void main( String[] args ) {

		DateTime dateTime = new DateTime( );

		Date date = dateTime.toDate( );

		System.out.println( date );
	}
}
