package control;

import java.math.BigDecimal;

public class BigDecimalIntTest {
	public static void main(String[] args) {
		BigDecimal dec1 = new BigDecimal("25.5");
		BigDecimal dec2 = BigDecimal.valueOf(25.5);
		BigDecimal total = dec1.add(dec2); // dec1 + dec2;
		System.out.println(total);

		if (total.intValue() > 100)
			System.out.println("total is greater then 100");
		else {
			System.out.println("Total is less then 100");

		}
	}
}
