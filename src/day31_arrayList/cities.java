package day31_arrayList;

import java.util.ArrayList;

public class cities {

	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<>();

		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Bakü");
		cities.add("Berlin");
		cities.add("Bakü");

		System.out.println(cities.toString());

		System.out.println("-----------------------------");

		// Print each city by using for each Loop and seperate by space,

		for (String each : cities) {
			System.out.println(each + " ");

		}
		System.out.println("-----------------------------");
		// Print each city by using for-iterarot Loop and seperate by space,

		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));

		}

		System.out.println("-----------------------------");

		System.out.println("Removing Bakü");

		cities.remove("Bakü");
		cities.remove("New York");

		System.out.println(cities.toString());

		System.out.println("-----------------------------");

		cities.add(1, "Istanbul");
		cities.add("Istabul");
		cities.add(0, "Arlington");

		System.out.println(cities.toString());

		System.out.println("-----------------------------");

		int idx = cities.indexOf("Istanbul");
		System.out.println(idx);

		System.out.println("-----------------------------");

		int idx1 = cities.indexOf("Bursa");
		System.out.println(idx1);

		System.out.println("-----------------------------");

		System.out.println(cities.indexOf("DC"));

		System.out.println("-----------------------------");

		System.out.println(cities);

	}

}
