package day36_StaticClassMembers;

public class Dog {

	private static String name;

	public Dog(String name) {
	
		this.name = name;
	}

	
	public String toString() {
		return name;
	}

}
