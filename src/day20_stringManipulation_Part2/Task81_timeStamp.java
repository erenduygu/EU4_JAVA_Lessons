package day20_stringManipulation_Part2;

public class Task81_timeStamp {

	public static void main(String[] args) {

		String date = "10/10/2019 14:59:00";

		String timeStamp = date.replace("/", "").replace(" ", "").replace(":", "");
		System.out.println(timeStamp);

		String time = "10/10/2019 15:00:00";
		System.out.println(timeStamp(time));
	}

	

	public static String timeStamp(String time) {
		time = time.replace("/", "").replace(" ", "").replace(":", "");

	return time;
	}
}
