package day13_Methods_Part1;

public class Task59_payRate {

	public static void main(String[] args) {

		payment(80, 20);
		payment(90, 37.54);
		
	}
	public static void payment(double hour, double hourlyPayment) {
		double payment=hour*hourlyPayment;
		System.out.println(payment);
	}

}
