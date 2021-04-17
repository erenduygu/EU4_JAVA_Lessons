package ReviewSession_Week8;

import java.util.Arrays;

public class AnagramArrays {

	public static void main(String[] args) {

		/*- Create a method that will accept two Strings and determine if they are Anagrams of each other
		 *  (return boolean)
		 *  
		 *  listen -- l++ i++ s++
		 *  silent -- s-- i-- l--
		 *  
		 *  if at the end we find 0 it will say that is an anagram
		 *  
		 *  26 - > char [] to be 26 counters
		 *  
		 *  a-- 0
		 *  z-- 25
*/
	
		System.out.println(isAnagram("listen","silent"));

	}
	
	public static boolean isAnagram (String one, String two) {
		
		if(one.length() != two.length()) {
			return false;
		}
		
		int [] count = new int[26]; 
		
		for(int i=0; i < one.length(); i++) {
			
			char charOne = one.charAt(i); // 'a' -> 97 // 'b' -> 98
			char charTwo = two.charAt(i);
			
			//count[0]  = count[0] + 1;
			// count[0] = 0 + 1  -> 1
			// count[0] = 1 + 1 -> 2
			
			count[charOne - 97] = count[charOne - 97] + 1;
			count[charTwo - 97] = count[charTwo - 97] - 1;
			
		}
		//System.out.println(Arrays.toString(count));
		return Arrays.equals(count, new int[26]);
	}
	
	
}