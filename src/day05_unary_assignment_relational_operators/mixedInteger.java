package day05_unary_assignment_relational_operators;

public class mixedInteger {

	public static void main(String[] args) {

		int i1= 5;
		int i2=10;
		
		float f1= 15.5f;
		double d1=20.5;
		
		
		int  res1=i1+i2;
		float res2= i1+f1;
		double res3=i2+d1;
		
		short firstNumber=10;
		short secondNumber=20;
		int thirdNumber= firstNumber+secondNumber;
		
		short thirdNumber2= (short) (firstNumber+secondNumber);
		
		byte b1= 20;
		byte b2 = 2;
		
		byte b3= (byte)(b1*b2);
		int b4= b1+b2;
		
		System.out.println(b3+b4);
		
		int int1=2;
		int int2=30;
		
		byte res= (byte) (int1+int2);
		
		byte res4= 126+1;
		
		System.out.println(res4);
		
		
		
		
		
		
		
		
		
		
	}

}
