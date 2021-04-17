package ReviewSession_Week6;

import java.util.Scanner;

public class Task10_secondWord {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a sentence with 3 words ");
		String sentence = scan.nextLine();

		int firstspace = sentence.indexOf(" ");
		int lastspace = sentence.lastIndexOf(" ");

		System.out.println(sentence.substring(firstspace + 1, lastspace));

		// for the second word

		int secondSpaceIndex = sentence.indexOf(" ", firstspace + 1);

		System.out.println(sentence.substring(firstspace + 1, secondSpaceIndex));

	}

}
