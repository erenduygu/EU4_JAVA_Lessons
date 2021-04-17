package day35_encapsulation;

public class Person {

	
		// instance variables
		String name;
		private int age;
		char gender;
		
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
	
		public Person(String name, int age, char gender) {
		
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
		}
	
		
}
