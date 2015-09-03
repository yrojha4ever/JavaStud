package oop;

public class ChangeStaticValue {
	int rollno;
	String name;
	static String college = "TRICHANDRA";

	static void change() {
		college = "ASCOL";
	}

	ChangeStaticValue(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college + "\n");
	}

	public static void main(String args[]) {

		ChangeStaticValue s1 = new ChangeStaticValue(111, "Amrit");
		s1.display();
		
		ChangeStaticValue.change(); //college:ASCOL
		ChangeStaticValue s2 = new ChangeStaticValue(222, "Bindu");
		ChangeStaticValue s3 = new ChangeStaticValue(333, "Champ");

		s1.display();
		s2.display();
		s3.display();
	}

}
