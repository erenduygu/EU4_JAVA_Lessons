package day30_wrapperClass_JavaSertQuestion;

public class Task97_WelcometoCoreJava {

	public static void main(String[] args) {


		String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		
		
		String word="";
		for (int i = 0; i < str.length(); i++) {
			
		
			char ch=str.charAt(i);
			
			if (Character.isAlphabetic(ch)||ch==' ') {
				word= word+ch;
			}
		}System.out.println(word);
	}

}

/*String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";

System.out.println(filterString(str));

}

public static String filterString(String s) {

String str = "";

for(int i=0;i<s.length();i++) {
	
	if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == ' ') {
		
		str = str + s.charAt(i);
	}
	
}

return str;


}

}*/