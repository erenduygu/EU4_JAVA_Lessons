package day13_Methods_Part1;

public class CrediitCardMethod {

	public static void main(String[] args) {

		double salary = 50_000;
		int creditRating = 8;

		if (salary >= 20000 && creditRating >= 7) {
			qualify();
		} else {
			noQualify();
		}
	}

	public static void noQualify() {
		System.out.println("I am sorry, you are not qualified for the CC");

	}

	public static void qualify() {
		System.out.println("Congrat, you are qualified for the CC");

	}

}
