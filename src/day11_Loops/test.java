package day11_Loops;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		  plus();
	  }
	  
	  public static void plus(){
	     
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("enter first number:");
	    int firstNumber=scan.nextInt();
	    
	    System.out.println("enter second number:");
	    int secondNumber=scan.nextInt();
	    
	    int total=firstNumber+secondNumber;
	    System.out.println(total);
	    
	  }
	  
	}