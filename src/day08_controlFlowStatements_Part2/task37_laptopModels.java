package day08_controlFlowStatements_Part2;

public class task37_laptopModels {

	public static void main(String[] args) {

		String model;
		
		model="lenovo";
				
		switch (model) {
		
		case "apple":
			System.out.println("Apple-no virus");
			break;

		case "dell":
			System.out.println("Tough one");
			break;

		case "acer":
			System.out.println("Not recommended");
			break;

		default:
			System.out.println("do not buy that one!");
			break;
			
		
		}

		
	}

}
