package reviewSession_Week10;

public class String6_UniqueChars {

	public static void main(String[] args) {
		String str = "ababaaacbbdaaae";
		String uniques = "";

		for (char ch : str.toCharArray()) {

			int count = 0;
			for (char each : str.toCharArray()) {
				if (each == ch) {
					count++;
				}
			}

			if (count == 1) {
				uniques += ch;
			}

		}

		System.out.println(uniques);

	}

}