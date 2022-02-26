package mutilitypackage.com;

import java.util.ArrayList;

public class MyUtlil {

/*	public MyUtlil() {
		System.out.println("all output come from myutil class having static generic method");

	}*/

	public static <T> void iteratelist(ArrayList<T> arll) {
		for (T ab : arll) {

			System.out.println(ab);
			
		}
	}
}
/*
 * public static void iterateList(ArrayList<Integer> arl) { for (Integer a :
 * arl) {
 * 
 * System.out.println(a); }
 */

// THE ABOVE CONCEPT IS CALLED GENERIC CONCEPT