package day32_classObject_constructors;

public class Car {
	String model;
	String make;
	int year;
	double mile;
	String color;
	
	public Car() {
		model="Honda";
		make="Civic";
		year=2020;
		mile=5000;
		color="red";
		
	}
	public Car(String model, String make, int year, double mile, String color) {
		super();
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}
	public Car(String model, String make, double mile) {
		
		this.model = model;
		this.make = make;
		this.mile = mile;
	}


}
