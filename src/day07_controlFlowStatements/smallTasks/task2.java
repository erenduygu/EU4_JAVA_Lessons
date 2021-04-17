package day07_controlFlowStatements.smallTasks;

public class task2 {

	public static void main(String[] args) {
		int hours; 
		double payrate;
		
		hours= 40;
		payrate=1000;
		
		if (hours>40) {
			
			payrate=payrate*1.5;
		}
		
		System.out.println("Payrate= " +payrate);
	}

}
