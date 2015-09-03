package control;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		System.out.print("Enter any number: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n > 0) {
			System.out.println("tick " + n);
			n--;
		}
	}

}
