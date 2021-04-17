package ReviewSession_Week6;

import java.util.Scanner;

public class Task3_Initials {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Your Full Name = ");
		String fullName = scan.nextLine();

		int space = fullName.indexOf(" ");

		System.out.print("Initial is " + fullName.charAt(0) + fullName.charAt(space + 1));

	}

}
