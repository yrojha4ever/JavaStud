package org.javastud.studm.slide3.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndFormatTest {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println(date); //Mon Nov 21 08:21:09 NPT 2016
		
		//How to format Date? 06/29/2016  ---> MM/dd/yyyy
		SimpleDateFormat formatr = new SimpleDateFormat("MMMM/dd/yyyy");
		String strDate = formatr.format(date);  //format
		System.out.println("Formatted Date: " + strDate);
		//hour:minute:second
		System.out.println(new SimpleDateFormat("hh:mm:ss").format(date));
		
		
		//-----To Java Date: Parse----
		String sDate = "2015/11/20";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		Date dt = formatter.parse(sDate); //parse
		System.out.println(dt);
		
	}
}	
