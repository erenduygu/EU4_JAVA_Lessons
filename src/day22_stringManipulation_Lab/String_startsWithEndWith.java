package day22_stringManipulation_Lab;

public class String_startsWithEndWith {

	public static void main(String[] args) {

		String word1 = "eclipse";
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ecil"));
		
		
		System.out.println(word1.endsWith("se"));

		
		
	// Mr.=married man
		//Mrs.=married woman
		//Ms=Some woman
		//Dr.=Doctor man or woman
		//No title= unknown status
	
		
		String name="Dr.Jackson";
		
		if (name.startsWith("Mr.")) {
			System.out.println("married man");
		}else if (name.startsWith("Mrs.")) {
			System.out.println("married woman");
		}else if (name.startsWith("Mrs.")) {
			System.out.println("married woman");
		}else if (name.startsWith("Ms.")) {
			System.out.println("some woman");
		}else if (name.startsWith("Dr.")) {
			System.out.println("Doctor man or woman");
		}else {
			System.out.println("Unknown status");
		}
			
		
		
		
	}

}
