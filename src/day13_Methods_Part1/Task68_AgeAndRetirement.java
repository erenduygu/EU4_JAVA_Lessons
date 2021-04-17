package day13_Methods_Part1;

public class Task68_AgeAndRetirement {

	public static void main(String[] args) {

	

		yearsUntilRetirement("\"Mike\",",1970);
	}

	public static int calculateAge(int yearBirth, int currentYear) {

		return currentYear - yearBirth;

	}

	public static void yearsUntilRetirement(String name, int year) {
		int retirementAge = 65 - calculateAge(year,2020);

		System.out.println(name + " retires in " + retirementAge + " years ");
	}
}
