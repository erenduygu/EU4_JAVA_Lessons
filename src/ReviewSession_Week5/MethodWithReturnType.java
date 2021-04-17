package ReviewSession_Week5;

public class MethodWithReturnType {

	public static void main(String[] args) {

		
		String message= getMyMotto();
		System.out.println("My favorite motto is "+ message);
		
		
/*		double f=54;
		double c= (f-32)*5/9;
		System.out.println(c);
*/		double tempInVA = fahrenheitToCelcius(54);
System.out.println("54.9 Fahrenheit in US is" + fahrenheitToCelcius(54)+ "Celcius in Eu");

System.out.println(fahrenheitToCelcius(81));
		
	}public static double fahrenheitToCelcius(double f) {
		double c= (f-32)*5/9;
		
		return c;
		
	}

	// Temperature converter f-->>C
	
	// C=(F-32)*5/9
	
	
	public static String getMyMotto() {
		// TODO Auto-generated method stub
		return "Happy wife happy life";
	}

}
