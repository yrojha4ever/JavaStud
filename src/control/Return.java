package control;

import java.util.Arrays;

public class Return {

	
	public static void main(String[] args) {
		//This program print something..nad do thsi.
		int[] a = { 6, 2, 3 };
		Arrays.sort(a);
		for(int a2 :a )
		System.out.println(a2);
		
		boolean t = true;
		System.out.println("Before the return.");
		if (t)
			return; // return to caller
		System.out.println("This won't execute.");
	}

}
