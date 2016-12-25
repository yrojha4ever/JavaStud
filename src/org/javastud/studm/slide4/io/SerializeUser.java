package org.javastud.studm.slide4.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeUser {
	public static void main(String[] args) throws IOException {
		
		User usr = new User(55, "DEVID");
		
		FileOutputStream fos = new FileOutputStream("D:\\user.txt");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		
		out.writeObject(usr);
		out.flush();
		out.close();
		
		System.out.println("Use saved in file user.txt");
		
	}
}
