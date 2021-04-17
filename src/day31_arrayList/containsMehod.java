package day31_arrayList;

import java.util.ArrayList;

public class containsMehod {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
				
		System.out.println(list1);

		
		System.out.println("-------------");

		//pointing values
		
		ArrayList<String> list2=list1;
		System.out.println(list2);
		
		System.out.println("-------------");

		// cOpy all values from List1
		
		ArrayList<String>months=new ArrayList<>(list1);
		months.add("Jan");
		months.add(0,"Feb");
		System.out.println(months);
		
		
		System.out.println("-------------");

		System.out.println(months.contains("Jan"));
		System.out.println(months.contains("Dec"));
		System.out.println("-------------");
		
		// check if Feb is in second position
		
		if(months.get(1)!="Feb") {
			System.out.println(true);
		}
		
		System.out.println(months.get(1).equals("Feb"));
		System.out.println(months.get(1)=="Feb");
		System.out.println(months.indexOf("Feb")==1);
		
		
		System.out.println("-------------");
		
		
		list1.add("Jan");
		System.out.println("List1:"+list1);
		System.out.println("Months:"+months);

		if (months.containsAll(list1)) {
			System.out.println("Months has all list1");
		}else {
			System.out.println("Some valus are missing");
		}

		
		
		
		
		
	}

}
