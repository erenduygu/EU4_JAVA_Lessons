package ReviewSession_Week8;

public class UniqueNumbers {

	public static void main(String[] args) {

		/*
		 * Create a method that will accept an int array and print out the unique
		 * elements Ex: [1,2,3,1,2,4] -> 3, 4
		 * 
		 * 
		 */

		int[] x = { 1, 2, 3, 1, 2, 4, 5, 5, 5, 6, 2, 3, 4, 8, 9 };

		uniqueNumbers(x);

	}

	public static void uniqueNumbers(int[] arr) {

		for (int each : arr) {
			int count = 0;
			for (int eachInner : arr) {

				if (each == eachInner) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(each);
			}

		}

	}

}
