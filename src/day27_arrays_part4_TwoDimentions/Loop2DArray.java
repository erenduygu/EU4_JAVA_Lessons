package day27_arrays_part4_TwoDimentions;

import java.util.Arrays;

public class Loop2DArray {

	private static long[] columnData;

	public static void main(String[] args) {

		int[][] numbers = { { 1, 2, 3 }, { 4, 5 }, { 7, 8, 9 } };

		String comma="";
		System.out.print("[");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(comma+numbers[i][j]);
				comma=",";
			}		

		}System.out.println("]");
		
		System.out.println("---------------------------------");
		
		int[][] data= {{12,5,4},{23,113,32}};
		
		for (int i = 0; i < data.length; i++) {
			System.out.print("*******Row "+i+" : ");
			System.out.println(Arrays.toString(data[i]));

			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j]+" ");
			}System.out.println("");
		}
		
		int [] nums= {10,9,5,6};
		System.out.println(Arrays.toString(nums));
		
		System.out.println(Arrays.toString(data[0]));
		System.out.println(Arrays.toString(data[1]));
		System.out.println("---------------------------");
		
		for(int[] rows:data) {
			System.out.println("*******Row : ");
			for(int columnData:rows) {
				System.out.print(columnData+" ");
			}System.out.println("  ");
		}
	}

}
