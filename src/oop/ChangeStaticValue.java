package oop;

public class ChangeStaticValue {
	int						rollno;
	String					name;
	private static String	college	= "TRICHANDRA";

	public static void change( String collegeName ) {
		college = collegeName;
	}

	ChangeStaticValue( int rollno, String name ) {
		this.rollno = rollno;
		this.name = name;
	}

	void display( ) {
		System.out.println( rollno + " " + name + " " + college + "\n" );
	}

	public static void main( String args[] ) {

		ChangeStaticValue s1 = new ChangeStaticValue( 111, "Amrit" );
		s1.display( );

		ChangeStaticValue.college = "ASCOL";
		ChangeStaticValue s2 = new ChangeStaticValue( 222, "Devid" );
		ChangeStaticValue s3 = new ChangeStaticValue( 333, "Lewis" );

		s1.display( );
		s2.display( );
		s3.display( );

	}

}
