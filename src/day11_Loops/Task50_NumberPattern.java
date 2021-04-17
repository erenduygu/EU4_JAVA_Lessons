package day11_Loops;

public class Task50_NumberPattern {

	public static void main(String[] args) {
		
		int demandedRows=5;
	
						
				
		
		for (int row=1;row<=demandedRows;row++) {
		
			for (int column=1;column<=row;column++)	{
				
				System.out.print(column+" ");
			}
			
			System.out.println("");
		}
		
		
	}

}
