package day11_Loops.AssesmentTest;

public class Task55_do_while_break {

	public static void main(String[] args) {

		int i = 0;
		outer: do {
			i = 8;
			inner: while (true) {
				System.out.println(i--);
				if (i == 4) {
					break outer;
				}
			}

		} while (true);

	}

}
