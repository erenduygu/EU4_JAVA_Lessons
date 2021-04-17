package day36_StaticClassMembers;

public class Student {

	String name;
	int age;
	int idNUmber;
	static String school="Cybertek";
	
	public Student(String name, int age, int idNUmber) {
		this.name = name;
		this.age = age;
		this.idNUmber = idNUmber;
	
	}


	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idNUmber=" + idNUmber + ", school=" + school + "]";
	}
	
	
}

