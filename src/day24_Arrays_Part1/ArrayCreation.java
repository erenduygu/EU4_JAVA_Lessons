package day24_Arrays_Part1;

public class ArrayCreation {

	public static void main(String[] args) {


		//Option 1
	
	int [] scores;
	scores=new int[3];
	

	//Option 2

int [] scores1=new int[4];
float [] numbers= new float [2];
char [] letters= new char[4];
long [] units= new long [50];

	
int [] number=new int[5];

number[0]=54;
number[1]=45;
number[2]=22;
number[3]=89;
number[4]=66;

System.out.println(number[0]);
System.out.println(number[1]);
System.out.println(number[2]);
System.out.println(number[3]);
System.out.println(number[4]);

int avgNumbers=(number[0]+number[1]+number[2]+number[3]+number[4])/5;

System.out.println(avgNumbers);
	
	}

}
