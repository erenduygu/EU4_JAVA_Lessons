package day08_controlFlowStatements_Part2;

public class task36_Calculator {

	public static void main(String[] args) {


		int n1,n2,result;
		n1=9;
		n2=5;
		
		result= 0;
String operator="*"	;

		switch (operator) {
		
		case "+":
			result=n1+n2;
			break;
		case "-":
			result=n1-n2;
			break;
		case "*":
			result=n1*n2;
			break;
		case "/":
			result=n1/n2;
			break;
			
			default : 
				System.out.println("Invalid Operator");
				break;
		
		}
		
		System.out.println("Result is " + result);
	}

}
