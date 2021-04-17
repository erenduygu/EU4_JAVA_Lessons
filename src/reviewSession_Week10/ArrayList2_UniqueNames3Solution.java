package reviewSession_Week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList2_UniqueNames3Solution {

	public static void main(String[] args) {

		
		String[] students = {"Hava", "Sheker", "Ali", "Ali", "Ellie", "Hava", "Ahmed", "Ahmed" };
		
		ArrayList<String> studentNames = new ArrayList<>(Arrays.asList(students));
		
		studentNames.removeIf( each ->  Collections.frequency(studentNames, each) > 1 );
				// if the names are occured more than once, we remove those names, then there will unique names only
		
		System.out.println(studentNames);
		
		
		
		
		
		
		
	}

}