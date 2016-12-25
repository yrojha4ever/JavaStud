package org.javastud.studm.array;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {

		int[] a = new int[5];
		a[0] = 10;
		a[1] = 45;
		a[2] = 50;
		a[3] = 30;
		a[4] = 20;
		
		System.out.println( Arrays.toString(a) );

		for (int i = 0; i < a.length; i++) { // i = index
			System.out.print(a[i] + "\t");
		}

		System.out.println(); //equal to \n: enter
		
		// == create array in one line.
		int[] arr = new int[] { 10, 45, 70, 30, 24, 17, 50 };
		for (int no : arr) { // no: array value
			System.out.print(no + "\t");
		}
		
		System.out.println();
		//Sort array using class: Arrays
		Arrays.sort(arr);
		for (int no : arr) { // no: array value
			System.out.print(no + "\t");
		}
		

	}
}
