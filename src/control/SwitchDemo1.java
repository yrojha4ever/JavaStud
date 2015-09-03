package control;

import java.util.Scanner;


public class SwitchDemo1 {
	public static void main(String[] args) {
		System.out.print("Please intput a month: "); 
		
		Scanner a = new Scanner(System.in);
		int month = a.nextInt();
		
		String monthString;
		switch (month) {
		
		case 1:
		case 2:
		case 3:
			monthString = "January";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Invalid month";
			break;
		}
		System.out.println(monthString);
	}
}
