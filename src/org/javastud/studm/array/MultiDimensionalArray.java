package org.javastud.studm.array;

import java.util.Arrays;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int[][] a = new int[3][4];

		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[0][3] = 4;

		a[1][0] = 5;
		a[1][1] = 6;
		a[1][2] = 7;
		a[1][3] = 8;

		a[2][0] = 9;
		a[2][1] = 10;
		a[2][2] = 11;
		a[2][3] = 12;

		for (int i = 0; i < 3; i++) { // row: i
			for (int j = 0; j < 4; j++) {// column: j
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		//-----------------
		int[][] b = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
		};
		for (int i = 0; i < b.length; i++) {
			System.out.println(Arrays.toString(b[i]));
		}
		
		System.out.println("\nSum or TWO ARRAY");
		int c[][] = new int[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		int[][][] threeD = {
				{
					{1, 2, 3, 4},
					{5, 6, 7, 8},
					{9, 10, 11, 12}
				}	,
				{
					{1, 2, 3, 4},
					{5, 6, 7, 8},
					{9, 10, 11, 12}
				}
		};

	}
}
