package ReviewSession_Week6;

import java.util.Scanner;

public class Task8_EnterASentence {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a sentence = ");
		String rawSentence = scan.nextLine(); // String rawSentence=scan.nextLine().trim;

		String sentence = rawSentence.trim();

		int space = sentence.indexOf(" ");
		int lastSpace = sentence.lastIndexOf(" ");

		System.out.println(space);
		System.out.println(lastSpace);

		if (lastSpace == space) {
			System.out.println("You have entered two words.");
		} else {
			System.out.println("You have more than two words.");

		}
	}

}
