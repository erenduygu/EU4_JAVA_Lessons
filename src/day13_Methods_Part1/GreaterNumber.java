package day13_Methods_Part1;

public class GreaterNumber {

	public static void main(String[] args) {

		greaterNumber();
		
	}

	public static void greaterNumber() {

		int n1, n2;
		n1=101;
		n2=100;
		
		if (n1==n2) {System.out.println("Number1 number is equal to Number2 number");}else { 
			if (n1>n2) {
				System.out.println("Number1 number is greater than Number2 number");		
				}else {System.out.println("Number2 number is greater than Number1 number");}		}
				
	}

}
