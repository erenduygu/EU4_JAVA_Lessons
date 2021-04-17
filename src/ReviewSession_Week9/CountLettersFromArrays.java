package ReviewSession_Week9;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLettersFromArrays {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("ape");
		words.add("anna");
		words.add("build");
		words.add("aaabbc");

		System.out.println(countLetters(words, 'a'));
		System.out.println(countLetters(words, 'e'));

		System.out.println(Arrays.toString(countLetters2(words, 'a')));
		System.out.println(Arrays.toString(countLetters2(words, 'e')));

	}

	public static int countLetters(ArrayList<String> words, char letter) {

		int total = 0;

		for (String word : words) {

			for (char eachLetter : word.toCharArray()) {
				if (eachLetter == letter) {
					total++;
				}
			}
		}
		return total;
	}
	public static int[] countLetters2(ArrayList<String> words, char letter) {

		int[] total = new int[words.size()];
		int index = 0;

		for (String word : words) {
			int count = 0;
			for (char eachLetter : word.toCharArray()) {
				if (eachLetter == letter) {
					count++;
				}
			}
			total[index++] = count;
		}
		return total;
	}

}