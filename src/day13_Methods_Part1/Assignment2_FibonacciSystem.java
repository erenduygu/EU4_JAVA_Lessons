package day13_Methods_Part1;

public class Assignment2_FibonacciSystem {

	public static void main(String[] args) {

		int count=8;
		int pre1=0,pre2=1;
		System.out.println("fibonacci series of "+ count+" numbers");
		
		for (int i = 1; i < count; i++) {
						
			int sumOfPrevTwo=pre1+pre2;
			
			pre1=pre2;
			pre2=sumOfPrevTwo;
			System.out.println(sumOfPrevTwo+" ");
		}
		
	}

}
