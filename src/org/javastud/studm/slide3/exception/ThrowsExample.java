package org.javastud.studm.slide3.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {

	public static void main(String[] args) {
		ThrowsExample obj = new ThrowsExample();
		obj.method1();
		System.out.println("Normal Execution...");
	}

	public void method1() {
		try {
			method2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void method2() throws FileNotFoundException {
		method3();
	}

	public void method3() throws FileNotFoundException {
		FileReader reader = new FileReader("D:\\abc.txt");
	}

}
