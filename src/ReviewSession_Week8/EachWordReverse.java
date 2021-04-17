package ReviewSession_Week8;

public class EachWordReverse {

	public static void main(String[] args) {
		/*
		 * Create a method that will accept a String and return the sentence with each
		 * word reversed Ex: "I love learning java" -> I evol gninrael avaj
		 */
		
		String x="I love learning java" ;
		String y="Today is a nice day" ;
		
		System.out.println(reverseEachWord(x));
		System.out.println(reverseEachWord(y));


	}

	public static String reverseEachWord(String str) {

		String[] words = str.split(" ");
		
		String reverse="";
		
		for( String word:words) {
			String reverseEach="";
			
			for (int i = word.length()-1; i >= 0; i--) {
				reverseEach+=word.charAt(i);
				
			}
			
			reverse+=reverseEach+" ";
		}
		
		return reverse.trim();
	}

}
