package day40_accessModifiers_Final_Hiding2;

import day40_accessModifiers_final_Hiding.Car;

public class CarTest{

	public static void main(String[] args) {
		Car c = new Car();

		//c.model="M3"; default
		c.year=2017;
		//c.door=4; private
		//c.engine=5.2;
		
		
		c.hashCode();
	}

}
