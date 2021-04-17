package day30_wrapperClass_JavaSertQuestion;

public class Task96_temperatureStringtoInteger {

	public static void main(String[] args) {

		
			String str1="Today weather is sunny and 72 degree. It is a perfect day to practice java.";
			
			String [] str= str1.split(" " );

			double degree=Double.parseDouble(str[5]);
			double celcius=(degree-32)/1.8;
			
			System.out.println(degree+" degree is equal to "+ Math.round(celcius)+" celcius");
			
			
		
			/*String str1 = "Today weather is sunny and 89 degree. It is a perfect day to practice java.";

		String[] arr = str1.split("and ");

		arr = arr[1].split(" degree");

		String degree = arr[0];

		double degreeF = Double.parseDouble(degree);

		double degreeC = (degreeF - 32) * 5/9;

		System.out.println(degreeF + " degree is equal to " + Math.round(degreeC) + " celcius");*/


	}

}


