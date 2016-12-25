package org.javastud.studm.slide4.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) {
		
		File f = new File("D:\\fstud.txt");
		
		try ( FileReader fr = new FileReader(f); ) {

			int i = 0;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
