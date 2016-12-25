package org.javastud.studm.slide3.date;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;

public class JodaTimeExample {
	public static void main(String[] args) {
		DateTime dt = new DateTime();
		System.out.println(dt);
		
		//Convert to Java Date
		Date jDate = dt.toDate();
		System.out.println(jDate);
		
		//Day after 10 day
		DateTime dtPlus2 = dt.plusDays(10);
		System.out.println("After 10 days: " + dtPlus2);
		
		//Month:
		System.out.println("Month: " + dt.getMonthOfYear());
		System.out.println("Month: "+ dt.monthOfYear().getAsText());
		
		//Day:
		System.out.println("Day: " +dt.getDayOfWeek());
		System.out.println("Day: "+ dt.dayOfWeek().getAsText());
		
		//Formatting
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(formatter.format(dt.toDate()));
		
		//Leap year:
		boolean isLeapYear = dt.year().isLeap();
		System.out.println("Is Leap Year: " + isLeapYear);
	}
}
