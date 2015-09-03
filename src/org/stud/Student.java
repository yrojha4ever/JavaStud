package org.stud;

import org.pkgpvt.JavaCourse;

public class Student {

	public static void main(String[] args) {

		JavaCourse jc = new JavaCourse();

		//Package-Private
		//@UNCOMMENT System.out.println( jc.jCourse ); //Java
		//@UNCOMMENT jc.showCourse(); //Course Name is: Java
		
		//@UNCOMMENT jc.jAdvCourse; //Error: private field not visible
		
		jc.showAdvJavaCourse();//Course Name is: Advance Java
		
	}

}
