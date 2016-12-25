package org.javastud.studm.slide3.exception;

public class ThrowTest {

	public static void main(String[] args) {
		try {
			validateAge(17); // ERROR
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		System.out.println("Normal Execution.");
	}

	public static void validateAge(int age) {
		if (age < 18) {
			throw new InvalidAgeException("Age " + age + " is not valid.");
		} else {
			System.out.println("You are eligible for vote.");
		}
	}

}
