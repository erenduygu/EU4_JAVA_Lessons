package day26_arrays_part3;

import java.util.Scanner;

public class MethodArrays2FinCarHonda {

	public static void main(String[] args) {

		
			System.out.println(findCar(4, "Honda"));
	}

	public static String[] createArray(int arraySize) {
		Scanner scan = new Scanner(System.in);
		String[] myArray = new String[arraySize];
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Please enter your car " + (i + 1) + " name:");
			myArray[i] = scan.next();

		}
		return myArray;

	}

	public static boolean findCar(int value, String toFindCar) {
		for (String car : createArray(value)) {
			if (car.equalsIgnoreCase(toFindCar)) {
				return true;
			}

		}
		return false;
	}
}