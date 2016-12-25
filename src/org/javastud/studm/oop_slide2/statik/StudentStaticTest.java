package org.javastud.studm.oop_slide2.statik;

public class StudentStaticTest {
	public static void main(String[] args) {
		Student stud1 = new Student(1, "Ram");
		Student stud2 = new Student(2, "Shyam");
		
		Student.college = "ASCOL";
		
		System.out.println(stud1);
		System.out.println(stud2);
		
		
		Student.showCollege();
	}
}
