package org.javastud.studm.slide4.io;

import java.io.File;

public class FileExample {
	public static void main(String[] args) {
		File f = new File("D:\\JavaStud");

		System.out.println("Exist: " + f.exists());

		System.out.println("Is Folder: " + f.isDirectory());

		System.out.println("Is File: " + f.isFile());

		System.out.println("Full Path: " + f.getAbsolutePath());

		//List file names.
		for (File file : f.listFiles()) {
			System.out.println(file.getName());
		}

		// Create Folder:
		File fDir = new File("D:\\JavaStud\\NCIT");
		fDir.mkdir();

	}

}
