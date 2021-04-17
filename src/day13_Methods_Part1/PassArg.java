package day13_Methods_Part1;

public class PassArg {

	public static void main(String[] args) {

		int x = 50;
		displayValue(10);
		displayValue(x);
		displayValue(x * 4);
	}

	private static void displayValue(int num1) {
		System.out.println("The value is " + num1);

	}

	private static void displayValue() {
		System.out.println("New value is 1000");
	}

}
