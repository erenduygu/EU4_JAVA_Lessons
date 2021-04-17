package day24_Arrays_Part1;

public class Task90_FindHonda {

	public static void main(String[] args) {

		String[] cars = { "Toyota", "Honda", "Suzuki", "Renault" + "Yamaha" + "Hyundai" };

		boolean flag = false;

		for (int i = 0; i < cars.length; i++) {
			if (cars[i].contains("Honda")) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("I find your car Honda in this array");
		} else {
			System.out.println("I couldn't find your car Honda in this array");
		}
	}

}
