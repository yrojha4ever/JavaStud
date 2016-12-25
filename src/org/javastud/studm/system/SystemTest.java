package org.javastud.studm.system;

import java.util.Scanner;

public class SystemTest {
	public static void main(String[] args) {
		
		System.out.println("HELLO WORLD");
		System.err.println("Java");
		
		//System.in
		//We can use Scanner class to take input from console.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee ID:");
		int id = sc.nextInt();
		
		System.out.println("Enter Employee Name:");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Enter Employee Email: ");
		String email = sc.next();
		
		//==============
		System.out.println("ID: " + id + " Name: "+ name + " Email: " + email);
		
	}
}
