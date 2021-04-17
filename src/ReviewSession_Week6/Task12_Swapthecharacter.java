package ReviewSession_Week6;

import java.util.Scanner;

public class Task12_Swapthecharacter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a word at least with 2 characters ");
		String word = scan.nextLine().trim();
		
		System.out.println(word.charAt(word.length()-1)+ word.substring(1,word.length()-1)+word.charAt(0));


	
	
	
	
	
	
	}

}
