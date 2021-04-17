package reviewSession_Week10;

public class String5_FrequencyOfCharacter {

	public static void main(String[] args) {
		
		String str = "aaabbbbcacaaaaaa";

		int count = 0;

		for (String each : str.split("")) {
			if (each.equals("a")) {
				count++;
			}
		}

		System.out.println(count);

	}

}

/*
 * frequency of one character
 * 
 */
