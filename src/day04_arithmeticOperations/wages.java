package day04_arithmeticOperations;

public class wages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double regularWage;// The calculated regular wage
		
		double basePay=25; // The base pay
		
		double regularHours=40;//The hours worked less overtime
		
		double overTimeWages;// Overtime Wages
		
		double overTimePay=37.5; //Overtime Pay rate
		
		double overTimeHours=10;
		
		double totalWage, //Total Wage
		
		regularWages=basePay*regularHours;
		overTimeWages=overTimePay*overTimeHours;
		totalWage=regularWages+overTimeWages;

		System.out.println("Wages for this week are € "+ totalWage);
		
	}

}
