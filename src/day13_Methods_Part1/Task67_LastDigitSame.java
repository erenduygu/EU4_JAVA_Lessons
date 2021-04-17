package day13_Methods_Part1;

public class Task67_LastDigitSame {

	public static void main(String[] args) {

		if (lastDigit(7, 23)) {
			System.out.println("They have the same last digit");
		} else {
			System.out.println("They don't have the same last digit");
		}
	}

	public static boolean lastDigit(int num1, int num2) {

		if (num2 % 10 == num1 % 10) {
			return true;
		} else {
			return false;
		}

	}

}
