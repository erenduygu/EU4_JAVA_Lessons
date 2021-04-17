package day08_controlFlowStatements_Part2;

public class switchCaseStatement {

	public static void main(String[] args) {

		String weather="hot";
		
		switch (weather) {
		
		case "sunny":		
		case "hot":		
		case "windy":
			System.out.println("Code Java");
		break;
		
		case "snowy":
			System.out.println("Go snowboarding");
			System.out.println("Code Java");
		break;
		
		default:
			System.out.println("Code Java in any other weather");
			break;
		
	
		}
	}

}
