package day34_constructors_passingObjectToMethod;

public class Calculator {

	Floor floor;
	Carpet carpet;

	public Calculator(Floor floor, Carpet carpet) {
		this.floor = floor;
		this.carpet = carpet;

	}

	public double getTotalCost() {
		
		double calculatedTotalCost = floor.getArea() * carpet.getCost();
		return calculatedTotalCost;
	}

}