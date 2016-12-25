
public class OperatorTest {
	public static void main(String[] args) {

		int x = 5;
		System.out.println(x++); // 5
		System.out.println(x); // 6

		int y = 10;
		System.out.println(++y); // 11

		System.out.println((17 % 3));

		int z = 20;

		z = z + 50; // 70
		z += 50; // z = z + 50;

		z *= 2; // z = z * 2;

		// ==== &&===
		int scimarks = 75;
		if (scimarks > 0 && scimarks <= 100) {

			if (scimarks >= 40) {
				System.out.println("Ram is pass in science!");
			} else {
				System.out.println("Ram is failed in science!");
			}

		}

		// =======ternary operator(? :)==========
		boolean isPassed;
		int mathMarks = 55;

		// ---if else--
		if (mathMarks >= 40) {
			isPassed = true;
		} else {
			isPassed = false;
		}
		System.out.println("IS ram passed in Math: " + isPassed);

		// ? : ternary operator

		isPassed = (mathMarks >= 40) ? true : false;
		System.out.println("IS ram passed in Math: " + isPassed);
		

		// ========instanceof check Object type Class.=====
		String s = "ABC";
		if (s instanceof String) {

		}

		// Primitive: int Integer => use always Wrapper class.
		Integer i = 55;
		if (i instanceof Integer) {

		}

	}
}
