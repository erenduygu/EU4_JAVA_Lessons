package day36_StaticClassMembers;

public class DinnerTest {

	public static void main(String[] args) {

		Dinner mom= new Dinner();
		Dinner kid= new Dinner();
		Dinner dad= new Dinner();
		
		System.out.println("Total slice:"+Dinner.pizzaSlice);
		
		mom.takeASlice();
		kid.takeASlice();
		dad.takeASlice();
		
		System.out.println(Dinner.pizzaSlice);
		
		mom.takeASlice(3);
		kid.takeASlice(2);
		
		System.out.println(Dinner.pizzaSlice);
		System.out.println(Math.PI);

	}

}
