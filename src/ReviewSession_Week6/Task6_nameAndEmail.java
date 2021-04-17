package ReviewSession_Week6;

import java.util.Scanner;

public class Task6_nameAndEmail {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your full name = ");
		String fullName = scan.nextLine();

		int space = fullName.indexOf(" ");

		String email = fullName.charAt(0) + fullName.substring(space + 1) + "@NightWatch.com";

		System.out.println(email);

	}

}
