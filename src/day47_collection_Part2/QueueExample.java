package day47_collection_Part2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		queue.add("Mike");
		queue.add("Ozzy");
		queue.add("Jamal");
		queue.add("Asiya");

		System.out.println(queue);
		queue.remove();

		System.out.println(queue);
		
		queue.poll();

		System.out.println(queue);
		
		

		System.out.println(queue.peek());

	}

}
