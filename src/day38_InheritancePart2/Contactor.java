package day38_InheritancePart2;

public class Contactor extends Employee {

	@Override
	public void calculatePay(int hours, double rate) {
		System.out.println("Contractor total pay:"+((hours*rate)+200));
	}

}
