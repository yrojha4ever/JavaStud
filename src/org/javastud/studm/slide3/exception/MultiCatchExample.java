package org.javastud.studm.slide3.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultiCatchExample {
	public static void main(String[] args) {

		try {
			
			try {
				int rate = 100 / 1; // 1.ERROR
				System.out.println("Rate is: " + rate);

				FileReader reader = new FileReader("D:\\FirstProgram.java"); // 2.ERROR

				int[] a = new int[5];
				a[1] = 50; // 3.ERROR

				String s = null;
				System.out.println(s.length()); // ERROR:NullPointerException

			} catch (ArithmeticException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			

			int i = Integer.parseInt("HELLO");

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Normal Execution..");

	}
}
