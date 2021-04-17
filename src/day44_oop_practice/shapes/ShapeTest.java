package day44_oop_practice.shapes;

public class ShapeTest {

	public static void main(String[] args) {

		//create 4 shapes, using polymorphism
		
		Shape triangle= new Triangle();
		Shape square= new Square();
		Shape diamond= new Diamond();
		Object shapeObject= new Shape();
		
		square.draw();
		triangle.draw();
		
		((Square)square).squareMethod();
		
		
	}

}
