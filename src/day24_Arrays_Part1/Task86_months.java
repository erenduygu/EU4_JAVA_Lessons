package day24_Arrays_Part1;

import java.util.Scanner;

public class Task86_months {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int monthIndex = scan.nextInt();

		String[] months = new String[12];
		months[0] = "January";
		months[1] = "Febuary";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "June";
		months[6] = "July";
		months[7] = "August";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11] = "December";

		System.out.println("The month name is " + months[monthIndex-1]);


	}

}
