package assignments;

public class Assignment1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum= sum + Integer.parseInt(args[i]);
		}
		double avg= sum/args.length;
		
		System.out.println("Sum: " + sum + "  Avg: "+ avg);
		
	}
}
