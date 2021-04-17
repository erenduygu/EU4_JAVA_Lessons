package reviewSession_Week10;

public class String4_CountWordInSentence {

	public static void main(String[] args) {
		String sentence = "I love java, Java is cool, jAvA is fun javajavajava java java java";
	

		sentence = sentence.toLowerCase();

		String word = "JAVA";
		word = word.toLowerCase(); // "java"

		int count = 0;

		while (sentence.contains(word)) {
			sentence = sentence.replaceFirst(word, "");
			count++;
		}

		System.out.println(count);

	}

}
/*
 * Frequency of word
 * 
 * sentence = "I love java, Java is cool, jAvA is fun" word = "java"
 * 
 * 
 * 3
 * 
 */