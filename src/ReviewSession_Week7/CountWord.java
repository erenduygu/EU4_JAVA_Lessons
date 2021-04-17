package ReviewSession_Week7;

public class CountWord {


	/*
	 * 
	 *  Write a program that can return the frequency of the word from a sentence 
		Ex: 
		Input: "java, javascript and css java and datebase, java
				"java"
		Output: 4
	 */
	
	public static void main(String[] args) {
		System.out.println(countWord("java, javascript java and css java and datebase, java", "java"));
	}

	public static int countWord(String str, String word) {
		
		int count = 0;
		
		while(str.contains(word)) {
			
			count++;
			str = str.replaceFirst("java", "");
			
		}
		
		return count;
		
		
	}
			
			
	
}

