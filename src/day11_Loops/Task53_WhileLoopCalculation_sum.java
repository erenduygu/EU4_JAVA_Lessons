package day11_Loops;

public class Task53_WhileLoopCalculation_sum {

	public static void main(String[] args) {

		int i = 0;
		int sumOfEven = 0;
		while (i < 100) {
			if (i % 2 == 0) {
				sumOfEven = i + sumOfEven;
			}

			i++;
		}
		System.out.println(sumOfEven);
	}

}
