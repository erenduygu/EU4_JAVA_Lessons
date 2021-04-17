package day05_akbar_scanner;

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {


		//Task3---Creating an interactive program to ask user for day
		//and generate minute that day have.
		
			
		Scanner zaman= new Scanner(System.in);
		
		System.out.println("How many days do you have : ");
		
		int days=zaman.nextInt();
		
		int minutes=days*24*60;
		
		System.out.println("You have "+minutes+ " minutes.");

	}

}
