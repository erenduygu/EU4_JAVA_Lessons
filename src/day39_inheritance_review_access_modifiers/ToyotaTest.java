package day39_inheritance_review_access_modifiers;

public class ToyotaTest {

	public static void main(String[] args) {

		Toyota toyota= new Toyota(36);
		toyota.steer(45);
		toyota.accelate(30);
		toyota.accelate(20);
		toyota.accelate(-40);
	}

}
