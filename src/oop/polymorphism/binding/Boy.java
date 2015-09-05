package oop.polymorphism.binding;

public class Boy extends Human {

	@Override
	public void walk() {
		System.out.println("Boy walks");
	}

	public static void main(String args[]) {
		
		Human h = new Human();
		h.walk(); // Static binding
		
		Boy b = new Boy(); // Static binding
		b.walk();

		Human db = new Boy();// Dynamic binding
		db.walk();
	}

}
