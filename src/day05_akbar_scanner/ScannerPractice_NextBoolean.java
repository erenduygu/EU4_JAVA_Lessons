package day05_akbar_scanner;

import java.util.Scanner;

public class ScannerPractice_NextBoolean {

	public static void main(String[] args) {

		
		//Creating a scaner object
		
		Scanner veli= new Scanner(System.in);
		
		//asking user are you recording?
		
		System.out.println("Are you recording? ");
		
		Boolean isRecording=veli.nextBoolean();
		
		System.out.println("It is "+isRecording);

		
	}

}
