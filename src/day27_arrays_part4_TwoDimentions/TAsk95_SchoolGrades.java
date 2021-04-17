package day27_arrays_part4_TwoDimentions;

import java.util.Arrays;

import day24_Arrays_Part1.ForEachLoop;

public class TAsk95_SchoolGrades {

	public static void main(String[] args) {

		int[][] scores= {{68,75,54,80},{100,64,20,50},{10,35,40,90}};
		
		//for (int [] student:scores) {
			// System.out.println(Arrays.toString(student));}
		
		//for (int i = 0; i < scores.length; i++) {
			//System.out.println(Arrays.toString(scores[i]));}
		
		int total=0;
		for (int i = 0; i < scores[0].length; i++) {
			
			total+=scores[0][i];
					
		}System.out.println("Average of Student-1 is: "+total/scores[0].length);
		
	
	int total1=0;
	for (int i = 0; i < scores.length; i++) {
		total1+=scores[i][0];
	}System.out.println(total1);
	
}

}
