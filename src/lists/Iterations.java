package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterations {

	public static void main(String[] args) {
		List<String> jobIds=new ArrayList<String>();
		jobIds.add("QA");
		jobIds.add("BA");
		jobIds.add("DEV");
		jobIds.add("PO");
		jobIds.add("SM");

		List<String> jobIds2=Arrays.asList("QA","BA","DEV","PO","SM");
		
		
		System.out.println(jobIds);
		for (int i = 0; i < jobIds.size(); i++) {
			System.out.println(jobIds.get(i));
		}
		
		
		System.out.println("======FOR EACH LOOP=====");

		for (String jobId : jobIds) {
			System.out.println(jobId);
		}
		
		
		
		System.out.println("======ITERATOR=====");
														//you can remove an item using Iterator. Modifiable.
		Iterator <String> jobIdIterator= jobIds.iterator();

		while(jobIdIterator.hasNext()){
			String id=jobIdIterator.next();   // when saved in variable it only jumps once.  
			
			if(id.equals("PO")){
				jobIdIterator.remove();
												//jobIds.add("PM");  		//you cannot add
			}else{
				System.out.println(id);     // if you put next here, it will skip each step.so put in variable
			}
		}
		
		System.out.println(jobIds);
		
		
								//System.out.println("======ITERATOR MODIFY=====");
								//You cannot remove using for each loop, code is bad. 
//		for (String jobId : jobIds) {
//			
//			if(jobId.equals("SM")){
//				jobIds.remove(jobId);
//				
//			}else{
//				System.out.println(jobId);
//			}}
		
									// it gives an error. 
		 
		
		
		
	}

}
