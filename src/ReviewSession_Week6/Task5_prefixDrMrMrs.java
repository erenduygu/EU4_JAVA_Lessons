package ReviewSession_Week6;

import java.util.Scanner;

public class Task5_prefixDrMrMrs {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the name with prefix = ");
		String name = scan.nextLine();

		String upperCaseName = name.toUpperCase();

		if (upperCaseName.startsWith("DR")) {
			System.err.println("Doctor");
		} else if (upperCaseName.startsWith("MR")) {
			System.err.println("Male");
		} else if (upperCaseName.startsWith("MISS")) {
			System.err.println("Single Female");
		} else if (upperCaseName.startsWith("MRS")) {
			System.err.println("Married female");
		} else {
			System.err.println("Invalid Prefix");

		}

	}

}
