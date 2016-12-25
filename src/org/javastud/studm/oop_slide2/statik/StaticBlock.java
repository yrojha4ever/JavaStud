package org.javastud.studm.oop_slide2.statik;

public class StaticBlock {

	static {
		System.out.println("I am from Static Block");
		System.out.println((Math.PI * 2 * 4));
	}

	public StaticBlock() {
		System.out.println("Constructor calling..");
	}

	public static void main(String[] args) {
		StaticBlock obj1 = new StaticBlock();
		StaticBlock obj2 = new StaticBlock();
		StaticBlock obj3 = new StaticBlock();
	}

}
