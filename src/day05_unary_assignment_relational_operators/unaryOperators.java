package day05_unary_assignment_relational_operators;

public class unaryOperators {

	public static void main(String[] args) {
		
		
		
		int i1= +10;
		int i2= -100;
		int i3= - (i1+i2);
		
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		
		boolean flag=true;
		
		System.out.println(!flag);
		System.out.println(!!flag);
		
		int i=10, j=5;
		
		System.out.println(i++); // 10
		System.out.println(i); // 11
		
		System.out.println(--j);//4 
		System.out.println(j);//4
		
		i++;// i=i+1=12
		--j;// j=j-1=3
		
		System.out.println("i = " +i);
		System.out.println("j = " +j);
		

		int res = i++ + --j;// Post olursa (i++) sonraki line da aktif olacak yani=11
							// Pre olursa (i++) þimdiki line da aktif olacak yani=3
		
		System.out.println("res = " + res);
		
		
		
		
		
		
	}

}
