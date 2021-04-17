package ReviewSession_Week6;

import java.util.Scanner;

public class Task4_firstLastAndMiddleCharacter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a word at least 3 character = ");
		String word = scan.nextLine();

		System.out.println("first char\t = " + word.charAt(0));
		System.out.println("last char\t = " + word.charAt(word.length() - 1));

		if (word.length() % 2 == 1) {
			System.out.println("middle char\t = " + word.charAt(word.length() / 2));
		} else {
			System.out.println("middle char\t = " + word.charAt(word.length() / 2 - 1));
		}

	}

}
