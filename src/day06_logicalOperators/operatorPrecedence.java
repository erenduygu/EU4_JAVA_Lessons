package day06_logicalOperators;

public class operatorPrecedence {

	public static void main(String[] args) {

int appleCount=20;
int orangeCount=30;
int pearCount = 30;

boolean com = appleCount<orangeCount || orangeCount>=pearCount;

// 20<30 || 30>=30 => T || ------ = T
		
System.out.println(com);


String OutsideWeather;
int Degree;
OutsideWeather = "Shiny";
Degree=70;

boolean com2= (!(OutsideWeather=="Rainy" || Degree==70)); // (!( F || T = T)) = !T = F

System.out.println(com2);


int b=2;

boolean res= ++b ==2 || --b==2 && --b==2;

System.out.println(res);


boolean x = true, z= true;
int y=20;

x= (y !=10) || (z=false);  // T || -----= T  (NOTE: z=false is assignment)
System.out.println(x);


	}

}
