package day45_exceptions;

public class TryCath2 {

	public static void main(String[] args) {

		int[] nums = { 36, 6, 34, 12 };
		try {
			System.out.println(nums[6]);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}

		try {
			int j = 100;
			int n = j / 0;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			int j = 100;
			int n = j / 1;

		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
