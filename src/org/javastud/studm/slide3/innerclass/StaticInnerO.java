package org.javastud.studm.slide3.innerclass;

public class StaticInnerO {

	static int count = 500;

	public static class StaticInnerI {
		int id = 5;

		public void display() {
			System.out.println(++count);
		}
	}

}
