package day32_classObject_constructors;

import java.util.Arrays;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1=new Student("Mike", 17, 'M', 2016, "Java");
		Student s2=new Student("Smith", 18, 'M', 2015, "JS");
		Student s3=new Student("Mary", 19, 'F', 2017, "TS");
		
		
		s1.attendLecture();
		s2.attendLab();
		System.out.println(s1.name);
		System.out.println(s2.age);
		
		
		

		
	}

}
