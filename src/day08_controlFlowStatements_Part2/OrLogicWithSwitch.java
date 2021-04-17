package day08_controlFlowStatements_Part2;

public class OrLogicWithSwitch {

	public static void main(String[] args) {

		char grade='D';
		
		switch (grade) {
		
		case 'A':case 'B':case'C':
			System.out.println("Pass");
	break;
	
		case'D': case'E':
			System.out.println("Fail");
		
		}
	}

}
