package day34_constructors_passingObjectToMethod;

public class Floor {
	static double width;
	static double length;

	public Floor(double width, double length) {

		if (width < 0) {
			this.width = 0;
		}
		if (length < 0) {
			this.width = 0;
		} else {

			this.width = width;
			this.length = length;
		}
	}

	public double getArea() {

		double area = width * length;
		return area;

	}

}
