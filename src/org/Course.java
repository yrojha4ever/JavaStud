package org;

public class Course {

	private String jCourse = "Java";
	
	private void privateCourse() {
		System.out.println("I am private " + jCourse);
	}

	public void publicCourse() {
		System.out.println("I am public " + jCourse);
	}
	
	public static void main(String[] args) {
		Course course = new Course();
		
		System.out.println( course.jCourse );//Private variable can be access with in same Class Object.
		
		course.privateCourse(); //Private method can be access with in same Class Object.
		
		course.publicCourse();
		
	}

}
