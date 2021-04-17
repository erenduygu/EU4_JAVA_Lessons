package day44_oop_practice.shapes;

public class Square extends Shape{

	
	public Square() {
		type="Square";
		
	}

	@Override
	public void draw() {
	System.out.println("Drawing a Square");
	}
	
	public void squareMethod() {
		System.out.println("square method");
	}
	
}
