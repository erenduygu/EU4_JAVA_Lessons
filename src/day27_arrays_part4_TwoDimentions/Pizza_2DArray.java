package day27_arrays_part4_TwoDimentions;

import java.util.Arrays;

public class Pizza_2DArray {

	public static void main(String[] args) {
		String[][] pizzas = { { "pineapples", "pepperoni" }, { "anchovies", "mushroom", "olives" }, { "4 cheese" },
				{ "chicken", "tomatoes", "onions" }, { "green peppers", "zucchini", "broccoli", "spinach", "shrimp" }

		};

		System.out.println(Arrays.toString(pizzas[0]));

		System.out.println("-------FOR_EACH_LOOPS------");

		for (String[] each : pizzas) {
			System.out.print(each.length + "_");
			System.out.println(Arrays.toString(each));
		}

		System.out.println("-------FOR_LOOPS------");

		for (int i = 0; i < pizzas.length; i++) {
			System.out.print(pizzas[i].length+"_");
			System.out.println(Arrays.toString(pizzas[i]));

		}

		/*
		 * System.out.println("------------------------");
		 * 
		 * for (int i = 0; i < pizzas.length; i++) { for (int j = 0; j <
		 * pizzas[i].length; j++) { System.out.println(pizzas[3][j]);
		 * 
		 * }
		 */
		System.out.println("------------------------");

		for (String each : pizzas[3]) {

			System.out.println((each));
		}

		System.out.println("------------------------");

		int[][] student = { { 4, 5, 6 }, { 12, 5, 7 }, { 23, 56, 12, 55, 3 } };

		for (int[] group : student) {

			System.out.println(Arrays.toString(group));

		}
		System.out.println("------------------------");
		System.out.println("------------------------");

		for (int[] group : student) {
			for (int studentID : group) {
				System.out.println(studentID);

			}
		}
		
		
		
		
		
		
		
		
		
	}
}
