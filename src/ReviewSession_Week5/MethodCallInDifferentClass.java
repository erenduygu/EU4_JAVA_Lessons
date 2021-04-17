package ReviewSession_Week5;

public class MethodCallInDifferentClass {

	public static void main(String[] args) {
		
		// You can call any
		//ClassName.Methodnames();

		
		System.out.println("Program Started\n");
		MethodPractice.sayHello();
		
		MethodPractice.sayHelloWithFullName("veli", "KUL");
	
		MethodPractice.sayHelloTo("AKBAR");

		
		System.out.println("Program Ended");
	}

}
