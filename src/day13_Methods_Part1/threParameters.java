package day13_Methods_Part1;

public class threParameters {

	public static void main(String[] args) {

		calculator(10,5,"+");
		calculator(10,5,"-");
		calculator(10,5,"*");
		calculator(10,5,"/");
		
	}

	public static void calculator(int num1, int num2, String operator) {
		switch (operator) {
		case"+":
			System.out.println(num1+num2);
			break;
		case"-":
			System.out.println(num1-num2);
			break;
		case"*":
			System.out.println(num1*num2);
			break;
		case"/":
			System.out.println(num1/num2);
			break;
		}

	}

}
