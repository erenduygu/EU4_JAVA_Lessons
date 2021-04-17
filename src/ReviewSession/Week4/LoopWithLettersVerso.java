package ReviewSession.Week4;

public class LoopWithLettersVerso {

	public static void main(String[] args) {

		for (char row = 'Z'; row >= 'A'; row--) {
			for (char i = 'A'; i <= row; i++) {
				System.out.print(i + " ");

			}System.out.println(" ");

		}
	}

}
