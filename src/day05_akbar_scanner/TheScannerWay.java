package day05_akbar_scanner;

import java.util.Scanner;


public class TheScannerWay {

	public static void main(String[] args) {

		//ask user for the name
		// and capture the result
		// print your name 
		//ask user for the birth year
		// and capture the result
		// print the age 
		//ask user for the height
		// and capture the result
		// print your height!! 
		
		//Create scanner object
		// You can name your variable whatever you want
		// in below we are calling it as scan
		
		Scanner scan=new Scanner(System.in);
		//Scanner is data type, scan is the name, new Scanner (System.in) is the value
		
			
		System.out.println("What is your name : ");
		//String name="Sam";
	
		String name=scan.next();
		
		System.out.println("My name is : "+ name +"\n");
		
		System.out.println("What is your birth year : ");
		
		int birthYear= scan.nextInt();
		
		int age=2020-birthYear;
		
		System.out.println("My age is : "+ age+"\n");

		
		System.out.println("What is your height : ");
		
		double height= scan.nextDouble();
		

		System.out.println("My height is : "+ height);

		
		
		
		
		
	}

}
