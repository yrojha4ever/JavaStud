package datereflection;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class JodaTimeExamples {
	public static void main( String[] args ) {

		DateTime dt = new DateTime( ); // Joda Date
		System.out.println( "Date:" + dt.toDate( ) ); // Java Date

		int month = dt.getMonthOfYear( );
		System.out.println( "MonthOfYear: " + month );

		DateTime.Property pDoW = dt.dayOfWeek( );// Monday:1 to Sunday:7
		System.out.println( "dayOfWeek: " + pDoW.getAsText( ) ); // print:Monday/Tuesday

		System.out.println( "getDayOfMonth: " + dt.getDayOfMonth( ) );
		int maxDay = dt.dayOfMonth( ).getMaximumValue( );
		System.out.println( "Last day of this month: " + maxDay + " day" );

		boolean leapYear = dt.yearOfEra( ).isLeap( );
		System.out.println( "Leap Year: " + leapYear );

		DateTime datePlus20 = dt.plusDays( 20 );
		DateTimeFormatter formattedDate = DateTimeFormat.forPattern( "dd/MM/yyyy" );
		System.out.println( dt.toString( formattedDate ) + " + 20 day = " + datePlus20.toString( formattedDate ) );

	}
}
