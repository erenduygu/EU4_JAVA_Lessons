package day48_collection_part3;

import day46_collection_part1.Product;

import java.util.*;

public class HashSetOfProducts {

	public static void main(String[] args) {

		// create a set collection and add new products
		
		Set<Product> prodSet= new TreeSet<>();
		prodSet.add(new Product("book",25.99));
		prodSet.add(new Product("book",19.99));
		prodSet.add(new Product("magazine",7.99));
		
		System.out.println(prodSet.toString());
		System.out.println();
		
		// print each product by using for each loop
		
		for (Product product : prodSet) {

			System.out.println(product);
		
		}
		System.out.println();
		for (Product product : prodSet) {

			System.out.println(product.getPrice());
		}
		System.out.println();
		// print each product by using for each method,,
		
		prodSet.forEach(n -> System.out.println(n+" | "));
		prodSet.forEach(n -> System.out.println(n.getName()+" | "));


	}

}
