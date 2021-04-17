package ReviewSession_Week6;

import java.util.Scanner;

public class Task11_firstWordLastWord {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a sentence at least with 3 words ");
		String sentence = scan.nextLine().trim();

		int firstspace = sentence.indexOf(" ");
		int lastspace = sentence.lastIndexOf(" ");

		System.out.println(sentence.substring(0, firstspace).concat(sentence.substring(lastspace)));

	}

}
