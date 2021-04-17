package day07_controlFlowStatements.smallTasks;

public class task28_Revenue {

	public static void main(String[] args) {

		double revenue, price, quantity, discount;
		
		price=100;
		quantity=2000;
		discount=0;
		revenue=price*quantity;
		
		
		
		if (revenue>5000) {
			discount= revenue*0.1;
			revenue=revenue-discount;
			
			}
		
		System.out.println("Discount on price= " + discount );
		System.out.println("Net revenue on product= " + revenue);
		}

}
