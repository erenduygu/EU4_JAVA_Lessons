package reviewSession_Week10;

public class Arrays1_EvenandOddNumbers {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int countEven = 0;
		int countOdd = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {
				countEven++;
				continue;
			} 
				countOdd++;
			
		}

		System.out.println("Even Numbers: " + countEven);
		System.out.println("Odd Numbers: " + countOdd);

	}

}
