package day05_akbar_scanner;

import java.util.Scanner;

public class Task5_GrossaryShopping {

	public static void main(String[] args) {

		
		/*Task5---Grossary Shooping 
		 * ask user what's the price of tomato and store it.
		 * ask user how many tomato you want to buy and store it
		 * 	 * ask user what's the price of potato and store it.
		 * ask user how many potato you want to buy and store it
		 * 	 * ask user what's the price of banana and store it.
		 * ask user how many banana you want to buy and store it
		 * 
		 * generate this example output;
		 * You got tomato price is 2,99 and total --->
		 *  You got potato price is 3,49 and total --->
		 *  You got banana price is 1,99 and total --->
		 *  
		 *  Your grand total for this shopping is???+   */
	
	
		Scanner grossary=new Scanner(System.in);
		
		System.out.println("What is the price of tomato?");
		
		double tomatoPrice=grossary.nextDouble();
		
		System.out.println("How many tomato you want to buy?");
		
		int tomato=grossary.nextInt();
		
		double tomatoTotal=tomatoPrice*tomato;
				
		System.out.println("You got tomato price is "+tomatoPrice+" and Total is "+tomatoTotal+"\n");
		

		//----------------------------------------------------
		System.out.println("What is the price of potato?");
		
		double potatoPrice=grossary.nextDouble();
		
		System.out.println("How many potato you want to buy?");
		
		int potato=grossary.nextInt();
		
		double potatoTotal=potatoPrice*potato;
				
		System.out.println("You got potato price is "+potatoPrice+" and Total is "+potatoTotal+"\n");
		
		//-------------------------------------------------------------------------------
	    System.out.println("What is the price of banana?");
		
		double bananaPrice=grossary.nextDouble();
		
		System.out.println("How many banana you want to buy?");
		
		int banana=grossary.nextInt();
		
		double bananaTotal=bananaPrice*banana;
				
		System.out.println("You got banana price is "+bananaPrice+" and Total is "+bananaTotal+"\n");
		//-------------------------------------------
		
		double totalPrice=tomatoTotal+potatoTotal+bananaTotal;
		
		System.out.println("YOUR TOTAL PRICE IS "+totalPrice);

		
		
		
	}

}
