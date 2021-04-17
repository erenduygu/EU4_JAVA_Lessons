package day11_Loops;

public class Task51_ClockwithNestedLoop {

	public static void main(String[] args) {

		for (int hours = 1; hours <= 12; hours++) {
			for (int minutes = 0; minutes <= 59; minutes++) {
				for (int seconds = 0; seconds <= 59; seconds++) {
					// System.out.println(hours+":"+minutes+":"+seconds);
					// window preferences run
					// debug console limit console output
					System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
				}
			}
		}
	}
}

/*
 * for (int i=1;i<=12;i++) {
 * 
 * for (int j=00;j<=59;j++) {
 * 
 * for (int k=00;k<=59;k+=1) {
 * 
 * System.out.print(i+":"+j+":"+k+"\n");
 * 
 * }}
 * 
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 * }
 */
