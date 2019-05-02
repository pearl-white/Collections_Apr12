
package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {
	public static void main(String[] args) {
	
	Set<String> jobIds=new HashSet();
	jobIds.add("QA");
	jobIds.add("BA");
	jobIds.add("DEV");
	jobIds.add("SM");
	
	System.out.println(jobIds.add("QA"));   //prints false cuz you already have it.
	
	
	System.out.println(jobIds.size());

	Iterator <String> it= jobIds.iterator();
	while (it.hasNext()){
		String id= it.next();
		System.out.println(id);
	}
	
	
	jobIds.remove("BA");
	System.out.println(jobIds);
	
	
	
 }}
