package day40_accessModifiers_Final_Hiding2;

public class Kangaroo extends Marsupial {
	/*
	@Override
	public boolean isBiped() {
		return true;
	}
	*/
	
	
	public static boolean isBiped() {
		return true;
	}
	
	
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs:" + isBiped());
	}

}
