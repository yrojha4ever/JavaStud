package org.javastud.studm.string;

public class StringTest {

	public static void main(String[] args) {
		
		//c, c++
		char[] c = new char[]{'J','A','V','A'};
		String s = new String(c);
		System.out.println(s);
		
		//-----------
		String s1 = "JAVA world";
		System.out.println(s1);
		
		System.out.println(  s1.length()  ); //10
		System.out.println(  s1.toUpperCase() ); //JAVA WORLD
		System.out.println(  s1.toLowerCase() ); //java world
		System.out.println( s1.substring(5, 8)  );
		
		System.out.println( s1.concat(" Nepal.") );
		System.out.println( s1   +    " Nepal." );
		
		String ss= "   EVEREST IS IN NEPAL     ";
		System.out.println( ss.length() );
		//Trim: remove leading, trailing space
		System.out.println( ss.trim()  .length() );
		
		
		//Immutable class: String
		String str = "APPLE";
		str = str.concat(" & ORANGE");
		System.out.println(str);
		
		String st = "I am" + " a "+ "Java"+ "Programmer.";
		
		//Mutable class: StringBuilder and StringBuffer
		
		StringBuffer sf = new StringBuffer(); //Thread-Safe
		sf.append("APPLE").append(" Banana ").append(" Grapes ");
		sf.append(" & ORANGE");
		sf.insert(5, " MANGO");
		System.out.println(sf);
		
		sf.reverse();
		System.out.println(sf);
		
		StringBuilder sb = new StringBuilder(); //Thread non-safe
		sb.append("APPLE").append(" Banana ").append(" Grapes ");
		sb.append(" & ORANGE");
		sb.insert(5, " MANGO");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		
	}
}
