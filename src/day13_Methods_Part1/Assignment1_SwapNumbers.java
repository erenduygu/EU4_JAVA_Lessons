package day13_Methods_Part1;

public class Assignment1_SwapNumbers {

	public static void main(String[] args) {

		
		//Solution_1
		
		int n1 = 10;
		int n2 = 20;
		int n3;

		n3 = n1;
		n1 = n2;
		n2 = n3;

		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);

		//Solution_2 without using third variable
		
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);

		
	}

}
