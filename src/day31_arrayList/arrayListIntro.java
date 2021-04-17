package day31_arrayList;

import java.util.ArrayList;

public class arrayListIntro {

	public static void main(String[] args) {

// Creating an ArrayList
		
		ArrayList<String> names=new ArrayList<>();
		System.out.println(names);
		
		ArrayList<Integer>nums=new ArrayList<>();
		System.out.println(nums);
		
		// Assignin a value to ArrayList
		
		names.add("Mike, Paul");
		names.add("Smith");
		names.add("John");
		names.add("Emmy");
		names.add("Evan");
		
		System.out.println(names);
		
		nums.add(99);
		nums.add(656);
		nums.add(new Integer("100"));
		System.out.println(nums);

		
		// Reading from value to ArrayList
		
		System.out.println(names.get(0));
		
		System.out.println(nums.get(0));
		System.out.println(names.get(2));
		System.out.println("Names count: "+names.size());
		System.out.println("Nums count: "+nums.size());


		
	}

}
