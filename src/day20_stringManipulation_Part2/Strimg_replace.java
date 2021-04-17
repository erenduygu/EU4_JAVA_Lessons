package day20_stringManipulation_Part2;

public class Strimg_replace {

	public static void main(String[] args) {

		String str = "Moscow is a capital of Russia of Russia.";
		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbaican");
		System.out.println(str);

		System.out.println("=============================");
		String email = "firstName_Lastname@gmail.com";

		String company = "capitalone";

		String newmail = email.replace("gmail", company);

		System.out.println(newmail);
		System.out.println(email);

	}

}
