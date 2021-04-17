package day24_Arrays_Part1;

import java.util.Arrays;
import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] hour = new int[5];

		System.out.println("Please enter the hour for employees");
		
		for (int i = 0; i < hour.length; i++) {
			hour[i] = scan.nextInt();	
		}
		
		System.out.println("Please enter the hourly wage");
		int wage=scan.nextInt();

		int grossPay=0;
		
		for (int i = 0; i < hour.length; i++) {
			grossPay=hour[i]*wage;
			System.out.println("Employee #"+(i+1)+" $ "+grossPay);
		}
		
		
		
	}

}
