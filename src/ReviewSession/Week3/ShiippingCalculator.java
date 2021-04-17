package ReviewSession.Week3;

import java.util.Scanner;

public class ShiippingCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Create a program to calculate Amazon shipping.
		 * 
		 * are you a prime member? xpect Yes or No answer.
		 * If yes00> Shipping is Free
		 * If No==> ask more questions
		 * 
		 * What is the amoount for your shopping as double,
		 * if the number is more than 35 -----> Free Shipping
		 * prrint your totalis same number as user entered
		 * if the number is less than 35 ----add 5 $ for Shipping
		 * print your total is 5$ more than your number
		 * 
		
		*/
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Are you a prime member? Yes or No?");
		String primeMember=scan.next();
		System.out.println("What is the total price that you will pay?");

		double price= scan.nextDouble();
		
		if(primeMember.equals("Yes")) {
			System.out.println("Hello Dear Prime Member!! Free Shipping!!!!"+price);
		}else if (primeMember.equals("No")){
				if (price>35) {
				System.out.println("Lot of Shopping!! Free Shipping!!!!"+price);
				}
				else {
	            System.out.println("Including shipping , Your total is " +  (price+5)   );
	            System.out.println("Consider signing up for Prime to save shipping fee!!! ");
	         
	       }}
	    else {
	         System.out.println("SYSTEM CRASH!! YOU CAN ONLY SAY yes or no!!!!!");
	       }
	       

		
		
	}

}
