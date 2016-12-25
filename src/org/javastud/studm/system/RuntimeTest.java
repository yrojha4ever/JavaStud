package org.javastud.studm.system;

import java.io.IOException;

public class RuntimeTest {
	public static void main(String[] args) throws IOException {

		// Factory Method.
		Runtime r = Runtime.getRuntime(); // new Runtime();
		r.exec("cmd.exe /c start dir");
		//r.exec("notepad");

	}
}
