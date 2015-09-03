package control;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		System.out.print("Enter any number: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		do {
			System.out.println("tick " + n);
			n--;
		} while (n > 0);
	}

}
