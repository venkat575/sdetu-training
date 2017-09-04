package datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		// 1. Create a collection
		List<String> cities = new ArrayList<String>();
		
		// 2. Add some elements
		cities.add("Cleveland");
		cities.add("Toronto");
		cities.add("Chicago");
		cities.add("Miami");
		cities.add("New York");
		cities.add("Minneapolis");
		cities.add("Denver");
		
		// 3. Use an Iterator
		Iterator<String> itr = cities.iterator();
		
		/*
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		*/
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		doIteration(cities);

	}
	
	public static void doIteration(List<String> list) {
		// 4. Use List Iterator
		ListIterator<String> litr = list.listIterator();
		
		while (litr.hasNext()) {
			String element = litr.next();
			litr.set("City: " + element);
		}
		
		System.out.println(list);
		
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
	}

}
