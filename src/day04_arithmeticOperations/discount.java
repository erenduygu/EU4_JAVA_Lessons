package day04_arithmeticOperations;

public class discount {

	public static void main(String[] args) {

		/* This program calculates the sale price of an item 
		 * that is regularly priced at 59$, 
		 * with a%20 discount on it		 */
		
		
		int regularPrice=59;
		double discount;
		double salesPrice;
		
		discount=regularPrice*0.2;
		salesPrice=regularPrice-discount;
		
		System.out.println("Regular Price: $ "+ regularPrice);
		System.out.println("Discount Price: $ "+ discount);
		System.out.println("Regular Price: $ "+ salesPrice);

		
		System.out.println("Sales Price: $ "+ (regularPrice-regularPrice*0.2));

	}

}
