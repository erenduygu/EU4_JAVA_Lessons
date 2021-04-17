package day13_Methods_Part1;

public class Task69_PrimeNumber {

	public static void main(String[] args) {

		int number=27;
		if(isPrime(number)) {
			System.out.println(number+" is a prime number");
			}else {
				System.out.println(number+" is not a prime number");
			}
		}
	

	public static boolean isPrime(int num) {

		boolean flag = true;

		if (num == 0 || num == 1) {
			flag = false;

		} else {
			for (int i = 2; i < num; i++) {

				if (num % i == 0)

					flag = false;
				
			}
		}
		return flag;
	}
}
