package day13_Methods_Part1;

public class MethodAcceptsCharsOnly {

	public static void main(String[] args) {

		countByChar(10.0, 20.1, '*');
		countByChar(20, 20, '/');
		countByChar(10.0, 20.1, '-');
		countByChar(10.0, 20.1, '/');

	}

	public static void countByChar(double num1, double num2, char ch) {

		double result;
		switch (ch) {
		case '+':
			result = num1 + num2;
			System.out.println(result);

			break;
		case '-':
			result = num1 - num2;
			System.out.println(result);

			break;
		case '/':
			result = num1 / num2;
			System.out.println(result);

			break;
		case '*':

			System.out.println(num1 * num2);

			break;
		default:
			System.out.println("invalid char");
			break;

		}

	}

}
