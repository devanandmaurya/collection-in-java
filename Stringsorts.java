package usingstatic.method.sort;

import java.util.ArrayList;
import java.util.Collections;

import mutilitypackage.com.MyUtlil;

public class Stringsorts {

	public static void main(String[] args) {

		ArrayList<String> arll = new ArrayList<>();

		arll.add("ram");
		arll.add("kumar");
		arll.add("vijay");
		arll.add("devanand");

		MyUtlil.iteratelist(arll);
		Collections.sort(arll);
		System.out.println("afer string sort is::");

		MyUtlil.iteratelist(arll);
	}
}
