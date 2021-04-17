package day11_Loops.AssesmentTest;

public class Ternary {

	public static void main(String[] args) {

int amount=10;
String result= amount<=2?"Couple": amount>2&&amount<=5?"a few": amount<=5?"several":"many";
System.out.println(result);
	}

}
