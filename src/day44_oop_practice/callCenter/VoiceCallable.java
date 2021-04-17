package day44_oop_practice.callCenter;

public interface VoiceCallable {

	boolean CAN_CALL = true; // public static final

	void call(String contact); // public abstract

	public static void decline() {
		System.out.println("Mike declined voice call...");

	}

	public default void accept() {
		System.out.println("Mike finally accepted voice call...");

	}

}
