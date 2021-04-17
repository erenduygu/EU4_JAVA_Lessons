package day42_interface;

public class Tesla extends ElectricCar{

	public Tesla(String model, double price, String color) {
		super(model, price, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("Tesla is starting quietly...");
		System.out.println("Change to Drive mode...");

	}

	@Override
	public void charge() {
		System.out.println("Tesla charging - Plugin to Electric outlet...");

		
	}

	@Override
	public void drive() {
		System.out.println("Tesla is driving...");

		
	}

}
