package day32_ArrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class CustomMethods {

	public static void main(String[] args) {

		ArrayList<Integer> numsList = new ArrayList<>();

		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);

		printList(numsList);

		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);

		System.out.println("----------------");

		double sum = sumList(doubleList);
		System.out.println(Math.ceil(sum));

		ArrayList<Integer> list = getList(100);
		System.out.println(list.toString());

		ArrayList<Integer> rList = getRandomList(20);
		System.out.println(rList.toString());

		ArrayList<String> strNums = new ArrayList<>();

		strNums.add("123");
		strNums.add("33");
		strNums.add("12");

		ArrayList<Integer> converted = convertToIntList(strNums);
		System.out.println(converted);

	}

	public static ArrayList<Integer> convertToIntList(ArrayList<String> str) {

		ArrayList<Integer> intNums = new ArrayList<>();

		for (String each : str) {

			intNums.add(Integer.parseInt(each));

		}
		return intNums;

	}

	public static ArrayList<Integer> getRandomList(int number) {

		ArrayList<Integer> nums = new ArrayList<>();

		Random rn = new Random();

		for (int i = 1; i <= number; i++) {
			int no = rn.nextInt(100);
			nums.add(no);
		}
		return nums;

	}

	public static ArrayList<Integer> getList(int number) {

		ArrayList<Integer> nums = new ArrayList<>(number);
		for (int i = 1; i <= number; i++) {

			nums.add(i);
		}
		return nums;

	}

	public static void printList(ArrayList<Integer> nums) {
		for (Integer n : nums) {
			System.out.print(n + " ");

		}
	}

	public static double sumList(ArrayList<Double> nums) {

		double total = 0;
		for (Double each : nums) {
			total += each;
		}
		return total;

	}

}
