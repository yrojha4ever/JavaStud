package org.pkgpvt;

public class Student {

	public static void main(String[] args) {

		JavaCourse jc = new JavaCourse();

		//Package-Private
		System.out.println( jc.jCourse ); //Java
		jc.showCourse(); //Course Name is: Java
		
		//@UNCOMMENT jc.jAdvCourse; //Error: private field not visible
		
		jc.showAdvJavaCourse();//Course Name is: Advance Java
		
	}

}
