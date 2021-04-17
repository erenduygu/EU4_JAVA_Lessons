package reviewSession_Week10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1_NonDuplicatedNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.addAll(Arrays.asList(1, 1, 2, 2, 3, 3));

		ArrayList<Integer> nonDup = new ArrayList<>(); // [1, 2, 3 ]

		for (int each : list2) {
			if (!nonDup.contains(each)) {
				nonDup.add(each);
			}
		}

		System.out.println(nonDup);

		System.out.println("========================================================");
		int[] numbers = { 10, 10, 10, 20, 20, 30, 10, 30, 40, 40, 50 };

		ArrayList<Integer> result = new ArrayList<>(); // [10, 20, 30, 40, 50]

		for (int each : numbers) {
			if (!result.contains(each)) {
				result.add(each);
			}
		}

		System.out.println(result);

	}

}