package day36_StaticClassMembers;

public class CampusTest {

	public static void main(String[] args) {

		Campus c1 = new Campus("Mc Lean");
		Campus c2 = new Campus("Arlington");
		
		System.out.println(Campus.country);
	}

}
