package day45_exceptions;

public class Nullpointer {
	
	
	static String name;
	
	
	public static void main(String[] args) {

	try {
		System.out.println(name.toUpperCase());
		
	}catch(NullPointerException e) {  //(Exception e)
		System.out.println("Nullpointerexception happened");
		System.out.println("Here is the message "+e.getMessage());
		System.out.println("Here is the stack trace");
		e.printStackTrace();
		System.out.println("Here is to String");

		System.out.println(e.toString());

	}

	}

}
