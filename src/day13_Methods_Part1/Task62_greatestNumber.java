package day13_Methods_Part1;

public class Task62_greatestNumber {

	public static void main(String[] args) {

		greatest(57,65,89);
	}

	public static void greatest(int number1, int number2, int number3) {
		if (number1 > number2 && number1 > number3) {
			System.out.println("The greatest number is " + number1);
		}

		if (number2 > number1 && number2 > number3) {
			System.out.println("The greatest number is " + number2);
		}

		if (number3 > number1 && number3 > number2) {
			System.out.println("The greatest number is " + number3);
		}

	}

}
