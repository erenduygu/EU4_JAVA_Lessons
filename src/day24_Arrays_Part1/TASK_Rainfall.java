package day24_Arrays_Part1;

import java.util.Arrays;
import java.util.Scanner;

public class TASK_Rainfall {

	public static void main(String[] args) {

		int[] rainfall = new int[12];

		getValues(rainfall);

		totalArray(rainfall);
	}

	public static void getValues(int[] rainfall) {

		Scanner scan = new Scanner(System.in);
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println("Please enter in the following rainfall for the months ahead:\nMonth\tRainfall (In inches)");
		for (int i = 0; i < months.length; i++) {
			System.out.print(months[i] + ":");
			rainfall[i] = scan.nextInt();

		}
	}

	private static void totalArray(int[] rainfall) {
		int total = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int value : rainfall) {
			total += value;

			if (value > max) {
				max = value;
			}
			if (value < min) {
				min = value;
			}

		}
		int average = total / rainfall.length;
		System.out.println("The sum of all the rain is: " + total + " inches");
		System.out.println("The average rainfall was: " + average + " inches");
		System.out.println("The max rain is: " + max + " inches");
		System.out.println("The min rain is: " + min + " inches");
	

	}

	private static void averageArray(int[] rainfall) {
		int total = 0;
		for (int value : rainfall) {
			total += value;

		}
		System.out.print("The sum of all the rain is:" + total + "inches");

	}

}
