package day08_controlFlowStatements_Part2;

public class TernaryConditional {

	public static void main(String[] args) {

		int bill=5000;
		
		double d1=bill*0.9,d2=(bill*0.85);
		
		double discount= (bill>2000)?d1:d2;
		
		System.out.println(discount);
	}

}
