package day08_controlFlowStatements_Part2;

public class scoresFromOZHAN {

	public static void main(String[] args) {
int quiz,midterm,finals;
quiz=80;
midterm=68;
finals=90;

double average=(quiz+midterm+finals)/3;

System.out.println("Quiz score: "+quiz+"\nMid-term score: "+midterm+"\nFinal score: "+finals+"\nAverage: " +average);

		if (average>=90) {
			System.out.println("Grade = A");
			
		}else if  (average>=70&&average<90) {
			
		System.out.println("Grade = B");
		
		
		} else if  (average>=50&&average<70) {
		
		System.out.println("Grade = C");
		}
			else if  (average<50) {
		
		System.out.println("Grade = F");
		} else {
			
			System.out.println("This is not a valid score");
		}

	}

}
