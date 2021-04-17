package day34_constructors_passingObjectToMethod;

public class AppleTest {

	public static void main(String[] args) {

		Apple a1=new Apple();
		a1.color="White";
		
		System.out.println(a1.color);
		
		System.out.println(changeApple(a1));
		
		System.out.println(methodObject().color);
		
	}
	public static String changeApple(Apple b1) {
			
		b1.color="Yellow";
		
		return b1.color;
		
		
	} 
	public static Apple methodObject() {
		Apple a1= new Apple();
		return a1;
	}
}
