package org.javastud.studm.control;

public class ConstWeeks {
	
	public static final String SUNDAY = "sunday";
	public static final String MONDAY = "monday";
	public static final String TUESDAY = "tuesday";
	
	public static final double PI = 3.14;
	
	public static void main(String[] args) {
		System.out.println(ConstWeeks.PI);
		
		//disadvante of constant like above.
		
		int i= 5;
		if( i == 5){ //good for primitive ==
		}
		
		//Bad: 1
		if(SUNDAY == "sunday"){ //bad for object(non primitive)
			//== check address not value.
		}
		//we can use Equal instead of ==
		if( SUNDAY.equals("sunDay")){
			
		}
		//Solution: equalsIgnoreCase
		if(SUNDAY.equalsIgnoreCase("sunDay")){
			
		}
		
		//ENUM: Constant
		System.out.println(Day.SUNDAY);
		
		//we can use == in enum
		Day d = Day.MONDAY;
		if( d == Day.TUESDAY){
		}
		if( d == Day.SUNDAY){
		}
		
		showDay(d);
		
		//--------------------------------
		System.out.println(Currency.PENNY);
		System.out.println(Currency.DIME.value);
		System.out.println(Currency.DIME.desc);
	}
	
	
	
	public static void showDay(Day d){ //MONDAY
		switch (d) {
		case SUNDAY:
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
		case SATURDAY:
			System.out.println("Today is: " + d);
			break;
		default:
			System.out.println("Invalid Day:");
			break;
		}
	}
	
	
	
	
	
	
}
