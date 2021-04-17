package day13_Methods_Part1;

public class ValueReturn {

	public static void main(String[] args) {
		System.out.println(sum(2, 3));

		int v1 = sum(2, 3);
		System.out.println(v1 * 5);
		System.out.println(v1);
	}

	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

}
