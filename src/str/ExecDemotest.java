package str;

import java.io.IOException;

public class ExecDemotest {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		Process p = null;
		try {
			p = r.exec("notepad");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error executing notepad.");
		}
	}

}
