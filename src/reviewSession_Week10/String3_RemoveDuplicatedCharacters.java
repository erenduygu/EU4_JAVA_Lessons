package reviewSession_Week10;

public class String3_RemoveDuplicatedCharacters {

	public static void main(String[] args) {
		
		String str = "aabcca";
					//"aabcca";
		
		String result = "";  // "abc"
		
							// [a, a, b, c, c, a]	
		for(String each  :   str.split("")  ) {
			
			if( ! result.contains(each) ) {
				result += each;
			}
			
		}
		
		
		System.out.println(result);
					
		
		
	}
	
}

/*
Remove duplicated characters
	"aabcca"
	
	"abc"
*/