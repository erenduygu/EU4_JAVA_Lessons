package day24_Arrays_Part1;

import java.util.Random;

public class Task91_TenRandomElement {

	public static void main(String[] args) {

		Random rn = new Random();

		int[] myArray = new int[10];

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = rn.nextInt(100);
			System.out.println(myArray[i]);
			System.out.println(myArray.length);

		}

	}

}





