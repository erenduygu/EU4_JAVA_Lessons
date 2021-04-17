package day26_arrays_part3;

import java.util.Arrays;

public class StringManupilationArrays {

	public static void main(String[] args) {

		String[] myCar = { "Honda", "Mercedes", "BMW", "Toyota", "Ford " };
		System.out.println(myCar[0].length());
		System.out.println(myCar[1].charAt(2));
		System.out.println(myCar[4].trim());
		System.out.println(myCar[2].substring(2));
		System.out.println(myCar[1].equals(myCar[2]));
		System.out.println(myCar[1] != (myCar[2]));

		System.out.println("-----------------------------------------");

		for (int i = 0; i < myCar.length; i++) {
			System.out.println(myCar[i].length());

		}

		System.out.println("-----------------------------------------");

		String str = "It will display the array of the size";
		String[] arr = str.split(" ");
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		for(String val:arr) {
		System.out.println(val);
		}
		System.out.println("-----------------------------------------");

		System.out.println(arr[2]);
	}

}
