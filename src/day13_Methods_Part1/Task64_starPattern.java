package day13_Methods_Part1;

public class Task64_starPattern {

	public static void main(String[] args) {

		star (9);
		
	}public static void star (int num) {
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
				
			}System.out.println();
			
		}
	}

}
