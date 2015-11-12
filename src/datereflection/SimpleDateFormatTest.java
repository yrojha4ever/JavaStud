package datereflection;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	public static void main( String[] args ) {

		for ( ;; ) {// Infinite Loop

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

			try { // Only continue loop after 2 second
				Thread.sleep( 2000 );
				System.out.println( );
			} catch ( InterruptedException e ) {
				e.printStackTrace( );
			}

		}
	}
}
