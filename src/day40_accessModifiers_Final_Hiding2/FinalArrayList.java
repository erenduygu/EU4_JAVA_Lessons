package day40_accessModifiers_Final_Hiding2;

import java.util.ArrayList;

public class FinalArrayList {

	public static void main(String[] args) {


		final ArrayList<String> COLORS =new ArrayList<>();
		
		COLORS.add("Orange");
		COLORS.add("Red");
		COLORS.remove(0);
		
		//COLORS = new ArrayList<>(); We cannot create a new Arraylist


		
	}

}
