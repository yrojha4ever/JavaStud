package str;

public class ExecDemo {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		Process p = null;
		try {
			p = r.exec("calc");
		} catch (Exception e) {
			System.out.println("Error executing notepad.");
		}
	}
	
}
