package day11_Loops;

public class WhileLoop {

	public static void main(String[] args) {
//print 0-10
		
		/*int i=1;
		
		while(i<=10) {
			System.out.println(i);i++;
		}*/
		
		
		//using a loop, iterate until we have 10 students in the room
		
		int numberOfStudents=1;
		
		while (numberOfStudents<=10) {
			System.out.println("Student "+numberOfStudents);numberOfStudents++;
		}
		
		
		
		//print 11-0
		
				int i=11;
				
				while(i>=0) {
					System.out.print(i+" ");i--;
				}
	}

}
