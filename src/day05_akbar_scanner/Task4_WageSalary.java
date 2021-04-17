package day05_akbar_scanner;

import java.util.Scanner;

public class Task4_WageSalary {

	public static void main(String[] args) {

		
		
		//Task4---Creating an interactive program to ask user for hourly wage
		//and generate yearly salary.
		
		Scanner salary= new Scanner(System.in);
		
		System.out.println("What is your horly wage?");
		
		int hourly= salary.nextInt();
		int yearly=hourly*8*30*12;
		
		
		System.out.println("Your Yeraly salary is "+yearly);
		
		
	}

}
