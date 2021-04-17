package day22_stringManipulation_Lab;

public class String_isEmpty {
	
	public static void main(String [] args) {
		
		String userName="";
		String password="";
		
		if (userName.isEmpty()) {
			System.out.println("Username field cannot be empty");
			
		}else {
			System.out.println("Username is not empty");
		}
	}

}
