package day37_Inheritence;

public class Student extends Person {

	int studentID;
	String termClass;
	
	public void code(String lang) {
		System.out.println(name+" is coding "+ lang);
	}
	public void attendClass(String lang) {
		System.out.println(name+" is attending "+ termClass+ " class");
	}
	
}
