package day20_stringManipulation_Part2;

public class String_replace2 {

	public static void main(String[] args) {

		String sentence = "Coding is fun, it is my hobby!!";

		String withNoSpace=sentence.replace(" ", "");
		System.out.println(sentence);
		System.out.println(withNoSpace);

		//replace , with !!!
		String withNoComma=sentence.replace(",", "!!!").replace("fun","my           hobby");
		System.out.println(withNoComma);
		
		
		String result="About 8,930,000,000 results(0,68 seconds)";
		
		int first=result.indexOf(' ');
		int second=result.indexOf(' ',first+1);
		System.out.println(first+" "+second);
		
		for(int i=5;i<20;i++) {
			System.out.print(result.charAt(i));}
			
		String result2="About 8,930,000,000 results(0,68 seconds)";
		
		result2=result2.replace("About", "").replace("results(0,68 seconds)","");

			System.out.println("\n"+result2);
		
	
	

	}

}
