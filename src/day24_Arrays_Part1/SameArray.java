package day24_Arrays_Part1;

import java.util.Arrays;

public class SameArray {

	public static void main(String[] args) {

		int[] Array1 = { 2, 4, 6, 8 };

		int[] Array2 = Array1;

		Array1[0] = 200;
		Array2[3] = 1000;
		System.out.println(Arrays.toString(Array1));
		
		for(int value:Array1) {
			System.out.print(value+" ");
		}			System.out.println();

		for(int value:Array2) {
			System.out.print(value+" ");
		}
		
		
		
	}

}

