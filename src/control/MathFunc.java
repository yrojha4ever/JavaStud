package control;

public class MathFunc {

	public static void main(String[] args) {

		String s = "Java";
		s = s.concat(" World");

		String h = "HELLO";
		int leng = h.length();
		System.out.println(leng);

		System.out.println(h.substring(0, 3));

		System.out.println(h);

		String t = "Broadway  ";
		System.out.println("Length of Broadway: " + t.length());

		t = t.trim();
		System.out.println("Length of Broadway after Trim: " + t.length());

		System.out.println(t.indexOf('d'));

		System.out.println("HEllo".equalsIgnoreCase("hello"));
		System.out.println("HEllo".equals("hello"));
		
		System.out.println("C:\\TEMP");
		
		

	}
}
