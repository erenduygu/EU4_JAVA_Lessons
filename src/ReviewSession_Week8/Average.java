package ReviewSession_Week8;

public class Average {

	public static void main(String[] args) {

		int[] x = { 10, 15, 5, 5,10,6};
		System.out.println(getAverage(x));
	}

	public static double getAverage(int[] arr) {

		double sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum/arr.length;
	}

}
