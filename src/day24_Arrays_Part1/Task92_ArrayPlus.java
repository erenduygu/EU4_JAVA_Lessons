package day24_Arrays_Part1;

import java.util.Arrays;

public class Task92_ArrayPlus {

	public static void main(String[] args) {

	
		int[] myArray=new int[10];
		
		int sum=0;
		
		for (int i = 0; i < myArray.length; i++) {
			sum=sum+19;
			myArray[i]=sum;
			System.out.println(myArray[i]);
			
		}System.out.println(Arrays.toString(myArray));
	}

}

