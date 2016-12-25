
public class MathTest {
	public static void main(String[] args) {
		double sq = Math.sqrt(4);
		System.out.println(sq);
		
		double z = Math.pow(2, 8);
		System.out.println(z);

		// sin90 = 1
		/*
		 * 180 deg = PI radian
		 * 1 deg = PI/180
		 * 90 deg = PI/180 * 90
		 *     = PI/2
		 */
		double sin90 = Math.sin(Math.PI / 2);
		System.out.println(sin90);
		
		double r = 9.8;
		double roundUpVal = Math.round(r);
		System.out.println("Round up: "+ roundUpVal);
		
		double floorVal = Math.floor(r);
		System.out.println("After Round: " + floorVal); 
	}
}
