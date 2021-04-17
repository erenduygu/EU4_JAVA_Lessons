package ReviewSession_Week6;

public class Task1_String1 {

	public static void main(String[] args) {

		String str = "x";

		if (str.isEmpty()) {
			System.out.println("Empty String");
		} else if (str.length() == 1) {
			System.out.println(str.concat(str));
		} else if (str.length() > 1) {
			System.out.println(str.substring(0, 2));
		}
	}
}
