package org.javastud.studm.slide4.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInputStreamExample {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:\\bstud.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		
		int i = 0;
		while ((i = bin.read()) != -1) {
			System.out.print((char) i);
		}
		
		bin.close();
		fin.close();
		
	}
}
