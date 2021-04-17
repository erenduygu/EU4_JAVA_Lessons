package ReviewSession.Week3;

import java.util.Scanner;

public class ScannerBMIFormula {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		/*The formula is BMI = kg/m2 where kg is a person's weight in kilograms 
		 * and m2 is their height in metres squared. A BMI of 25.0 or more is overweight, 
		 * while the healthy range is 18.5 to 24.9.*/
		
		System.out.println("Please enter your weight in kilogram:");
		double weight= scan.nextDouble();
		System.out.println("Please enter your height in meter:");
		double height=scan.nextDouble();
		
		
		double bmi= weight/(height*height);
		
		System.out.println("Your BMI is:"+bmi);
		
		if (bmi<18.5) {
			System.out.println("You are underweight");

		}
		if (bmi<18.5) {
			System.out.println("You are underweight");

		}else if (bmi>=18.5&&bmi<24.9) {
			System.out.println("You are normal");

		} else if (bmi>=25) {
		System.out.println("You are overweight");

	}
	
		
	}

}
