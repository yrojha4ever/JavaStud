package org.multiclassex;

public class InnerClassEx {

	private String val = "abc";

	public static void main(String[] args) {

		InnerClassEx inClassObj = new InnerClassEx();
		System.out.println(inClassObj.val);

		// Access Inner class only with obj.new ClassName
		Course course = inClassObj.new Course();
		System.out.println(course.course); // Accessing private variable:
		course.showCourse(); // Accessing private variable:

		org.Course crse = new org.Course();
		crse.publicCourse();

	}

	private class Course {

		private String course = "Java";

		public void showCourse() {
			System.out.println("Course is: " + course);
		}

	}

}
