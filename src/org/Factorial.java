package org;

import java.util.Scanner;

// 5! = 5 * 4 * 3 * 2 * 1
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Factorial No:");
		int no = sc.nextInt();
		
		long factNo = 1;
		for (int i = no; i >= 1; i--) {
			factNo = factNo * i;
		}
		
		System.out.println("Factorial of "+ no + " is: "+ factNo);
		
		sc.close();
		
	}
}
