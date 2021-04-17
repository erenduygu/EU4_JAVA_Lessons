package day10_controlFlowStatements_Part4;

public class Task44_MPH_KPHconverter {

	public static void main(String[] args) {

	/*	
		System.out.println("KPH\t\tMPH");
		System.out.println("----------------------");
		
		for (int i=60;i<=130;i+=10) {
			
			System.out.println(i+"\t\t"+(i*0.6214));
			
		}*/

		//Constants
		
		final int STARTING_KPH=60;
		final int MAX_KPH=130;
		final int INCREMENT=10;
		
		//Variables;
		
		int kph;
		double mph;
		
		
		//Header
		
		System.out.println("KPH\t\tMPH");
		System.out.println("----------------------");
		
		for (kph=STARTING_KPH;kph<=MAX_KPH;kph+=INCREMENT) {
			
			mph=kph*0.6214;
			
			System.out.println(kph+"\t\t"+mph);
			
		}
		

		
		
	}

}
