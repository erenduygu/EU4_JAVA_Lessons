package day13_Methods_Part1;

public class Summary {

	public static void main(String[] args) {

		methodName();
		methodName1(5, "apple");
		methodName2(8, "orange");//return value

		System.out.println(methodName2(8, "orange"));

		// no-parameter method;

	}

	public static void methodName() {
		System.out.println("Hello");
	}

	// Parameter method;
	public static void methodName1(int n1, String str) {

		System.out.println(str);
		int sun = 4 + n1;
		System.out.println(sun);

	}
	// Value-Return method;
	public static int methodName2(int n1, String str) {

		System.out.println(str);
		int sum = 4 + n1;

		return sum;

	}
}
