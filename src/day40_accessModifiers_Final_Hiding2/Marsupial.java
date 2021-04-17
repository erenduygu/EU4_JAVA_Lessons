package day40_accessModifiers_Final_Hiding2;

import day30_wrapperClass_JavaSertQuestion.varArgs;

public class Marsupial {
	/*
	public boolean isBiped() {
		return false;
	}
	*/

	
	
	public static boolean isBiped() {
		return false;
	}
	
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on the two legs:" + isBiped());
	}

}
