package str;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("Java");
		System.out.println(sb);

		StringBuffer sf = new StringBuffer("Hello");
		sf.append("Java");
		System.out.println(sf);

	}
}
