package day31_arrayList;

import java.util.ArrayList;

public class shoppingList {

	public static void main(String[] args) {
		ArrayList<String> shoppingList = new ArrayList<>();

		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");

		// print number of items

		System.out.println(shoppingList.size() + " items");

		System.out.println("------------------");

		// print all items in single line

		System.out.println(shoppingList.toString());
		System.out.println("------------------");

		// print first and last items in single line

		System.out.println(shoppingList.get(0) + "|" + shoppingList.get(shoppingList.size() - 1));
		System.out.println("------------------");

		// remove paper towel

		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");

		System.out.println(shoppingList);
		System.out.println("------------------");
		System.out.println(shoppingList.toString());
		System.out.println("------------------");

		System.out.println(shoppingList.get(0));
		System.out.println("------------------");
		shoppingList.remove(0);
		System.out.println(shoppingList);
		System.out.println("------------------");

		// print each items

		for (String each : shoppingList) {
			System.out.println(each);
		}

		// print each items

		shoppingList.clear();
		System.out.println(shoppingList.toString());

	}

}
