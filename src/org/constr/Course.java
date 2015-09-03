package org.constr;

public class Course {

	private String course;

	public Course() {
		course = "JAVA";
	}

	public void showCourse() {
		System.out.println("Course is: " + course);
	}

	public static void main(String[] args) {

		Course course = new Course(); // Constructor called first.

		course.showCourse(); // Course is: JAVA
	}

}
