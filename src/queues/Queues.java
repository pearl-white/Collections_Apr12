package queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

public static void main(String[] args) {
	
	Queue <String> jobIds=new PriorityQueue<>();
	
	jobIds.add("QA");
	jobIds.add("BA");
	jobIds.add("DEV");
	jobIds.add("SM");
	jobIds.add("QA");
	
	System.out.println(jobIds);
	System.out.println(jobIds.element());
	jobIds.remove();
	
	
	System.out.println(jobIds);
	System.out.println(jobIds.peek());
	
	for (String string : jobIds) {
		System.out.println(string);
	}
}
	
}
