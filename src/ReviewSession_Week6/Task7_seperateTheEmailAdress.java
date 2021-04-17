package ReviewSession_Week6;

import java.util.Scanner;

public class Task7_seperateTheEmailAdress {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your email address = ");
		String email = scan.nextLine();

		int atSign = email.indexOf("@");
		int dotSign = email.indexOf(".");
		String part1 = email.substring(0, atSign);
		String part2 = email.substring(atSign + 1, dotSign);
		String part3 = email.substring(dotSign + 1);

		System.out.println("Part 1 : " + part1 + "\nPart 2 : " + part2 + "\nPart 3 : " + part3);
	}

}
