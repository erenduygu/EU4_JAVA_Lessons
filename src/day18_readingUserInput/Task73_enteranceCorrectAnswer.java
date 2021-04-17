package day18_readingUserInput;

import java.util.Scanner;

public class Task73_enteranceCorrectAnswer {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number:");

		int userInput;
		int secretNumber = 8;

		do {
			userInput = scan.nextInt();
			if (userInput < secretNumber) {
				System.out.println("Enter a bigger number: ");
			} else if (userInput > secretNumber) {
				System.out.println("Enter a smaller number: ");
			} else {
				System.out.println("Congrat you got it... ");
			}

		} while (userInput != secretNumber);

	}

}
