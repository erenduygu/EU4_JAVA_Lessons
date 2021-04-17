package day31_arrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

// Languages
		
		ArrayList<String> languages=new ArrayList<>();
		
		languages.add("Turkish");
		languages.add("English");
		languages.add("Japanese");
		languages.add("Spanish");
		languages.add("German");
		languages.add("Arabic");

		
		
		System.out.println("Number of values: "+languages.size());
		System.out.println(languages.toString());
		System.out.println(languages.get(0));
		System.out.println(languages.get(2));
		languages.remove(0);
		languages.remove(1);

		System.out.println(languages.toString());

		
		
	}

}
