package day08_controlFlowStatements_Part2;

public class Task33 {

	public static void main(String[] args) {

		int marks=0;
		
		if (marks<60) {
			System.out.println("Fail");
		}else if (marks>=60&&marks<90) {
			System.out.println("Pass");
		}else if (marks>=90) {
			System.out.println("Passes with Distinction");
		}else {
			System.out.println("Not a valid marks");
		}
		
	}

}
