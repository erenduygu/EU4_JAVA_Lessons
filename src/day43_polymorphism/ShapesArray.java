package day43_polymorphism;

public class ShapesArray {

	public static void main(String[] args) {

		Shape[] shapes= new Shape[3]; // object array holding 3 object.
		
		shapes[0]= new Square();
		shapes[1]= new Triangle();
		shapes[2]= new Circle();  // polymorphism
		
		
		for (Shape sh: shapes) {
			
			//System.out.println(sh.getClass().getName());
			System.out.println(sh.getClass().getSimpleName());

			
			//sh.draw();
		}


		
	}

}
