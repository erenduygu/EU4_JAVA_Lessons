package day08_controlFlowStatements_Part2;

public class task39_trafficLights {

	public static void main(String[] args) {

		String code="G";
		
		
		switch (code) {
		
		case "R":		case "r":

			System.out.println("Red");
			break;
			
		case "O":		case "o":

			System.out.println("Orange");
			break;
			
		case "G":		case "g":

			System.out.println("Green");
			break;
			
			default:
			System.out.println("invalid entry");
			
		}
		
	}

}
