package org.pkgpvt;

public class JavaCourse {

	//package-private variable(no modifier)
	String jCourse = "Java";
	
	//package-private method(no modifier)
	void showCourse() {
		System.out.println("Course Name is: " + jCourse);
	}
	
	private String jAdvCourse = "Advance Java";
	
	public void showAdvJavaCourse(){
		System.out.println("Course Name is: " + jAdvCourse);
	}
}
