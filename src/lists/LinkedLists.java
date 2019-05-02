package lists;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedLists {
public static void main(String[] args) {
	
	
	LinkedList<String> jobIds=new LinkedList();
	jobIds.add("QA");
	jobIds.add("DEV");
	jobIds.add("BA");
	jobIds.add("SM");
	
	System.out.println(jobIds);
	
	jobIds.addFirst("PO");
	System.out.println(jobIds);

	jobIds.removeLast();
	System.out.println(jobIds);
	
	//jobIds.clear();
	System.out.println(jobIds);
	
	Collections.sort(jobIds);
	System.out.println(jobIds);
	
	
	
}
}
