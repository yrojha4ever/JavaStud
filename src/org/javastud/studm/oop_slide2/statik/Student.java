package org.javastud.studm.oop_slide2.statik;

public class Student {
	private int rollNo;
	private String name;
	public static String college = "NCIT";

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public static void showCollege(){
		System.out.println(college);
		
		/*System.out.println(rollNo);
		System.out.println(name);*/
		
		/*Student stud = new Student(40, "DEVID");
		System.out.println(stud.rollNo);
		System.out.println(stud.name);*/
	}

	@Override
	public String toString() {
		return rollNo + " " + name + " " + college;
	}
	
	
	/*public static void main(String[] args) {
		
		System.out.println(college);
		
		System.out.println(rollNo);
		System.out.println(name);
		Student stu = new Student(40, "JOHN");
		System.out.println(stu.rollNo);
		System.out.println(stu.name);
	}*/

}
