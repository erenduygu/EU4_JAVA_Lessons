package ReviewSession_Week6;

import java.util.Scanner;

public class Task2_googleSearch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Search Keyword:");
		String searchKeyword = scan.nextLine();

		String tabTitle = searchKeyword + " - Google Search";

		System.out.println("tabTitle = " + tabTitle);

		if (searchKeyword.startsWith(searchKeyword) && tabTitle.endsWith("- Google Search")) {
			System.out.println("Test has passed!!");
		} else {
			System.out.println("Test has failed!!");
		}

	}

}
