package day20_stringManipulation_Part2;

import java.util.Scanner;

public class Task82_usernamePassword {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your Username: ");
		String userName = scan.nextLine();

		System.out.println("Please enter your Password: ");
		String password = scan.nextLine();
		
		String userName1 = "erenduygu";
		String password1 = "anam";

		if (userName.equals("") && password.equals("")) {
			System.out.println("Username and Password fields cannot be empty");
		} else if (userName.equals("") && !password.equals("")) {
			System.out.println("Password field cannot be empty");
		} else if (!userName.equals ("") && password.equals("")) {
			System.out.println("Username field cannot be empty");
		} else if (!userName.equals(userName1) || !password.equals(password1)) {
			System.out.println("Username or password are not valid,please verify");
		} else if (userName.equals(userName1) && password.equals(password1)) {
			System.out.println("User logged in successfully");

		}
	}
}
