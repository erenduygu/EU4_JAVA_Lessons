package day44_oop_practice.shapes;

public class Triangle extends Shape{
	
	
	public Triangle() {
		type="Triangle";
		
	}

	@Override
	public void draw() {
	System.out.println("Drawing a Triangle");
	}
	

}
