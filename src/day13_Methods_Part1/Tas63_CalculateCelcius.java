package day13_Methods_Part1;

public class Tas63_CalculateCelcius {

	public static void main(String[] args) {

		calculateCelcius(90);
	}public static void calculateCelcius(double fahrenheit) {
		
		double Celcius=(fahrenheit-32)/1.8;
		System.out.println(Celcius);
	}

}
