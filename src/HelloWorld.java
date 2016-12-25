public class HelloWorld {

	static public void main(String[] args) {
		System.out.println("HELLO WORLD");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		int i = Integer.parseInt(args[2]);
		System.out.println(i);
	}

}