package day05_unary_assignment_relational_operators;

public class Task20_incrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int b=1;
		int c=-b-- + b++ / -b--*--b;
		
		// in memory  : 1 - > 0 -> 1 -> 0 - > -1
		
		
		//result      : -1 + 0 / -1 * -0 = -1
		
		
		
				System.out.println(b);
				System.out.println(c);
				
				
			
	}

}
