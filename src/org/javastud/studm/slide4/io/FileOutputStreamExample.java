package org.javastud.studm.slide4.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("D:\\stud.txt");
		
		String str = "Java Developers of Nepal.";
		byte[] b = str.getBytes();
		
		fout.write(b);
		fout.close();
		
		System.out.println("Information is saved in file...");
		
	}
}
