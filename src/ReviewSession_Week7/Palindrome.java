package ReviewSession_Week7;

public class Palindrome {

	// handles even and odd
	// dad 3/2 1
	// anna 4/2 2
	public static void main (String[] args) {
	
		
		String x="EyEdipAdanadaPideYe";
		x.toLowerCase();
	System.out.println(isPalindrome("racecar"));
	System.out.println(isPalindrome("racingcar"));
	System.out.println(isPalindrome(x.toLowerCase()));
	System.out.println(x.toUpperCase());


	
	
	
// 0 r != r
// 1 a != a
// 2 c != c
// 3 -> 7/2 = 3 < 3 --> loop stop

	}public static boolean isPalindrome(String str) {

		for (int i = 0; i < str.length() / 2; i++) {

			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}

		}

		return true;
	}

}