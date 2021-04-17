package day11_Loops;

public class LoopBreak {

	public static void main(String[] args) {

		
		int i=0;
		while (i<15) {i++;
		
		if (i<=5) {System.out.println("Skipping Number "+i);
		continue;
		}
		System.out.println("Number= "+(i));
		
		if (i>=10) {System.out.println("Breaking at "+(i+1));
		break;}
		
	}}}


