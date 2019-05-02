package sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet2 {
public static void main(String[] args) {
	
	SortedSet<String> jobIds= new TreeSet();
	jobIds.add("QA");
	jobIds.add("BA");
	jobIds.add("PM");
	jobIds.add("DEV");
	jobIds.add("DEV");
	
	System.out.println(jobIds);
	
}
}
