package org.javastud.studm.slide4.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamExample {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("D:\\bstud.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		
		String str = "Java Developres in Nepal. \nRunning Chapter: File Handling..";
		byte[] b = str.getBytes();
		
		bout.write(b);
		bout.flush();
		
		bout.close();
		fout.close();
		
		System.out.println("File created ..");
		
	}
}
