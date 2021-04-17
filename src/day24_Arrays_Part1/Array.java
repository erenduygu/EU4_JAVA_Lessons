package day24_Arrays_Part1;

public class Array {

	public static void main(String[] args) {

		int[] myList = { 10, 20, 30, 40, 50, 60 };

		String[] myArray = { "Apple", "Orange", "Watermelon" };

		System.out.println(myList[0]);
		System.out.println(myList[1]);
		System.out.println(myList[2]);
		System.out.println(myList[3]);
		System.out.println(myList[0]);
		
		System.out.println(myArray.length);
		System.out.println(myList.length);


			for (int i = 0; i < myList.length; i++) {
				System.out.println(myList[i]);
			}
			for (int i = 0; i < myArray.length; i++) {
				System.out.println(myArray[i]);
			}
			
			
			
			int[] scores= {80,90,100,35,60,72,64,30,10};
			
			
			int sum=0;
			for (int i = 0; i < scores.length; i++) {
				sum+=scores[i];
				
			}System.out.println("Sum is: "+sum);
			System.out.println("Total element in Array is: "+ scores.length);
			System.out.println("average is:"+sum/scores.length);
	}

}
