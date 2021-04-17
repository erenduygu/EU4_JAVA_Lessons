package day26_arrays_part3;

import java.util.Arrays;

public class Task94_PasswordCombination {

	public static void main(String[] args) {
		String info1 = "This info is used for creation password : xxxCD132Gxxx. Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx. Please do not share with anyone";

		String [] part1=info1.split(" ");
		String [] part2=info2.split(" ");
		System.out.println(Arrays.toString(part2));
		
		String pass1=part1[8].trim().substring(3,9);
		String pass2=part2[8].trim().substring(3,9);
		
		System.out.println(pass1+pass2);
		
	}

}
