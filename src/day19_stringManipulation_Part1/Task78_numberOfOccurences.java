package day19_stringManipulation_Part1;

public class Task78_numberOfOccurences {

	public static void main(String[] args) {


		String word="abcabqcabc";
		int counter=0;
		char letter='q';
		
		for (int i=0;i<word.length();i++) {
			if (word.charAt(i)==letter) {
				counter++;
			}
		}System.out.println("Number of occurence of the letter "+letter+ " is "+counter);
	}

}
