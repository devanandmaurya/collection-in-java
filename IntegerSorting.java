package usingstatic.method.sort;

import java.util.ArrayList;
import java.util.Collections;

import mutilitypackage.com.MyUtlil;

public class IntegerSorting {

	public static void main(String[] args) {

		ArrayList<Integer> arl = new ArrayList<>();

		arl.add(21);
		arl.add(6);
		arl.add(50);
		arl.add(5);
		MyUtlil.iteratelist(arl);  ////iteratelist () is a static method call from class name MyUtill class
		Collections.sort(arl);
		System.out.println("afer int sort is::");
		MyUtlil.iteratelist(arl);
	
	}
}
