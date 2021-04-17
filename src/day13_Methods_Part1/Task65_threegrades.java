package day13_Methods_Part1;

public class Task65_threegrades {

	public static void main(String[] args) {

		grades(50,50,50);
		
	}public static void grades(int grade1, int grade2, int grade3) {
		double average=(grade1+grade2+grade3)/3;
		
		System.out.print("calculateGrade( "+grade1+", "+grade2+", "+grade3+" )-> ");
		if (average>=90&&average<=100) {
			System.out.println("A");
		}else if (average>=80&&average<90) {
			System.out.println("B");
		}else if (average>=70&&average<80) {
			System.out.println("C");
		}else if (average>=60&&average<70) {
			System.out.println("D");
		}else if (average>=0&&average<60) {
			System.out.println("F");
		}
	}

}
