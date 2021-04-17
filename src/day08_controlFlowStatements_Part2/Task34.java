package day08_controlFlowStatements_Part2;

public class Task34 {

	public static void main(String[] args) {

			int math, geo, history;

				math=70;
				geo=90;
				history=90;

				double average=(math+geo+history)/3;
				
				System.out.println("Average is " + average);

		if (average>=0 && average<60) {
			System.out.println("Grade is \"F\"");
			
		} else if (average>=60 && average<70) {
			System.out.println("Grade is \"D\"");
			
		}else if (average>=70 && average<80) {
			System.out.println("Grade is \"C\"");
			
		}else if (average>=80 && average<90) {
			System.out.println("Grade is \"B\"");
			
		}else if (average>=90 && average<=100) {
			System.out.println("Grade is \"A\"");
			
		}
	}

}
