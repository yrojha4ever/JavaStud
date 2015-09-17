package datereflection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStrToDateObject {
	public static void main( String[] args ) {

		try {

			SimpleDateFormat formatter = new SimpleDateFormat( "dd/MM/yyyy" );
			Date date = formatter.parse( "31/03/2015" );

			System.out.println( "Date is: " + date );

		} catch ( ParseException e ) {
			e.printStackTrace( );
		}
	}
}
