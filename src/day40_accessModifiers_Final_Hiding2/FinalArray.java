package day40_accessModifiers_Final_Hiding2;

public class FinalArray {
	
	public static void main(String[] args) {
		
		final int[] TEAMS= {11,11};
		System.out.println(TEAMS[0]);
		
		TEAMS[0]=15;
		System.out.println(TEAMS[0]);
		
		int[] nums= new int []{20,20,40};
		nums= new int[] {10,15,100};
	}

}
