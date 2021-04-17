package day08_controlFlowStatements_Part2;

public class Task32 {

	public static void main(String[] args) {


		int x,y,z;
		
		x=11;
		y=11;
		z=11;
		
		if (x>y && x>z) {
			System.out.println("X is the largest number");
			
		} else if (y>x&&y>z) {
			System.out.println("Y is the largest number");
		} else if (z>x&&z>y) {
			System.out.println("Z is the largest number");
		} else {
			System.out.println("Numbers are equal");
		}
		
	}

}
