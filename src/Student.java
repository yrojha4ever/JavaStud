
/**
 * Class: Student
 *	This class print
 *  student course
 *  information
 *  
 *  @author ojhay
 *  @author ram
 */
public class Student {
	public static void main(String[] args) {
		Course c = new Course();
		c.showJavaCourse();
		c.showAdvJava();
		c.jCourse = "Java Script";
		c.showJavaCourse();

		/*
		 ----------------
		  Create object of class
		  course and show it.
		  -----------------
		 */
		System.out.println("=========");
		Course c2 = new Course();
		c2.showJavaCourse();
		
		//print value of pi
		System.out.println("==========");
		System.out.println(Course.PI); //PI
		
		
		String x = "Java";
		if( x instanceof String){
			System.out.println("X is String ");
		}
		

	}
}
