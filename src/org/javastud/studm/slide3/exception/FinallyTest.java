package org.javastud.studm.slide3.exception;

import java.util.Scanner;

public class FinallyTest {
	public static void main(String[] args) {

		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			System.out.println("Enter Any Number: ");
			int no = sc.nextInt();

			System.out.println("No is: " + no);
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			sc.close();
			System.out.println("<<<Resource Closed>>>");
		}

		System.out.println("Normal Execution...");

	}
}
