package ReviewSession_Week8;

import java.util.Arrays;

public class UniquefromArrayString {

	public static void main(String[] args) {

		/*
		 * Create a method that will accept an int array and print out the unique
		 * elements Ex: [1,2,3,1,2,4] -> 3, 4
		 * 
		 * 
		 */

		int[] x = { 1, 2, 3, 1, 2, 4, 5, 5, 5, 6, 2, 3, 4, 8, 9 };

		System.out.println(Arrays.toString(uniqueNumbers(x)));
	}

	public static String[] uniqueNumbers(int[] arr) {

		String uniques = "";
		for (int each : arr) {
			int count = 0;
			for (int eachInner : arr) {

				if (each == eachInner) {
					count++;
				}
			}
			if (count == 1) {
				uniques += each + " ";
			}

		}
		return uniques.split(" ");

	}

}
