package ReviewSession_Week7;

public class PalindromeNumbers {

	public static void main(String[] args) {

		int num = 1254;
		int temp = num;
		int newNum=0;
		
		while(temp!=0) {
			newNum=newNum*10+temp%10;
			temp=temp/10;
			
		}System.out.println(newNum);
	}

}
