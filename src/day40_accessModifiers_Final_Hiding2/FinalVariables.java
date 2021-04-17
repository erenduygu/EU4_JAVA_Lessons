package day40_accessModifiers_Final_Hiding2;

import day36_StaticClassMembers.Campus;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE=600;
	public final int MODEL_3_MAXSPEED;
	final static public  int MODEL_X_PASSANGERS;
	public static final String ADMIN_USERNAME = "OZZY";
		
	public FinalVariables() {

		MODEL_3_MAXSPEED = 200;
	}
	
	static {
		MODEL_X_PASSANGERS=7;
	}

	public static void main(String [] args) {
		final int SSN;
		SSN=66;
		
		FinalVariables finalVars= new FinalVariables();
		System.out.println(finalVars.ROADSTER_MAX_RANGE);
		System.out.println(finalVars.MODEL_3_MAXSPEED);
		System.out.println();
		
		
	}





	

}
