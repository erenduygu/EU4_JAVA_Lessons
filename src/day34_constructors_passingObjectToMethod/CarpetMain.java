package day34_constructors_passingObjectToMethod;

public class CarpetMain {

	public static void main(String[] args) {

		Floor floor = new Floor(-1, 10);
		
		System.out.println(floor.width);
		Carpet carpet = new Carpet(8);
		Calculator total = new Calculator(floor, carpet);
		System.out.println(total.getTotalCost());

	}

}
