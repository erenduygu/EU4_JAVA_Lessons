package ReviewSession_Week8;

import java.util.Arrays;
import java.util.Random;

public class CoinFlips {

	public static void main(String[] args) {
		/*
		 * 
		 * Create a method that will accept a number of how many coin flips you want to
		 * have. Return a String array with the result of the coin flips (Head - H or
		 * Tails - T). The coin flip will be random so use the Random class and some
		 * addtional logic to get the result. Ex: 5 -> ["H", "T", "T", "T", "H"] Ex: 3
		 * -> ["T", "T", "H"] Ex: 3 -> ["H", "T", "T"]
		 */

		int x = 10;

		System.out.println(Arrays.toString(coinFlip(x)));

	}

	public static String[] coinFlip(int num) {

		Random rn = new Random();
		String[] results = new String[num];

		for (int i = 0; i < results.length; i++) {
			int number = rn.nextInt(2);

			// H-0, T-1

			if (number == 0) {
				results[i] = "H";
			} else {
				results[i] = "T";
			}
		

		}
		return results;

	}
}
