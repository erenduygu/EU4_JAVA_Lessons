package day04_arithmeticOperations;

public class contribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* this program calculates the amount of pay that will
		be contributed to a retirement plan if %5, %8 or %10 of 
		monthly pay is witheld*/
		
		
		double monthlyPay=6000;
		double fivePercent;
		double eightPercent;
		double tenPercent;
		
		fivePercent=monthlyPay-monthlyPay*0.05;
		eightPercent=monthlyPay-monthlyPay*0.08;
		tenPercent=monthlyPay-monthlyPay*0.1;
				
		System.out.println("5 % Plan "+fivePercent);
		System.out.println("8 % Plan "+eightPercent);
		System.out.println("10 % Plan " +tenPercent);
		
		System.out.println(6-3*2+7-1);
		
		int num1=46;
		int num2=90;
		int total= num1+num2;
		
		
		System.out.println(num1 + "+" + num2 + "=" + total);
		
		double F,C;
		
		C=70.2;
		F=9*C/5+32;	
		
		System.out.println(C+" celcius is equal to "+ F + " fahrenheit");
		
		
		System.out.println(136.79424/85);
		
		double mile, kilometer;

		mile=85;
		
		kilometer=mile*1.609344;
		
		
		System.out.println(mile + " mile is equal to " + kilometer + " km");
				
				
		
	
		
		
	}
	
	}

