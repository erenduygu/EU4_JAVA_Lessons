package day38_InheritancePart2;

public class Student extends Person{


	@Override
	public void message() {
		System.out.println("This is student class");
		super.message();
		System.out.println("This is student class");
		super.message();


	}
	public void display() {
		message();
		super.message();
	}

}
