package day16_ClassObjects;

public class CarObjects {

	public static void main(String[] args) {

		Car car1 = new Car();

		car1.make = "Ford";
		car1.currentSpeed = 55;
		car1.model = "Fiesta";
		car1.color = "Grey";

		car1.printCarInfo();
		car1.showCurrentSpeed(100);

		car1.showCurrentSpeed(30);
		System.out.println("before :" + car1.currentSpeed);

		car1.accelerate(50);
		System.out.println("after :" + car1.currentSpeed);

	}

}
