package ReviewSession_Week5;

public class Recursion {

	public static void main(String[] args) {
		// Recursion: a method calling itself:

		printNumber(10);
		System.out.println();
		printNumberLowToHigh(-10);

	}

	public static void printNumberLowToHigh(int num) {

		if (num > 10) {
			System.out.print("The End!!!");
			return;
		}
		System.out.print(num + " ");
		printNumberLowToHigh(num + 1);
	
	}

	public static void printNumber(int n) {

		if (n == 0) {
			System.out.print("The End!!!");
			return;
		}

		System.out.print(n + " ");
		// call printNumber with different number below
		// for example one less than the value of n

		printNumber(n - 1);
		

	}

}
