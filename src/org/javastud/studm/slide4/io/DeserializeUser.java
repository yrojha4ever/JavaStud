package org.javastud.studm.slide4.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeUser {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fin = new FileInputStream("D:\\user.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		
		User usr = (User)oin.readObject();
		
		oin.close();
		fin.close();
		
		System.out.println(usr);
		
	}
}
