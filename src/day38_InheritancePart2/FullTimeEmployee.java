package day38_InheritancePart2;

public class FullTimeEmployee extends Employee {

	public void calculatePay(int hours, double rate) {
		System.out.println("Employee total pay:"+(hours*rate)*1.05);
	}
}
