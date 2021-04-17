package day24_Arrays_Part1;

import java.util.Scanner;

public class Task87_DaysArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		String[] days=new String[7];
		
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		days[3]="Thirsday";
		days[4]="Friday";
		days[5]="Saturday";
		days[6]="Sunday";
		
		System.out.println("Please enter your day index:");
		int dayNumber = scan.nextInt();

		
		System.out.println("Today is "+days[dayNumber-1]);
	}

}
