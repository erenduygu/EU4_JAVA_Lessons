package day08_controlFlowStatements_Part2;

public class ifElseIfElse {

	public static void main(String[] args) {

		int day=7;
		
		if (day==1) {
			System.out.println("Monday");
		}else if (day==2) {
			System.out.println("Tuesday");
		}else if (day==3) {
			System.out.println("Wednesday");
		}else if (day==4) {
			System.out.println("Thursday");
		}else if (day==5) {
			System.out.println("Friday");
		}else if (day==6) {
			System.out.println("Saturday");
		}else if (day==7) {
			System.out.println("Sunday");
		}else {
			System.out.println("This is not a valid day");
	}
//**************************************************
		
		int age=2;
		
		if(age<2||age>18) {
			System.out.println("It is not eligible for school");
			
		}else if(age==2) {
			System.out.println("toddler");
			
		}else if(age>=2&&age<=5) {
			System.out.println("early childhood");
			
		}else if(age==6||age==7) {
			System.out.println("young reader");
			
		}else if(age>=8&&age<=10) {
			System.out.println("elementary");
			
		}else if(age==11||age==12) {
			System.out.println("middle");
			
		}else if (age==13) {
		System.out.println("impossible");
		}
		else if (age>=14&&age<=16) {
			System.out.println("high school");
		}else if (age==17||age==18){
			System.out.println("scholar");
		}
		}
}