package day24_Arrays_Part1;

import java.util.Iterator;

public class ForEachLoop {

	public static void main(String[] args) {

		String[] product = { "Timberland", "Shirt", "Watch", "Bag", "Shoes" };
		double[] prices = { 120.0, 12.99, 300, 25, 67.89 };

		for (int i = 0; i < product.length; i++) {
			System.out.println(product[i]);
		}			System.out.println("----------------------");

		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}System.out.println("----------------------");
		
		for( double prc:prices) {
			System.out.println(prc);
		}System.out.println("----------------------");
		
		for (String prod : product) {
			System.out.println(prod);
		}	System.out.println("----------------------");
		
		// print everything in reverse order
		
		
		for (int i = product.length-1; i >= 0 ; i--) {
			System.out.println(product[i]);
		}			System.out.println("----------------------");
		
		
		
	}

}
