package day13_Methods_Part1;

public class Task71_calcFeetAndInchesToCentimeters {

	public static void main(String[] args) {
	//calcFeetAndInchesToCentimeters(100);
	calcFeetAndInchesToCentimeters(1,100);
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

		if (feet >= 0 && inches >= 0 && inches <= 12) {
			
			
			double cm = (feet * 12*2.54) + (inches * 2.54);
			System.out.println(feet+" feet, "+inches+" inches= "+ cm+" centimeters");
			
			return cm;
		} else {
			System.out.println("Invalid feet or inches");
			return -1;
		}
	}	public static double calcFeetAndInchesToCentimeters( double inches) {

		if (inches >= 0) {

			double feet = (int)inches/12;
			double remainingInches=inches%12;
			System.out.println(inches+" inches= "+ feet+" feet,"+remainingInches+" inches");

			return calcFeetAndInchesToCentimeters(feet, remainingInches);
		} else {
			System.out.println("Invalid feet or inches");

			return -1;
		}
	}
}
