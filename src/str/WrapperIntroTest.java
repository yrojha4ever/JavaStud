package str;

import java.util.Scanner;

public class WrapperIntroTest {

	public static void main(String[] args) {
		Integer intObj1 = new Integer(25);
		Integer intObj2 = new Integer("25");
		Integer intObj3 = new Integer(35);
		System.out.println("Comparing using compereTo Obj1 and Obj2: "
				+ intObj1.compareTo(intObj2));
		System.out.println("Comparing using compereTo Obj2 and Obj3: "
				+ intObj2.compareTo(intObj3));

		System.out.print("Write something in console window:");
		Scanner sc = new Scanner(System.in);
		String inputText = sc.next();
		System.out.println(inputText);

	}

}
