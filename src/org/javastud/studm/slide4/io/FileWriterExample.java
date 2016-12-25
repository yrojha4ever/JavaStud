package org.javastud.studm.slide4.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("D:\\fstud.txt");
		fw.write("Java Developres in नेपाल. \n Running chapter: File Handling...");
		fw.close();

		System.out.println("File fstud is created...");

	}
}
