package day32_classObject_constructors;

public class Rectangle {


	double length;
	double width;
	
	public void getArea() {
		System.out.println(length*width);
	}
	
//constructor	
	
	public Rectangle(double a,double b){
		length=a;
		width=b;
	}
	

}
