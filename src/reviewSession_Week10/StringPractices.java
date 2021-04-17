package reviewSession_Week10;

public class StringPractices {

	public static void main(String[] args) {

		String sentence="I love java, JavA is cool, JAva is fun!";
		String sent=sentence.toLowerCase();
		
		System.out.println(sentence.toLowerCase());
		
		int count=0;
		while(sent.contains("java")) {
			sent=sent.replaceFirst("java","");
			count++;
		}
		System.out.println(count);
		System.out.println(sent);

		
	}

}
