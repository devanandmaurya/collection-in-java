package com.map.dkd.durgasoft;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args) {
	
		
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("deva", 100);
		m.put("ajay", 10);
		m.put("arpna", 20);// dublicate key arpna not allows that is override it
		m.put("arpna", 30);
		m.put("vishal", 40);
		m.put("anju", 50);
		System.out.println(m);

		System.out.println(m.put("devanand", 1200));
		Set<String> s = m.keySet();
		System.out.println("key is :" + s);
		Collection<Integer> c = m.values();
		System.out.println("value is :"+c);
		Set<?> ss = m.entrySet();
		Iterator<?> ite = ss.iterator();
		while (ite.hasNext()) {
			@SuppressWarnings("unchecked")
			Map.Entry<?, Integer> mm = (Entry<?, Integer>) ite.next();
			
			System.out.println(mm.getKey() + " =" + mm.getValue() + " = " + mm.getClass());
			if (mm.getKey().equals("devamauryab")) {
				mm.setValue(345);

			}
			System.out.println(m);
		}

	}
}
