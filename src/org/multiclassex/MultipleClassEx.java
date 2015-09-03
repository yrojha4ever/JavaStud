package org.multiclassex;

public class MultipleClassEx {

	public static void main(String[] args) {
		JavaCourse course = new JavaCourse();
		course.showCourse();
	}

}

class JavaCourse {
	private String jCourse = "Java";

	public void showCourse() {
		System.out.println("Course: " + jCourse);
	}
}
