package ReviewSession.Week4;

public class LoopWithLettersChar {

	public static void main(String[] args) {

		for (char j = 'A'; j <= 'Z'; j++) {

			for (char i = 'A'; i <= j; i++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
	}

}
