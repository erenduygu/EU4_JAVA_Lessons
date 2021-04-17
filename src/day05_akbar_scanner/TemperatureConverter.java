package day05_akbar_scanner;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner convert= new Scanner(System.in);
		
		System.out.println("what is the temperature in F? ");
		
		
		double fahrenheit= convert.nextDouble();
		
		double celcius= (5.0/9)*(fahrenheit-32);
		
		System.out.println("fahrenheit "+fahrenheit+" is "+ celcius+" in celcius");

		
	}

}
