package day18_readingUserInput;

import java.util.Scanner;

public class Task74_sumUntilNegative {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
	
		
		do {
			System.out.println("Enter Number 1: ");
			int num1=scan.nextInt();
			
			System.out.println("Enter Number 2:");
			int num2=scan.nextInt();
			
			if (num1<0||num2<0) {
				break;
				}else {
				int sum= num1+num2;
				System.out.println(sum);

				}
			
		} while (true);
	}

}
