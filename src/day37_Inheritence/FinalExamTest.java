package day37_Inheritence;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {

		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter the number of Questions:");
		int questions=scan.nextInt();
		System.out.println("Please enter the number of Missed Questions:");
		int missed=scan.nextInt();
		
		FinalExam fn=new FinalExam(questions, missed);

				
				System.out.println(fn.getGrade());
	}

}
