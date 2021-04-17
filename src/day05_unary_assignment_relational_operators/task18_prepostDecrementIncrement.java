package day05_unary_assignment_relational_operators;

public class task18_prepostDecrementIncrement {

	public static void main(String[] args) {


		int x=2;
		int y= x++; //y=2
					//x=3 in the next line
		
	
		System.out.println(y);
		System.out.println(x+"\n");
		
		int x1=2;
		int y1= ++x1; //y1=3
					//x1=3 
		
	
		System.out.println(y1);
		System.out.println(x1);	
		
		
		int a= 50;
		a= (--a) +( a++) + (a--) + (a++);
		
				System.out.println(a);
	}

}
