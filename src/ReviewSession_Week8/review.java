package ReviewSession_Week8;

import java.util.Arrays;
import java.util.Random;

public class review {

	public static void main(String[] args) {

		int[] nums = new int[3];

		nums[0] = 5;
		nums[1] = 3;
		nums[2] = -12;

		System.out.println(Arrays.toString(nums));

		String str = "fox ran down the hill";
		str.split(" ");
		System.out.println(Arrays.toString(str.split("down")));

		int[][] table = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(table[0][0]);

		Random number = new Random();
		int x = number.nextInt(10);
		System.out.println(x);
	}

}
