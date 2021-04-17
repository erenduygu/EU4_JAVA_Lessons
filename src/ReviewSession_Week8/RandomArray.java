package ReviewSession_Week8;

import java.util.Arrays;

// pic package, import,class

import java.util.Random;

public class RandomArray {
	

	public static void main(String[] args) {

		
		System.out.println(Arrays.toString(generateRandomArray(5)));
	}

	public static int[] generateRandomArray(int size) {

		Random num = new Random();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i]=num.nextInt(101);
			
			

		}
		return arr;

	}

}
