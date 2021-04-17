package ReviewSession_Week8;

public class LongestString {

	public static void main(String[] args) {

		String[] x = { "Monday", "Apple", "Banana", "Strawberry", "Lion" ,"hello world"};
		
		
		System.out.println(findLongestString(x));

	}public static String findLongestString(String []arr) {
		String longestWord="";
		
		for(String word:arr) {
			if(word.length()>longestWord.length()) {
				
				longestWord=word;
				
			}
		}
		return longestWord;
		
	}

}
