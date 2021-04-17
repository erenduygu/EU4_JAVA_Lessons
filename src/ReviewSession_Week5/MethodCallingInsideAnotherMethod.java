package ReviewSession_Week5;

public class MethodCallingInsideAnotherMethod {

	public static void main(String[] args) {

		/*
		 * wakeUp()
		 * 
		 * prepareTheKids makeBreakfast() feedTheKids dropTheKidsToSchool()
		 *
		 * workAndLearn() work() attendClass()
		 *
		 */
		wakeUp();
		System.out.println();
		prepareTheKids();
		
		
		System.out.println("------------------------------");
		workAndLearn();
	}

	public static void wakeUp() {
		System.out.println("open one eye");
		System.out.println("close it and back to sleep");
		System.out.println("throw the alarm an wake up and drink cafe");

	}

	public static void prepareTheKids() {

		System.out.println("prepare the kids method start");

		makeBreakfast();
		feedTheKids();
		dropTheKidsToSchool();

		System.out.println("prepare the kids method end");

	}

	public static void makeBreakfast() {

		System.out.println("make a turkish cafe or tea");
		System.out.println("cereal,egg,milk,toast");

	}

	public static void feedTheKids()

	{
		System.out.println("feed the kids with love and nice food");

	}

	public static void dropTheKidsToSchool() {
		System.out.println("pop up in the car");

	}

	public static void workAndLearn() {

		work();
		attendClass();
	}

	public static void work() {
		System.out.println("working as an SDET");
	}

	public static void attendClass() {
		System.out.println("Attending class at Cybertek");
	}

}
