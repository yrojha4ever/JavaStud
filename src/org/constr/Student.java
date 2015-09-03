package org.constr;

import java.math.BigDecimal;

public class Student {
	private int id;
	private String name;
	private int age;

	public Student(int i, String n) {
		id = i;
		name = n;
	}

	public Student(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	public void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {

		Student s1 = new Student(101, "Rajesh");
		s1.display();

		Student s2 = new Student(102, "Aryan", 15);
		s2.display();
		
		BigDecimal a = new BigDecimal(2);
		BigDecimal b = new  BigDecimal(3);
		BigDecimal resu = a.add(b);
		System.out.println( resu.toString() );
		
		String str = "2";
		int intb = 5;
		int re = Integer.parseInt(str) + intb;
		
		
	}

}
