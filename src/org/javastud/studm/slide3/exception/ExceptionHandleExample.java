package org.javastud.studm.slide3.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandleExample {
	public static void main(String[] args) {

		// Run time exception.
		try {
			int rate = 10 / 0;
			System.out.println("Rate is: " + rate);
		} catch (ArithmeticException e) {
			//System.err.println("***Arithmtic Exception***");
			e.printStackTrace();
			//System.out.println(e);
		}

		// Compile Time Exception
		try {
			FileReader reader = new FileReader("D:\\Xlog4j-application.log");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Normal Execution.....");

	}
}
