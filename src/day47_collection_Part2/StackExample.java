package day47_collection_Part2;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		
		Vector<Integer> numsStack = new Stack<>();
		numsStack.add(50);
		numsStack.add(70);
		numsStack.add(100);
	

		System.out.println(numsStack);
		
		// check value on top of Stack
		
		System.out.println(((Stack<Integer>) numsStack).peek());
		
		// read value on top of stack and remove it
		
		System.out.println(((Stack<Integer>) numsStack).pop());
		
		System.out.println(numsStack);
		
		System.out.println(numsStack.get(0));



		

	}

}
