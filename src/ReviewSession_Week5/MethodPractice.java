package ReviewSession_Week5;

public class MethodPractice {

	public static void main(String[] args) {
		// Method: reusable block of code with a name 
		//Optionally with parameters and return type

	sayHello();
	
	System.out.println();
	
	sayHelloTo("Veli");
	System.out.println();
	
	for(int i=1; i<=2; i++) {
		sayHello();
			} 
		
	System.out.println();
	
  sayHelloWithFullName("Eren", "Duygu");
  
	}public static void sayHello() {
		
		System.out.println("Hello from Cybertek");
		System.out.println("Welcome to Cybertek");
		System.out.println();
		
		
		
		
	}public static void sayHelloWithFullName(String firstName, String lastName) {
	
		System.out.println("Hello my friend " + firstName+ "| "+ lastName);
	
	
	}public static void sayHelloTo(String name) {
	
		System.out.println("Saying hello to " + name);
	}

}
