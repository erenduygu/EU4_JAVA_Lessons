package day19_stringManipulation_Part1;

public class String_concat {

	public static void main(String[] args) {

		String word = "Java";
		System.out.println(word.concat("+selenium"));

		System.out.println(word.concat(" in Eclipse"));

		System.out.println(word);

		word = word.concat("+Eclipse");

		System.out.println(word);

		word = word.concat(" Automation");

		System.out.println(word);
		
		word= word+123;
		System.out.println(word);
		
		word= word+true;
		System.out.println(word);
		
		String word2="-Hi";
		word2="HELLO"+word2.concat("-Hey").concat("-How are you").concat("-good");
		System.out.println(word2);

	}
}