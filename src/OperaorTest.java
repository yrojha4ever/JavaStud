

public class OperaorTest {
	public static void main(String[] args) {

		// ? :

		int marks = 90;
		String result = "";
		if (marks > 40) {
			result = "PASS";
		} else {
			result = "FAIL";
		}
		System.out.println("Result:" + result);

		// ? :
		int mark = 90;
		String resul = (marks > 40) ? "PASS" : "FAIL";
		System.out.println("Result:" + resul);

		// instanceof check Object type Class.
		String s = "ABC";
		if (s instanceof String) {

		}
		
		//Primitive: int Integer => use always Wrapper class.
		Integer i = 55;
		if( i instanceof Integer){
			
		}
		
		

	}
}
