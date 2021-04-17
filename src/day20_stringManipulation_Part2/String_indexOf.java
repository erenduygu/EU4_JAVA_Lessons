package day20_stringManipulation_Part2;

public class String_indexOf {

	public static void main(String[] args) {

		String word1 = "github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		System.out.println(word1.indexOf("java"));

		String url = "www.okta.com";

		int i = url.indexOf(".");
		System.out.println("Pos of . " + i);

		System.out.println(url.charAt(i + 1));

		// find position of "-" and check if space is on right and left side

		String title = "Java - Google Search";

		/*
		 * for (int j = 0; j < title.length(); j++) { if (title.charAt(j) == '-') { if
		 * (title.charAt(j - 1) == ' ' && title.charAt(j + 1) == ' ') {
		 * System.out.println("Both side has spaces"); } else {
		 * System.out.println("Both side has not spaces");
		 * 
		 * }
		 */

		int dash = title.indexOf('-');
		System.out.println(title.charAt(dash - 2));
		System.out.println(title.charAt(dash + 2));
		
		String country="United States of America";
		int states= country.indexOf("States");
		System.out.println("Pos of states "+states);


	
		String word2="Java,c++,pyton,tomcat,eclipse";
		
		//check if c++ is in the word2
		
		if (word2.contains("c++")) {
			System.out.println(true);
		}
		
		
		if (word2.indexOf("c++")>-1) {
			System.out.println("c++ is there");
			}else {
				System.out.println("c++ is not there");
			}
	
	}
}
