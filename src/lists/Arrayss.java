package lists;

import java.util.Arrays;

public class Arrayss {
	public static void main(String[] args) {
		
		String [] jobIds=new String[4];
		jobIds[0]="BA";
		jobIds[1]="QA";
		jobIds[2]="DEV";
		jobIds[3]="PO";
		
		System.out.println(jobIds);
			for (String string : jobIds) {
				System.out.println(string);
			}
		
		//System.out.println(java.util.Arrays.toString(jobIds));   if class name is "Arrays"
		System.out.println(Arrays.toString(jobIds));	
		System.out.println(Arrays.asList(jobIds));	
			
		jobIds[4]="SM";
		System.out.println(Arrays.toString(jobIds));
		//to resize you can copy it but it is a lot of work. 
		String [] newNJobs=Arrays.copyOf(jobIds, 5);
		newNJobs[4]="SM";
		System.out.println(Arrays.toString(newNJobs));
		
		System.out.println(newNJobs.length);
		Arrays.sort(newNJobs);
		System.out.println(Arrays.binarySearch(newNJobs, "QA"));   // it needs to sort first
			
			
			
			
			
			
			
	}
	

}
