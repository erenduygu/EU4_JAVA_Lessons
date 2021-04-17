package day20_stringManipulation_Part2;

public class String_indexOf_2 {

	public static void main(String[] args) {

		// indexOf with 2 values
		
		String list="html-selenium-angular-jenkins-grid";
		
		
		int firstDash=list.indexOf('-');
		
		System.out.println(firstDash);
		
		int seconddash = list.indexOf('-',5);
		System.out.println(seconddash);
		
		int thirdDash=list.indexOf("-", seconddash+1);
		System.out.println(thirdDash);
		
		int lastDash=list.lastIndexOf("-");
		System.out.println(lastDash);
		
		
		for (int i=0;i<list.length();i++) {
			if (list.charAt(i)=='-') {
				System.out.println(i);
			}
		}
	}

}
