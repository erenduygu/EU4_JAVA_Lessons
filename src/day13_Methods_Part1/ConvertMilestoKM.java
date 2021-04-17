package day13_Methods_Part1;
import java.util.Scanner;
public class ConvertMilestoKM {

	public static void main(String[] args) {

		convertKM();
	}

	public static void convertKM() {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter miles: ");
		double miles=scan.nextDouble();
		double KM=1.6213*miles;
		
		System.out.println(miles+" miles is equal to "+KM);
	}

}
