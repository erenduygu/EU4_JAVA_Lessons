package ReviewSession_Week6;

import java.util.Scanner;

public class Task9_validUrl {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a valid URL address = ");
		String validUrl = scan.nextLine();

		int firstDot = validUrl.indexOf(".");
		int lastDot = validUrl.lastIndexOf(".");

		System.out.println(validUrl.substring(firstDot + 1, lastDot));

	}

}
