package day13_Methods_Part1;

public class Task66_TravelDistance {

	public static void main(String[] args) {

		
		double d=distance(100,6);
		System.out.println(distance(90,10));
		
		if (d>500) {
			System.out.println("You spend too much gas");
		}else {
			System.out.println("You spent OK gas");
		}
		
	}public static double distance (double speed,int time) {
		double distanceTraveled=speed * time;
		return distanceTraveled;
		
		
	}

}
