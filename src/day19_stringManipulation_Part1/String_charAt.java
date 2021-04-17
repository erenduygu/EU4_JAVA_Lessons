package day19_stringManipulation_Part1;

public class String_charAt {

	public static void main(String[] args) {

		String word="Computer";
				System.out.println(word.length());
				
				System.out.println("======================");

				
				System.out.println(word.charAt(0));
				System.out.println(word.charAt(1));
				System.out.println(word.charAt(2));
				System.out.println(word.charAt(3));
				System.out.println(word.charAt(4));
				System.out.println(word.charAt(5));
				System.out.println(word.charAt(6));
				System.out.println(word.charAt(7));
				
				
				// check if first character is 'A'-----> case sensitive..
				String word2="Apple";
				if (word2.charAt(0)=='a') {
					System.out.println(true);
				}else {System.out.println(false);}
				
				// check if first and last character is same-------> case sensitive..

				
				String word3="civic";
				
				if (word3.charAt(0)==word3.charAt(4)) {
					System.out.println(true);
				}else {System.out.println(false);}
				
				
				// second technique
				
				char first=word3.charAt(0);
				char last=word3.charAt(4);
				
				if (first==last) {
					System.out.println(true);
				}else {System.out.println(false);}
				
				
				
				//last index not hard coded.
				
				String word4="Java";
				
				char lastChar=word4.charAt(word4.length()-1);
				
				System.out.println("Last char of "+ word4+" is "+lastChar);
				
				
	}

}
