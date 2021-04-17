package day13_Methods_Part1;

public class birthyear {

	public static void main(String[] args) {

		ageCalculator(1980, 2020);
		ageCalculator(1980, 2050);
	}

	public static void ageCalculator(int birthYear, int year) {
		int age = year - birthYear;
		
		System.out.println(age);
	}

}
