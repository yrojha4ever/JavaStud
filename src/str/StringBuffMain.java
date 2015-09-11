package str;

public class StringBuffMain {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("HELLO ");
		buffer.append("JAVA");

		String str = buffer.toString();
		System.out.println(buffer); //buffer.toString()
		
		StringBuilder builder = new StringBuilder();
		builder.append("HELLO ");
		builder.append("JAVA");
		System.out.println(builder);
		
		Integer inte = new Integer("25");
		Integer integ = Integer.parseInt("25");
		Integer integr = Integer.valueOf("25");
		
		int a = inte;
		System.out.println(a);
		inte = a;
		System.out.println(inte);
		
		System.out.println(  Integer.toHexString(inte)   );
		
		
		Double d = 10.8;
		int ab = d.intValue(); //(int)d;
		Float f = d.floatValue();
		byte b = (byte)ab;
		
		
	}

}
