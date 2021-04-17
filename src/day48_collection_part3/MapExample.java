package day48_collection_part3;

import java.util.HashMap;
import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		
		List<Integer> items2=new ArrayList<>();
		items2.add(10);
		System.out.println(items2.get(0));
		
		
		Map<String, Double> items = new HashMap<>();
		items.put("apple", 3.49);
		items.put("flowers", 10.99);
		items.put("egg", 4.49);
		items.put("Milk", 6.0);
		items.put("cherries", 5.99);
		items.put("apple", 5.49);

		
		System.out.println(items.size());
		
		System.out.println(items.toString());
		System.out.println(items.isEmpty());
		System.out.println(items.get("apple"));
		System.out.println(items.get("Milk"));
		
		items.remove("flowers");
		
		System.out.println(items.toString());
		
		System.out.println(items.containsKey("apple"));
		
		items.remove("egg",3.5);
		System.out.println(items.get("egg"));
		
		items.replace("cherries", 5.99, 7.99);
		System.out.println(items.get("cherries"));
		
		items.replace("cherries",items.get("cherries")+4);
		System.out.println(items.get("cherries"));

		


		
		


	}

}
