package day27_arrays_part4_TwoDimentions;

import java.util.Arrays;

public class Length {

	public static void main(String[] args) {

		int[][] numbers = {

				{ 1, 2, 3, 4 }, 				//row 0 
				{ 5, 6 },						//row 1
				{ 9, 10, 11, 123, 30, 50, 60 }	//row2

		};//display the number of rows
		System.out.println(numbers.length);
		System.out.println(numbers[2].length);
		System.out.println(numbers[2][4]);
		
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("number of colums of row #"+i+" is "+numbers[i].length);
		}
			for (int i1 = 0; i1 < numbers.length; i1++) {
				for (int j = 0; j < numbers[i1].length; j++) {
					System.out.print(numbers[i1][j]+",");
				}
			}
			
	
	}

}
