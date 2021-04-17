package day36_StaticClassMembers;

public class CountableTest {

	public static void main(String[] args) {

		int objectCount;
		
		Countable obj1=new Countable();
		Countable obj2=new Countable();
		Countable obj3=new Countable();
		
		objectCount=obj1.getInstanceCount();
		//objectCount=obj2.getInstanceCount();
		
		System.out.println(objectCount);
		System.out.println(Countable.instanceCount);
		System.out.println(obj1.instanceCount);
		System.out.println(obj2.instanceCount);
		
		System.out.println(obj3.instanceCount);
		
		System.out.println(obj1.getInstanceCount());
		
		
		
	}

}
