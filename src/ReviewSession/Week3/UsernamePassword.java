package ReviewSession.Week3;

public class UsernamePassword {

	public static void main(String[] args) {

		/**
		 * 1. both username and password are correct 
		 * 2. both username and password are wrong 
		 * 3. username is correct but password is wrong 
		 * 4. username is wrong  but password is correct
		 * 
		 */ // abcd , secret3
		String username="abcde", password="secrete";
		 			
		
		
		 if( username.equals("abcd")  && password.equals("secret")   ) {
			 System.out.println("LOGIN SUCCESSFUL!");
		 }else if( !username.equals("abcd") && !password.equals("secret") ) {
			 
		 //}else if( username.equals("abcd")==false && password.equals("secret")==false ) {
			 
			 System.out.println("BOTH USERNAME AND PASSWORD ARE WRONG!!!");
		 }else if( username.equals("abcd") && !password.equals("secret") ) {
			 System.out.println("USERNAME IS CORRECT BUT PASSWORD IS WRONG");
		 }else if( !username.equals("abcd") && password.equals("secret") ) {
			 System.out.println("USERNAME IS WRONG BUT PASSWORD IS CORRECT");
		 }
		
		
	}

}
