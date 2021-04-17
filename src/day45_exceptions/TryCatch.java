package day45_exceptions;

public class TryCatch {

	public static void main(String[] args) {
		
		
		try {

			String str="JAVA";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(5));
			System.out.println(str.charAt(1));

			
		}catch(Exception e){
			
			System.out.println("Exception happened in tryblock and was caught");
		}
		System.out.println("After try catch block");
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
