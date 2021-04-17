package ReviewSession_Week8;

import java.util.Arrays;

public class TwoDArraysFindTheBigger {

	public static void main(String[] args) {
		/*
		 * Create a method that will accept a 2D int array. Find the biggest number from
		 * each inner array and put them into a separate int array that holds all the
		 * biggest values. Return that array with the biggest values from each inner
		 * array of the 2D array Ex: [ [ 3,12,3,34,12], [13,7,456,34,3], [-5, -24, -2,
		 * -10, -4]] -> [34, 456, -2]
		 */
		int[][] nums = { { 3, 12, 3, 34, 12 }, { 13, 7, 456, 34, 3 }, { -5, -24, -2, -10, -4 } };

		System.out.println(Arrays.toString(biggestValues(nums)));

	}

	public static int[] biggestValues(int[][] arr) {

		int[] biggest = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int max = arr[i][0];
			for (int each : arr[i]) {
				if (each > max) {
					max = each;
				}

			}
			biggest[i] = max;
		}
		return biggest;

	}

}
