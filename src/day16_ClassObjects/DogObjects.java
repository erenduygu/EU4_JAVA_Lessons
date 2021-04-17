package day16_ClassObjects;

public class DogObjects {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		
		
		dog1.age = 10;
		dog1.breed = "Maltese";
		dog1.color = "Red";
		dog1.name = "Rover";

		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed);
		
		dog1.barking();
		dog1.hungry();
		dog1.sleeping();
		
		dog2.age=5;
		dog2.color="Black";
		dog2.name="Tiger";
		dog2.breed="Kangal";
		
		System.out.println("---------------------");
		System.out.println(dog2.age);
		System.out.println(dog2.color);
		System.out.println(dog2.breed);
		
		dog2.hungry();
		dog2.sleeping();
		dog2.barking();
				
		

	}

}
