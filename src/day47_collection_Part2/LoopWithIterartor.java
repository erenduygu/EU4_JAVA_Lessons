package day47_collection_Part2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class LoopWithIterartor {

	public static void main(String[] args) {

		List<Integer> numSet = new ArrayList<>();

		numSet.add(50);
		numSet.add(543);
		numSet.add(1150);
		numSet.add(550);
		numSet.add(570);
		numSet.add(93);
		numSet.add(5000);
		numSet.add(950);

		
		// create iterator object

		Iterator<Integer> it = numSet.iterator();

		// call hasNext method
		// hasNext return true, if there is still next value
		// return false when it reaches the end or empty

		System.out.println("it.hasNext(): " + it.hasNext());
		System.out.println("it.next(): " + it.next());
		System.out.println("it.next(): " + it.next());
		System.out.println("it.next(): " + it.next());

		System.out.println("=======================================");

		while (it.hasNext()) {
			System.out.print(it.next() + " | ");
		}

		// System.out.println("it.next(): "+it.next());
		System.out.println("=======================================");

		Iterator<Integer> it1 = numSet.iterator();

		while (it1.hasNext()) {
			int val = it1.next();
			if (val > 1000) {
				it1.remove();
			}
		}
		System.out.print(numSet.toString());

		List<String> cities = new ArrayList<>();

		cities.add("New York");
		cities.add("Boston");
		cities.add("Virginia");
		cities.add("DC");

		/*
		for (String city : cities) {
			if (city.equals("Boston")) {
				cities.remove(city);
			}
		}
		*/
		System.out.println("=======================================");

		cities.removeIf(n -> n.equals("Boston"));
		cities.forEach(n -> System.out.print(n+" | "));

	}

}
