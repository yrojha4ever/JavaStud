
public class TypeConvCasting {
	public static void main(String[] args) {
		// No1. Auto Conversion
		int n = 123456;
		float f = n;
		System.out.println(n + " " + f);

		// No2. Type Casting incompatible (data loss) types
		double x = 98.6;
		int i = (int) x; // 98
		System.out.println(x + "  " + i);
		
		long l = 4500L;
		int in = (int)l; //small destination type
		System.out.println(l + " "+ in);
		
		//No 3: Automatic Type Promotion
		byte b = 50;
		b = (byte) (b * 2); //int -> 100 //  (byte: -128, + 127)
		System.out.println(b);
		
		//No4: Type Promotion Rule:
		int ii  = 524;
		float fl = 5.68f;
		float result = ii * fl; //int * float => float
		int resul = (int)(ii * fl);
		System.out.println(result + "  "+ resul);

	}
}
