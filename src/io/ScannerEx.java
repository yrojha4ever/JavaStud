package io;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.print("Write Something in console window: ");
		Scanner sc = new Scanner(System.in);
		
		String inputText = sc.nextLine();//take input value
		System.out.println(inputText);
		
		int a = sc.nextInt();
		System.err.println(a);
		
		 
	}

}
