package day32_classObject_constructors;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("Toyota", "Corolla", 2002, 5000, "red");

		System.out.println(c1.make);
		System.out.println(c2);

		Car c7 = new Car(); // it is calling the constructor
		// which constrcutor u want me do execute?
		// i want to you execute, constructor which does not have any arguments

		Car c5 = new Car("AMG", "Mercedes", 2007, 65000, "White");
		Car c3 = new Car("Corolla", "Toyota", 2015, 32000, "Yellow");
		Car c4 = new Car("Altima", "Nisssan", 2014, 41000, "Black");

	}

}
