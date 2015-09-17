package datereflection;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	public static void main( String[] args ) {

		Date date = new Date( );

		SimpleDateFormat formatter = new SimpleDateFormat( "MM/dd/yyyy" );
		String strDate = formatter.format( date );
		System.out.println( "DateFormat: MM/dd/yyyy : " + strDate );

		formatter = new SimpleDateFormat( "dd-M-yyyy hh:mm:ss" );
		strDate = formatter.format( date );
		System.out.println( "DateFormat: dd-M-yyyy hh:mm:ss : " + strDate );

		formatter = new SimpleDateFormat( "dd MMMM yyyy" );
		strDate = formatter.format( date );
		System.out.println( "DateFormat: dd MMMM yyyy : " + strDate );
	}
}
