package day07_controlFlowStatements.smallTasks;

public class task25_greatestNumber {

	public static void main(String[] args) {


		int number1, number2, number3;
		
		number1=100;
		number2=20;
		number3=3;
		
		if (number1>number2 && number1>number3) {
			System.out.println("The greatest number is "+ number1);
		}
	
		if (number2>number1 && number2>number3) {
			System.out.println("The greatest number is "+ number2);
		}
		
		if (number3>number1 && number3>number2) {
			System.out.println("The greatest number is "+ number3);
		}
		
	}

}
