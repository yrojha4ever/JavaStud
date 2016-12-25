package org.javastud.studm.slide4.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
	public static void main(String[] args) throws IOException {
		
		String path = "D:"+ File.separator +"stud.txt";
		
		FileInputStream fin = new FileInputStream(path);

		int i = 0;
		while (  (i = fin.read())  != -1) {
			System.out.print( (char) i);
		}

		fin.close();

	}
}
