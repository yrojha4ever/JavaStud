package control;


public class HelloConstTest {

	private final String dy = "MONDAY";

	public static void main(String[] args) {
		HelloConstTest obj = new HelloConstTest();
		obj.printWeek(Day.MONDAY);
		
		//TEST EQUAL
		Day mnd = Day.MONDAY;
		boolean isEqual = (mnd == Day.MONDAY);
		System.out.println(isEqual);
		
		boolean isEq = (obj.dy == "ABC");
		boolean isEqual2 = (Day.SUNDAY == Day.MONDAY); //Error
	}
	
	public void printWeek(Day day){
		System.out.println("Day is: ");
		switch (day) {
		case SUNDAY:
			System.out.println(Day.SUNDAY);
			break;
		case MONDAY:
			System.out.println(Day.MONDAY);
			break;
			
		default:
			System.out.println("Day is not valid:");
			break;
		}
	}
}
