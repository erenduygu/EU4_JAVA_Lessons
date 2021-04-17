package day19_stringManipulation_Part1;

public class Task77_emojiProgram {

	public static void main(String[] args) {

	
String emoji = ":)";      
		
		//check if it does not equal to 2 chars
		
		if(emoji.length() != 2) {
			System.out.println("Invalid Emoji");
			return; //stop execution
		}
		
		//if code reaches this point, then emoji is 2 chars
		//get first and second chars and assign to variables
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(first==':') {
			if(second==')') {
				System.out.println("Smile");
			}else if(second=='(') {
				System.out.println("Sad");
			}else if(second=='/') {
				System.out.println("Upset");
			}else {
				System.out.println("Unknown emoji");
			}
			
		}else if(first==';') {
			if(second==')') {
				System.out.println("Wink");
			}else if(second=='0') {
				System.out.println("Suprised");
			}else {
				System.out.println("Unknown emoji");
			}
		}else {
			System.out.println("Invalid");   //   ))
		}
		
	}

}	
		
		/*	String emoji = ";)";

		if ((emoji.length()) == 2) {
			if (emoji.charAt(0) == ':' && emoji.charAt(1) == ')') {
				System.out.println("smile");
			}
			if (emoji.charAt(0) == ':' && emoji.charAt(1) == '(') {
				System.out.println("sad");
			}
			if (emoji.charAt(0) == ':' && emoji.charAt(1) == '/') {
				System.out.println("upset");
			}
			if (emoji.charAt(0) == ':' && emoji.charAt(1) == 'p') {
				System.out.println("playful");
			}
			if (emoji.charAt(0) == ';' && emoji.charAt(1) == ')') {
				System.out.println("wink");
			}
			if (emoji.charAt(0) == ';' && emoji.charAt(1) == '0') {
				System.out.println("surprised");
			}
		}else {
			System.out.println("Invalid emoji");
		}
*/

