package datereflection;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatTest {
	public static void main( String[] args ) {

		Date currentDate = new Date( );
		System.out.println( "Date: " + currentDate );

		String dateToStr = DateFormat.getInstance( ).format( currentDate );
		System.out.println( "Date: getInstance(): " + dateToStr );

		dateToStr = DateFormat.getDateInstance( ).format( currentDate );
		System.out.println( "Date: getDateInstance(): " + dateToStr );

		dateToStr = DateFormat.getTimeInstance( ).format( currentDate );
		System.out.println( "Date: getTimeInstance(): " + dateToStr );

		dateToStr = DateFormat.getDateTimeInstance( ).format( currentDate );
		System.out.println( "Date: getDateTimeInstance(): " + dateToStr );

	}
}
