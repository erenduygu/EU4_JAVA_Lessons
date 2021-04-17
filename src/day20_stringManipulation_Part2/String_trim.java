package day20_stringManipulation_Part2;

public class String_trim {

	public static void main(String[] args) {


		String str=" 342 ";
		String str1=str.replace(" ","|");
		System.out.println(str1);
		
		String str2=str.trim();
		System.out.println("|"+str2+"|");
		System.out.println("|"+str.trim()+"|");

		
		
	}

}
