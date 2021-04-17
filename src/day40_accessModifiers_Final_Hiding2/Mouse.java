package day40_accessModifiers_Final_Hiding2;

public class Mouse extends Rodent{
	
protected int tailLength = 8;
	
	public void getMouseDetails() {
		System.out.println("tail:" + tailLength + ",parentTail:" + super.tailLength);
	}
	

}