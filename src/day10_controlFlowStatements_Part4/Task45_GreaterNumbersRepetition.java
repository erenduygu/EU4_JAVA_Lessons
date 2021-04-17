package day10_controlFlowStatements_Part4;

public class Task45_GreaterNumbersRepetition {

	public static void main(String[] args) {


		int num1,num2,repeat;
		num1=10;
		num2=20;
		repeat=2;
		
	for (int i=0;i<=repeat;i++) {
		
		if (num1==num2) {
			System.out.println("Numbers are equal");
		}else if (num1>num2){
			System.out.println("Number1:"+num1+" is the largest");

		}else {
			System.out.println("Number2:"+num2+" is the largest");

		}
	}
		
	}

}
