package day07_controlFlowStatements.smallTasks;

public class ifElse_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int score=60;
		
		if (score>= 70) {
			
			System.out.println("Excellent");
			System.out.println("You passed with grade A");
			
		}else {
			System.out.println("You Failed");
		}

		
		//********************************
		
		
		int sales, bonus;
		double commisionRate, salary;
		sales=5001;
		salary=10000;
		
		if (sales>5000) {
			
			bonus=500;
			commisionRate=1.12;
			
			salary=salary*commisionRate+bonus;
			
		}else {
			bonus=100;
			commisionRate=1.10;
		}
		
		System.out.println("Salary = " + salary);

	}

}
