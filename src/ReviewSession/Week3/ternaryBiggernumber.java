package ReviewSession.Week3;

public class ternaryBiggernumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int num1 = 100 ; 
		int num2 = 20 ; 
		// if the num1 is more than num2 assign bigger number to num1 
		// else assign bigger number to num2
		int biggerNumber = 0 ;
		
		if(num1 > num2 ) {
		    
		    biggerNumber = num1 ; 
		    
		  }else {
		    
		    biggerNumber = num2 ; 
		    
		  }
		biggerNumber = (num1 > num2 ) ? num1  : num2 ; 
		
		System.out.println("BIGGER NUMBER IS " + biggerNumber);
	
	
	}

}
