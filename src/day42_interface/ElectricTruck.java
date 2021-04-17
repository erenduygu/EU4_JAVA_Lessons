package day42_interface;

public abstract class ElectricTruck extends ElectricCar{
	
	public ElectricTruck(String model, double price, String color) {
		super(model, price, color);
		// TODO Auto-generated constructor stub
	}

	public abstract void load(String item);


}
